/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import negocio.Barco;

/**
 *
 * @author Invitado
 */
public interface BarcoDAO {
    Barco find(int numMatricula) throws Exception;
    List<Barco> getAll() throws Exception;
    void add(Barco barco) throws Exception;
    void update(Barco barco) throws Exception;
    void delete(int id) throws Exception;
}
