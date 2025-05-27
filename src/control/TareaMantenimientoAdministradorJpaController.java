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
import modelo.TareaMantenimientoAdministrador;

/**
 *
 * @author tuzos
 */
public class TareaMantenimientoAdministradorJpaController implements Serializable {

    public TareaMantenimientoAdministradorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TareaMantenimientoAdministrador tareaMantenimientoAdministrador) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Administrador administradorId = tareaMantenimientoAdministrador.getAdministradorId();
            if (administradorId != null) {
                administradorId = em.getReference(administradorId.getClass(), administradorId.getAdministradorId());
                tareaMantenimientoAdministrador.setAdministradorId(administradorId);
            }
            em.persist(tareaMantenimientoAdministrador);
            if (administradorId != null) {
                administradorId.getTareaMantenimientoAdministradorList().add(tareaMantenimientoAdministrador);
                administradorId = em.merge(administradorId);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TareaMantenimientoAdministrador tareaMantenimientoAdministrador) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TareaMantenimientoAdministrador persistentTareaMantenimientoAdministrador = em.find(TareaMantenimientoAdministrador.class, tareaMantenimientoAdministrador.getTareaId());
            Administrador administradorIdOld = persistentTareaMantenimientoAdministrador.getAdministradorId();
            Administrador administradorIdNew = tareaMantenimientoAdministrador.getAdministradorId();
            if (administradorIdNew != null) {
                administradorIdNew = em.getReference(administradorIdNew.getClass(), administradorIdNew.getAdministradorId());
                tareaMantenimientoAdministrador.setAdministradorId(administradorIdNew);
            }
            tareaMantenimientoAdministrador = em.merge(tareaMantenimientoAdministrador);
            if (administradorIdOld != null && !administradorIdOld.equals(administradorIdNew)) {
                administradorIdOld.getTareaMantenimientoAdministradorList().remove(tareaMantenimientoAdministrador);
                administradorIdOld = em.merge(administradorIdOld);
            }
            if (administradorIdNew != null && !administradorIdNew.equals(administradorIdOld)) {
                administradorIdNew.getTareaMantenimientoAdministradorList().add(tareaMantenimientoAdministrador);
                administradorIdNew = em.merge(administradorIdNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = tareaMantenimientoAdministrador.getTareaId();
                if (findTareaMantenimientoAdministrador(id) == null) {
                    throw new NonexistentEntityException("The tareaMantenimientoAdministrador with id " + id + " no longer exists.");
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
            TareaMantenimientoAdministrador tareaMantenimientoAdministrador;
            try {
                tareaMantenimientoAdministrador = em.getReference(TareaMantenimientoAdministrador.class, id);
                tareaMantenimientoAdministrador.getTareaId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tareaMantenimientoAdministrador with id " + id + " no longer exists.", enfe);
            }
            Administrador administradorId = tareaMantenimientoAdministrador.getAdministradorId();
            if (administradorId != null) {
                administradorId.getTareaMantenimientoAdministradorList().remove(tareaMantenimientoAdministrador);
                administradorId = em.merge(administradorId);
            }
            em.remove(tareaMantenimientoAdministrador);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TareaMantenimientoAdministrador> findTareaMantenimientoAdministradorEntities() {
        return findTareaMantenimientoAdministradorEntities(true, -1, -1);
    }

    public List<TareaMantenimientoAdministrador> findTareaMantenimientoAdministradorEntities(int maxResults, int firstResult) {
        return findTareaMantenimientoAdministradorEntities(false, maxResults, firstResult);
    }

    private List<TareaMantenimientoAdministrador> findTareaMantenimientoAdministradorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TareaMantenimientoAdministrador.class));
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

    public TareaMantenimientoAdministrador findTareaMantenimientoAdministrador(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TareaMantenimientoAdministrador.class, id);
        } finally {
            em.close();
        }
    }

    public int getTareaMantenimientoAdministradorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TareaMantenimientoAdministrador> rt = cq.from(TareaMantenimientoAdministrador.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
