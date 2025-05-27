/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import control.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import modelo.Administrador;
import modelo.Pagoadministrador;

/**
 *
 * @author tuzos
 */
public class PagoadministradorJpaController implements Serializable {

    public PagoadministradorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Pagoadministrador pagoadministrador) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Administrador administradorId = pagoadministrador.getAdministradorId();
            if (administradorId != null) {
                administradorId = em.getReference(administradorId.getClass(), administradorId.getAdministradorId());
                pagoadministrador.setAdministradorId(administradorId);
            }
            em.persist(pagoadministrador);
            if (administradorId != null) {
                administradorId.getPagoadministradorList().add(pagoadministrador);
                administradorId = em.merge(administradorId);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Pagoadministrador pagoadministrador) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Pagoadministrador persistentPagoadministrador = em.find(Pagoadministrador.class, pagoadministrador.getPagoId());
            Administrador administradorIdOld = persistentPagoadministrador.getAdministradorId();
            Administrador administradorIdNew = pagoadministrador.getAdministradorId();
            if (administradorIdNew != null) {
                administradorIdNew = em.getReference(administradorIdNew.getClass(), administradorIdNew.getAdministradorId());
                pagoadministrador.setAdministradorId(administradorIdNew);
            }
            pagoadministrador = em.merge(pagoadministrador);
            if (administradorIdOld != null && !administradorIdOld.equals(administradorIdNew)) {
                administradorIdOld.getPagoadministradorList().remove(pagoadministrador);
                administradorIdOld = em.merge(administradorIdOld);
            }
            if (administradorIdNew != null && !administradorIdNew.equals(administradorIdOld)) {
                administradorIdNew.getPagoadministradorList().add(pagoadministrador);
                administradorIdNew = em.merge(administradorIdNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = pagoadministrador.getPagoId();
                if (findPagoadministrador(id) == null) {
                    throw new NonexistentEntityException("The pagoadministrador with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Pagoadministrador pagoadministrador;
            try {
                pagoadministrador = em.getReference(Pagoadministrador.class, id);
                pagoadministrador.getPagoId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The pagoadministrador with id " + id + " no longer exists.", enfe);
            }
            Administrador administradorId = pagoadministrador.getAdministradorId();
            if (administradorId != null) {
                administradorId.getPagoadministradorList().remove(pagoadministrador);
                administradorId = em.merge(administradorId);
            }
            em.remove(pagoadministrador);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Pagoadministrador> findPagoadministradorEntities() {
        return findPagoadministradorEntities(true, -1, -1);
    }

    public List<Pagoadministrador> findPagoadministradorEntities(int maxResults, int firstResult) {
        return findPagoadministradorEntities(false, maxResults, firstResult);
    }

    private List<Pagoadministrador> findPagoadministradorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Pagoadministrador.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Pagoadministrador findPagoadministrador(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Pagoadministrador.class, id);
        } finally {
            em.close();
        }
    }

    public int getPagoadministradorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Pagoadministrador> rt = cq.from(Pagoadministrador.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
