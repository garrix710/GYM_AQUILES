/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author abiga
 */
public class AdmDatos {
    private EntityManagerFactory emf;
    public EntityManagerFactory getEmf(){
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("GMSPU");
        }
        return emf;
    }
}
