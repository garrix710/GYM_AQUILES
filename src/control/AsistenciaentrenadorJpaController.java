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
import modelo.Asistenciaentrenador;
import modelo.Entrenador;

/**
 *
 * @author tuzos
 */
public class AsistenciaentrenadorJpaController implements Serializable {

    public AsistenciaentrenadorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Asistenciaentrenador asistenciaentrenador) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Entrenador entrenadorId = asistenciaentrenador.getEntrenadorId();
            if (entrenadorId != null) {
                entrenadorId = em.getReference(entrenadorId.getClass(), entrenadorId.getEntrenadorId());
                asistenciaentrenador.setEntrenadorId(entrenadorId);
            }
            em.persist(asistenciaentrenador);
            if (entrenadorId != null) {
                entrenadorId.getAsistenciaentrenadorList().add(asistenciaentrenador);
                entrenadorId = em.merge(entrenadorId);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Asistenciaentrenador asistenciaentrenador) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Asistenciaentrenador persistentAsistenciaentrenador = em.find(Asistenciaentrenador.class, asistenciaentrenador.getAsistenciaId());
            Entrenador entrenadorIdOld = persistentAsistenciaentrenador.getEntrenadorId();
            Entrenador entrenadorIdNew = asistenciaentrenador.getEntrenadorId();
            if (entrenadorIdNew != null) {
                entrenadorIdNew = em.getReference(entrenadorIdNew.getClass(), entrenadorIdNew.getEntrenadorId());
                asistenciaentrenador.setEntrenadorId(entrenadorIdNew);
            }
            asistenciaentrenador = em.merge(asistenciaentrenador);
            if (entrenadorIdOld != null && !entrenadorIdOld.equals(entrenadorIdNew)) {
                entrenadorIdOld.getAsistenciaentrenadorList().remove(asistenciaentrenador);
                entrenadorIdOld = em.merge(entrenadorIdOld);
            }
            if (entrenadorIdNew != null && !entrenadorIdNew.equals(entrenadorIdOld)) {
                entrenadorIdNew.getAsistenciaentrenadorList().add(asistenciaentrenador);
                entrenadorIdNew = em.merge(entrenadorIdNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = asistenciaentrenador.getAsistenciaId();
                if (findAsistenciaentrenador(id) == null) {
                    throw new NonexistentEntityException("The asistenciaentrenador with id " + id + " no longer exists.");
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
            Asistenciaentrenador asistenciaentrenador;
            try {
                asistenciaentrenador = em.getReference(Asistenciaentrenador.class, id);
                asistenciaentrenador.getAsistenciaId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The asistenciaentrenador with id " + id + " no longer exists.", enfe);
            }
            Entrenador entrenadorId = asistenciaentrenador.getEntrenadorId();
            if (entrenadorId != null) {
                entrenadorId.getAsistenciaentrenadorList().remove(asistenciaentrenador);
                entrenadorId = em.merge(entrenadorId);
            }
            em.remove(asistenciaentrenador);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Asistenciaentrenador> findAsistenciaentrenadorEntities() {
        return findAsistenciaentrenadorEntities(true, -1, -1);
    }

    public List<Asistenciaentrenador> findAsistenciaentrenadorEntities(int maxResults, int firstResult) {
        return findAsistenciaentrenadorEntities(false, maxResults, firstResult);
    }

    private List<Asistenciaentrenador> findAsistenciaentrenadorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Asistenciaentrenador.class));
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

    public Asistenciaentrenador findAsistenciaentrenador(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Asistenciaentrenador.class, id);
        } finally {
            em.close();
        }
    }

    public int getAsistenciaentrenadorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Asistenciaentrenador> rt = cq.from(Asistenciaentrenador.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
