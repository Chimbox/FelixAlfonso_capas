/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import objetosServicio.Fecha;
import java.util.List;
import negocio.Salida;
import persistencia.ConnectionFactory;

/**
 *
 * @author Invitado
 */
public class SalidaDAOImpl implements SalidaDAO{
    private final ConnectionFactory CONNECTION_FACTORY;
    private DestinoDAOImpl destinos;
    private BarcoDAOImpl barcos;

    public SalidaDAOImpl(ConnectionFactory CONNECTION_FACTORY) {
        this.CONNECTION_FACTORY = CONNECTION_FACTORY;
        destinos=new DestinoDAOImpl(CONNECTION_FACTORY);
        barcos=new BarcoDAOImpl(CONNECTION_FACTORY);
    }

    public ConnectionFactory getCONNECTION_FACTORY() {
        return CONNECTION_FACTORY;
    }
    
    @Override
    public Salida find(int id) throws Exception {
        final String SQL = "SELECT fecha_hora, barco_num_matricula, destino_id FROM salida WHERE id = ?";
        try (Connection connection = this.CONNECTION_FACTORY.getConnection();
                PreparedStatement statement = connection.prepareStatement(SQL);) {
            
            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    String strFecha=resultSet.getString("fecha_hora");
                    String strHora=strFecha.split(" ")[1];
                    Fecha fecha=new Fecha(strFecha.split(" ")[0]);
                    fecha.setHora(Integer.parseInt(strHora.split(":")[0]));
                    fecha.setMinuto(Integer.parseInt(strHora.split(":")[1]));
                    return new Salida(id, fecha, 
                            barcos.find(resultSet.getInt("barco_num_matricula")),
                            destinos.find(resultSet.getInt("destino_id")));
                }
                return null;
            }
        }
    }

    @Override
    public List<Salida> getAll() throws Exception {
        List<Salida> lstSalidas=new ArrayList<>();
        
        final String SQL = "SELECT id, fecha_hora, barco_num_matricula, destino_id FROM salida";
        try (Connection connection = this.CONNECTION_FACTORY.getConnection();
                PreparedStatement statement = connection.prepareStatement(SQL);) {

            try (ResultSet resultSet = statement.executeQuery()) {
                
                while (resultSet.next()) {
                    String strFecha=resultSet.getString("fecha_hora");
                    String strHora=strFecha.split(" ")[1];
                    
                    Fecha fecha=new Fecha(strFecha.split(" ")[0]);
                    fecha.setHora(Integer.parseInt(strHora.split(":")[0]));
                    fecha.setMinuto(Integer.parseInt(strHora.split(":")[1]));
                    
                    lstSalidas.add(new Salida(resultSet.getInt("id"),
                            fecha, 
                            barcos.find(resultSet.getInt("barco_num_matricula")),
                            destinos.find(resultSet.getInt("destino_id"))));
                }
                return lstSalidas;
            }
        }
    }

    public List<Salida> getAllWith(String referencia) throws Exception {
        List<Salida> lstSalidas=new ArrayList<>();
        
        final String SQL = "SELECT s.id, s.fecha_hora, s.barco_num_matricula, "
                + "s.destino_id FROM salida s INNER JOIN barco b "
                + "ON b.num_matricula=s.barco_num_matricula INNER JOIN destino d "
                + "ON d.id=s.destino_id WHERE b.nombre LIKE ? OR d.nombre LIKE ?";
        try (Connection connection = this.CONNECTION_FACTORY.getConnection();
                PreparedStatement statement = connection.prepareStatement(SQL);) {
            statement.setString(1, "%"+referencia+"%");
            statement.setString(2, "%"+referencia+"%");
            
            System.out.println(SQL);
            try (ResultSet resultSet = statement.executeQuery()) {
                
                while (resultSet.next()) {
                    String strFecha=resultSet.getString("fecha_hora");
                    String strHora=strFecha.split(" ")[1];
                    
                    Fecha fecha=new Fecha(strFecha.split(" ")[0]);
                    fecha.setHora(Integer.parseInt(strHora.split(":")[0]));
                    fecha.setMinuto(Integer.parseInt(strHora.split(":")[1]));
                    
                    lstSalidas.add(new Salida(resultSet.getInt("id"),
                            fecha, 
                            barcos.find(resultSet.getInt("barco_num_matricula")),
                            destinos.find(resultSet.getInt("destino_id"))));
                }
                return lstSalidas;
            }
        }
    }
    
    @Override
    public void add(Salida salida) throws Exception {
        final String SQL = "INSERT INTO salida(fecha_hora, barco_num_matricula, destino_id) VALUES(?, ?, ?)";
        try (Connection connection = this.CONNECTION_FACTORY.getConnection();
                PreparedStatement statement = connection.prepareStatement(SQL);) {

            statement.setString(1, salida.getFechaHora()+":"+salida.getFechaHora().getCadenaHora());
            statement.setInt(2, salida.getBarco().getNumMatricula());
            statement.setInt(3, salida.getDestino().getId());
            
            try{
                statement.executeUpdate();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void update(Salida salida) throws Exception {
        final String SQL = "UPDATE salida SET fecha_hora=?, barco_num_matricula=?, destino_id=? WHERE id=?";
        try (Connection connection = this.CONNECTION_FACTORY.getConnection();
                PreparedStatement statement = connection.prepareStatement(SQL);) {

            
            statement.setString(1, salida.getFechaHora()+":"+salida.getFechaHora().getCadenaHora());
            statement.setInt(2, salida.getBarco().getNumMatricula());
            statement.setInt(3, salida.getDestino().getId());
            statement.setInt(4, salida.getId());
            
            try{
                statement.executeUpdate();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void delete(int id) throws Exception {
        final String SQL = "DELETE FROM salida WHERE id=?";
        try (Connection connection = this.CONNECTION_FACTORY.getConnection();
                PreparedStatement statement = connection.prepareStatement(SQL);) {

            statement.setInt(1, id);
            
            try{
                statement.executeUpdate();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
