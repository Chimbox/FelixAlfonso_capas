/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.CallableStatement;
import persistencia.ConnectionFactory;
import negocio.Socio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lv1013
 */
public class SocioDAOImpl implements SocioDAO {

    private final ConnectionFactory CONNECTION_FACTORY;

    public SocioDAOImpl(ConnectionFactory CONNECTION_FACTORY) {
        this.CONNECTION_FACTORY = CONNECTION_FACTORY;
    }

    @Override
    public Socio find(int id) throws Exception {
        final String SQL = "SELECT id, dni, nombre, direccion "
                + "FROM socio WHERE id = ?";
        try (Connection connection = this.CONNECTION_FACTORY.getConnection();
                PreparedStatement statement = connection.prepareStatement(SQL);) {
            
            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return new Socio(resultSet.getInt("id"),
                            resultSet.getString("dni"),
                            resultSet.getString("nombre"),
                            resultSet.getString("direccion"));
                }
                return null;
            }
        }
    }

    @Override
    public List<Socio> getAll() throws Exception {
        List<Socio> lstSocios=new ArrayList<>();
        final String SQL = "SELECT id, dni, nombre, direccion "
                + "FROM socio";
        try (Connection connection = this.CONNECTION_FACTORY.getConnection();
                PreparedStatement statement = connection.prepareStatement(SQL);) {

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    lstSocios.add(new Socio(resultSet.getInt("id"),
                            resultSet.getString("dni"),
                            resultSet.getString("nombre"),
                            resultSet.getString("direccion")));
                }
                return lstSocios;
            }
        }
    }
    
    @Override
    public List<Socio> getAllWith(String referencia) throws Exception {
        List<Socio> lstSocios=new ArrayList<>();
        final String SQL = "SELECT id, dni, nombre, direccion "
                + "FROM socio WHERE nombre LIKE ?";
        try (Connection connection = this.CONNECTION_FACTORY.getConnection();
                PreparedStatement statement = connection.prepareStatement(SQL);) {
            statement.setString(1, "%"+referencia+"%");
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    lstSocios.add(new Socio(resultSet.getInt("id"),
                            resultSet.getString("dni"),
                            resultSet.getString("nombre"),
                            resultSet.getString("direccion")));
                }
                return lstSocios;
            }
        }
    }

    @Override
    public void add(Socio socio) throws Exception {
        final String SQL = "INSERT INTO socio(dni, nombre, direccion) VALUES(?, ?, ?)";
        try (Connection connection = this.CONNECTION_FACTORY.getConnection();
                PreparedStatement statement = connection.prepareStatement(SQL);) {
            
            statement.setString(1, socio.getDni());
            statement.setString(2, socio.getNombre());
            statement.setString(3, socio.getDireccion());
            
            
            try{
                statement.executeUpdate();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void update(Socio socio) throws Exception {
        final String SQL = "UPDATE socio SET dni=?, nombre=?, direccion=? WHERE id=?";
        try (Connection connection = this.CONNECTION_FACTORY.getConnection();
                PreparedStatement statement = connection.prepareStatement(SQL);) {
            
            statement.setString(1, socio.getDni());
            statement.setString(2, socio.getNombre());
            statement.setString(3, socio.getDireccion());
            statement.setInt(4, socio.getId());
            
            try{
                statement.executeUpdate();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void delete(int id) throws Exception {
        final String SQL = "DELETE FROM socio WHERE id=?";
        try (Connection connection = this.CONNECTION_FACTORY.getConnection();
                PreparedStatement statement = connection.prepareStatement(SQL);) {
            statement.setInt(1, id);
            
            try{
                statement.executeUpdate();
            }catch(Exception e){
                throw e;
            }
        }
    }
    
    public int updateNumBarcos(int socioId) throws Exception{
        final String SQL = "CALL actualizarNumBarcos(?)";
        
        try (Connection connection = this.CONNECTION_FACTORY.getConnection();
                CallableStatement statement = connection.prepareCall(SQL);) {
            
            statement.setInt(2, socioId);
            // statement.registerOutParameter(2, Types.INTEGER);
            
            
            try (ResultSet resultSet = statement.executeQuery()) {
               //  int outParameter = statement.getInt(2);
                if(resultSet.next()){
                    return resultSet.getInt(1);
                }
            }
        }
    }

}
