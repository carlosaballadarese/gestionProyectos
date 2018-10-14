/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seia.gp.servicio;

import com.seia.gp.modelo.Reunion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Leo
 */
@Local
public interface ReunionFacadeLocal {

    void create(Reunion reunion);

    void edit(Reunion reunion);

    void remove(Reunion reunion);

    Reunion find(Object id);

    List<Reunion> findAll();

    List<Reunion> findRange(int[] range);

    int count();
    
}
