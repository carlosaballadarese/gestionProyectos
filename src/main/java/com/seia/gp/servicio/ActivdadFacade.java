/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seia.gp.servicio;

import com.seia.gp.modelo.Activdad;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Leo
 */
@Stateless
public class ActivdadFacade extends AbstractFacade<Activdad> implements ActivdadFacadeLocal {

    @PersistenceContext(unitName = "gpPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ActivdadFacade() {
        super(Activdad.class);
    }
    
}
