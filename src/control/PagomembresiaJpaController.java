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
import modelo.Clientes;
import modelo.Membresia;
import modelo.Pagomembresia;

/**
 *
 * @author tuzos
 */
public class PagomembresiaJpaController implements Serializable {

    public PagomembresiaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Pagomembresia pagomembresia) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Clientes clienteId = pagomembresia.getClienteId();
            if (clienteId != null) {
                clienteId = em.getReference(clienteId.getClass(), clienteId.getClienteId());
                pagomembresia.setClienteId(clienteId);
            }
            Membresia membresiaId = pagomembresia.getMembresiaId();
            if (membresiaId != null) {
                membresiaId = em.getReference(membresiaId.getClass(), membresiaId.getMembresiaId());
                pagomembresia.setMembresiaId(membresiaId);
            }
            em.persist(pagomembresia);
            if (clienteId != null) {
                clienteId.getPagomembresiaList().add(pagomembresia);
                clienteId = em.merge(clienteId);
            }
            if (membresiaId != null) {
                membresiaId.getPagomembresiaList().add(pagomembresia);
                membresiaId = em.merge(membresiaId);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Pagomembresia pagomembresia) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Pagomembresia persistentPagomembresia = em.find(Pagomembresia.class, pagomembresia.getPagoId());
            Clientes clienteIdOld = persistentPagomembresia.getClienteId();
            Clientes clienteIdNew = pagomembresia.getClienteId();
            Membresia membresiaIdOld = persistentPagomembresia.getMembresiaId();
            Membresia membresiaIdNew = pagomembresia.getMembresiaId();
            if (clienteIdNew != null) {
                clienteIdNew = em.getReference(clienteIdNew.getClass(), clienteIdNew.getClienteId());
                pagomembresia.setClienteId(clienteIdNew);
            }
            if (membresiaIdNew != null) {
                membresiaIdNew = em.getReference(membresiaIdNew.getClass(), membresiaIdNew.getMembresiaId());
                pagomembresia.setMembresiaId(membresiaIdNew);
            }
            pagomembresia = em.merge(pagomembresia);
            if (clienteIdOld != null && !clienteIdOld.equals(clienteIdNew)) {
                clienteIdOld.getPagomembresiaList().remove(pagomembresia);
                clienteIdOld = em.merge(clienteIdOld);
            }
            if (clienteIdNew != null && !clienteIdNew.equals(clienteIdOld)) {
                clienteIdNew.getPagomembresiaList().add(pagomembresia);
                clienteIdNew = em.merge(clienteIdNew);
            }
            if (membresiaIdOld != null && !membresiaIdOld.equals(membresiaIdNew)) {
                membresiaIdOld.getPagomembresiaList().remove(pagomembresia);
                membresiaIdOld = em.merge(membresiaIdOld);
            }
            if (membresiaIdNew != null && !membresiaIdNew.equals(membresiaIdOld)) {
                membresiaIdNew.getPagomembresiaList().add(pagomembresia);
                membresiaIdNew = em.merge(membresiaIdNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = pagomembresia.getPagoId();
                if (findPagomembresia(id) == null) {
                    throw new NonexistentEntityException("The pagomembresia with id " + id + " no longer exists.");
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
            Pagomembresia pagomembresia;
            try {
                pagomembresia = em.getReference(Pagomembresia.class, id);
                pagomembresia.getPagoId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The pagomembresia with id " + id + " no longer exists.", enfe);
            }
            Clientes clienteId = pagomembresia.getClienteId();
            if (clienteId != null) {
                clienteId.getPagomembresiaList().remove(pagomembresia);
                clienteId = em.merge(clienteId);
            }
            Membresia membresiaId = pagomembresia.getMembresiaId();
            if (membresiaId != null) {
                membresiaId.getPagomembresiaList().remove(pagomembresia);
                membresiaId = em.merge(membresiaId);
            }
            em.remove(pagomembresia);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Pagomembresia> findPagomembresiaEntities() {
        return findPagomembresiaEntities(true, -1, -1);
    }

    public List<Pagomembresia> findPagomembresiaEntities(int maxResults, int firstResult) {
        return findPagomembresiaEntities(false, maxResults, firstResult);
    }

    private List<Pagomembresia> findPagomembresiaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Pagomembresia.class));
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

    public Pagomembresia findPagomembresia(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Pagomembresia.class, id);
        } finally {
            em.close();
        }
    }

    public int getPagomembresiaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Pagomembresia> rt = cq.from(Pagomembresia.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
