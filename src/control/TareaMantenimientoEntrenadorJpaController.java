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
import modelo.TareaMantenimientoEntrenador;

/**
 *
 * @author tuzos
 */
public class TareaMantenimientoEntrenadorJpaController implements Serializable {

    public TareaMantenimientoEntrenadorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TareaMantenimientoEntrenador tareaMantenimientoEntrenador) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Entrenador entrenadorId = tareaMantenimientoEntrenador.getEntrenadorId();
            if (entrenadorId != null) {
                entrenadorId = em.getReference(entrenadorId.getClass(), entrenadorId.getEntrenadorId());
                tareaMantenimientoEntrenador.setEntrenadorId(entrenadorId);
            }
            em.persist(tareaMantenimientoEntrenador);
            if (entrenadorId != null) {
                entrenadorId.getTareaMantenimientoEntrenadorList().add(tareaMantenimientoEntrenador);
                entrenadorId = em.merge(entrenadorId);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TareaMantenimientoEntrenador tareaMantenimientoEntrenador) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TareaMantenimientoEntrenador persistentTareaMantenimientoEntrenador = em.find(TareaMantenimientoEntrenador.class, tareaMantenimientoEntrenador.getTareaId());
            Entrenador entrenadorIdOld = persistentTareaMantenimientoEntrenador.getEntrenadorId();
            Entrenador entrenadorIdNew = tareaMantenimientoEntrenador.getEntrenadorId();
            if (entrenadorIdNew != null) {
                entrenadorIdNew = em.getReference(entrenadorIdNew.getClass(), entrenadorIdNew.getEntrenadorId());
                tareaMantenimientoEntrenador.setEntrenadorId(entrenadorIdNew);
            }
            tareaMantenimientoEntrenador = em.merge(tareaMantenimientoEntrenador);
            if (entrenadorIdOld != null && !entrenadorIdOld.equals(entrenadorIdNew)) {
                entrenadorIdOld.getTareaMantenimientoEntrenadorList().remove(tareaMantenimientoEntrenador);
                entrenadorIdOld = em.merge(entrenadorIdOld);
            }
            if (entrenadorIdNew != null && !entrenadorIdNew.equals(entrenadorIdOld)) {
                entrenadorIdNew.getTareaMantenimientoEntrenadorList().add(tareaMantenimientoEntrenador);
                entrenadorIdNew = em.merge(entrenadorIdNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = tareaMantenimientoEntrenador.getTareaId();
                if (findTareaMantenimientoEntrenador(id) == null) {
                    throw new NonexistentEntityException("The tareaMantenimientoEntrenador with id " + id + " no longer exists.");
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
            TareaMantenimientoEntrenador tareaMantenimientoEntrenador;
            try {
                tareaMantenimientoEntrenador = em.getReference(TareaMantenimientoEntrenador.class, id);
                tareaMantenimientoEntrenador.getTareaId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tareaMantenimientoEntrenador with id " + id + " no longer exists.", enfe);
            }
            Entrenador entrenadorId = tareaMantenimientoEntrenador.getEntrenadorId();
            if (entrenadorId != null) {
                entrenadorId.getTareaMantenimientoEntrenadorList().remove(tareaMantenimientoEntrenador);
                entrenadorId = em.merge(entrenadorId);
            }
            em.remove(tareaMantenimientoEntrenador);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TareaMantenimientoEntrenador> findTareaMantenimientoEntrenadorEntities() {
        return findTareaMantenimientoEntrenadorEntities(true, -1, -1);
    }

    public List<TareaMantenimientoEntrenador> findTareaMantenimientoEntrenadorEntities(int maxResults, int firstResult) {
        return findTareaMantenimientoEntrenadorEntities(false, maxResults, firstResult);
    }

    private List<TareaMantenimientoEntrenador> findTareaMantenimientoEntrenadorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TareaMantenimientoEntrenador.class));
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

    public TareaMantenimientoEntrenador findTareaMantenimientoEntrenador(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TareaMantenimientoEntrenador.class, id);
        } finally {
            em.close();
        }
    }

    public int getTareaMantenimientoEntrenadorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TareaMantenimientoEntrenador> rt = cq.from(TareaMantenimientoEntrenador.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
