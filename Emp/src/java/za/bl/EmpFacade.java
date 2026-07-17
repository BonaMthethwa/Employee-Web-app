/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.entity.Emp;

/**
 *
 * @author User
 */
@Stateless
public class EmpFacade extends AbstractFacade<Emp> implements EmpFacadeLocal {

    @PersistenceContext(unitName = "EmpPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmpFacade() {
        super(Emp.class);
    }
    
}
