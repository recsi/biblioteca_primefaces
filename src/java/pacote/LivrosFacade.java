/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author GustavoSantos
 */
@Stateless
public class LivrosFacade extends AbstractFacade<Livros> {

    @PersistenceContext(unitName = "biblioteca_primefacesPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LivrosFacade() {
        super(Livros.class);
    }
    
}
