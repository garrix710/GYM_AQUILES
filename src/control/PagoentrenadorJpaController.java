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
import modelo.Entrenador;
import modelo.Pagoentrenador;

/**
 *
 * @author tuzos
 */
public class PagoentrenadorJpaController implements Serializable {

    public PagoentrenadorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Pagoentrenador pagoentrenador) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Entrenador entrenadorId = pagoentrenador.getEntrenadorId();
            if (entrenadorId != null) {
                entrenadorId = em.getReference(entrenadorId.getClass(), entrenadorId.getEntrenadorId());
                pagoentrenador.setEntrenadorId(entrenadorId);
            }
            em.persist(pagoentrenador);
            if (entrenadorId != null) {
                entrenadorId.getPagoentrenadorList().add(pagoentrenador);
                entrenadorId = em.merge(entrenadorId);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Pagoentrenador pagoentrenador) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Pagoentrenador persistentPagoentrenador = em.find(Pagoentrenador.class, pagoentrenador.getPagoId());
            Entrenador entrenadorIdOld = persistentPagoentrenador.getEntrenadorId();
            Entrenador entrenadorIdNew = pagoentrenador.getEntrenadorId();
            if (entrenadorIdNew != null) {
                entrenadorIdNew = em.getReference(entrenadorIdNew.getClass(), entrenadorIdNew.getEntrenadorId());
                pagoentrenador.setEntrenadorId(entrenadorIdNew);
            }
            pagoentrenador = em.merge(pagoentrenador);
            if (entrenadorIdOld != null && !entrenadorIdOld.equals(entrenadorIdNew)) {
                entrenadorIdOld.getPagoentrenadorList().remove(pagoentrenador);
                entrenadorIdOld = em.merge(entrenadorIdOld);
            }
            if (entrenadorIdNew != null && !entrenadorIdNew.equals(entrenadorIdOld)) {
                entrenadorIdNew.getPagoentrenadorList().add(pagoentrenador);
                entrenadorIdNew = em.merge(entrenadorIdNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = pagoentrenador.getPagoId();
                if (findPagoentrenador(id) == null) {
                    throw new NonexistentEntityException("The pagoentrenador with id " + id + " no longer exists.");
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
            Pagoentrenador pagoentrenador;
            try {
                pagoentrenador = em.getReference(Pagoentrenador.class, id);
                pagoentrenador.getPagoId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The pagoentrenador with id " + id + " no longer exists.", enfe);
            }
            Entrenador entrenadorId = pagoentrenador.getEntrenadorId();
            if (entrenadorId != null) {
                entrenadorId.getPagoentrenadorList().remove(pagoentrenador);
                entrenadorId = em.merge(entrenadorId);
            }
            em.remove(pagoentrenador);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Pagoentrenador> findPagoentrenadorEntities() {
        return findPagoentrenadorEntities(true, -1, -1);
    }

    public List<Pagoentrenador> findPagoentrenadorEntities(int maxResults, int firstResult) {
        return findPagoentrenadorEntities(false, maxResults, firstResult);
    }

    private List<Pagoentrenador> findPagoentrenadorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Pagoentrenador.class));
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

    public Pagoentrenador findPagoentrenador(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Pagoentrenador.class, id);
        } finally {
            em.close();
        }
    }

    public int getPagoentrenadorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Pagoentrenador> rt = cq.from(Pagoentrenador.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
