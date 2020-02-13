/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.SocioDAO;
import DAO.SocioDAOImpl;
import capas.MySQLConnectionFactory;
import capas.ConnectionFactory;

/**
 *
 * @author lv1013
 */
public class mein {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new MySQLConnectionFactory("localhost","club_nautico", 3306,"root","1234");
        SocioDAO socioDAO = new SocioDAOImpl(connectionFactory);
    }
    
}
