/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import capas.ConnectionFactory;
import capas.Socio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        final String SQL = "SELECT id, nombre, direccion "
                + "FROM socio WHERE id = ?";
        try (Connection connection = this.CONNECTION_FACTORY.getConnection();
                PreparedStatement statement = connection.prepareStatement(SQL);) {
            
            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return new Socio(resultSet.getInt("id"),
                            resultSet.getString("nombre"),
                            resultSet.getString("direccion"));
                }
                return null;
            }
        }
    }

    @Override
    public List<Socio> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Socio socio) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Socio socio) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
