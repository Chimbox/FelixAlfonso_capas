/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import negocio.Salida;

/**
 *
 * @author Invitado
 */
public interface SalidaDAO {
    Salida find(int id) throws Exception;
    List<Salida> getAll() throws Exception;
    void add(Salida salida) throws Exception;
    void update(Salida salida) throws Exception;
    void delete(int id) throws Exception;
}
