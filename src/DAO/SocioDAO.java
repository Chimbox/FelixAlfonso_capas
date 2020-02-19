/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import negocio.Socio;
import java.util.List;

/**
 *
 * @author lv1013
 */
public interface SocioDAO {
    Socio find(int id) throws Exception;
    List<Socio> getAll() throws Exception;
    List<Socio> getAllWith(String referencia) throws Exception;
    void add(Socio socio) throws Exception;
    void update(Socio socio) throws Exception;
    void delete(int id) throws Exception;
}
