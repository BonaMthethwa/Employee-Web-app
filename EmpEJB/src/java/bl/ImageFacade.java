/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.model.entity.Image;

/**
 *
 * @author User
 */
@Stateless
public class ImageFacade extends AbstractFacade<Image> implements ImageFacadeLocal {

    @PersistenceContext(unitName = "EmpEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ImageFacade() {
        super(Image.class);
    }
    
}
