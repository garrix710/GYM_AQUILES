/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import control.exceptions.IllegalOrphanException;
import control.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import modelo.Clientes;
import modelo.Pagomembresia;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import modelo.Membresia;

/**
 *
 * @author tuzos
 */
public class MembresiaJpaController implements Serializable {

    public MembresiaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Membresia membresia) {
        if (membresia.getPagomembresiaList() == null) {
            membresia.setPagomembresiaList(new ArrayList<Pagomembresia>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Clientes clienteId = membresia.getClienteId();
            if (clienteId != null) {
                clienteId = em.getReference(clienteId.getClass(), clienteId.getClienteId());
                membresia.setClienteId(clienteId);
            }
            List<Pagomembresia> attachedPagomembresiaList = new ArrayList<Pagomembresia>();
            for (Pagomembresia pagomembresiaListPagomembresiaToAttach : membresia.getPagomembresiaList()) {
                pagomembresiaListPagomembresiaToAttach = em.getReference(pagomembresiaListPagomembresiaToAttach.getClass(), pagomembresiaListPagomembresiaToAttach.getPagoId());
                attachedPagomembresiaList.add(pagomembresiaListPagomembresiaToAttach);
            }
            membresia.setPagomembresiaList(attachedPagomembresiaList);
            em.persist(membresia);
            if (clienteId != null) {
                clienteId.getMembresiaList().add(membresia);
                clienteId = em.merge(clienteId);
            }
            for (Pagomembresia pagomembresiaListPagomembresia : membresia.getPagomembresiaList()) {
                Membresia oldMembresiaIdOfPagomembresiaListPagomembresia = pagomembresiaListPagomembresia.getMembresiaId();
                pagomembresiaListPagomembresia.setMembresiaId(membresia);
                pagomembresiaListPagomembresia = em.merge(pagomembresiaListPagomembresia);
                if (oldMembresiaIdOfPagomembresiaListPagomembresia != null) {
                    oldMembresiaIdOfPagomembresiaListPagomembresia.getPagomembresiaList().remove(pagomembresiaListPagomembresia);
                    oldMembresiaIdOfPagomembresiaListPagomembresia = em.merge(oldMembresiaIdOfPagomembresiaListPagomembresia);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Membresia membresia) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Membresia persistentMembresia = em.find(Membresia.class, membresia.getMembresiaId());
            Clientes clienteIdOld = persistentMembresia.getClienteId();
            Clientes clienteIdNew = membresia.getClienteId();
            List<Pagomembresia> pagomembresiaListOld = persistentMembresia.getPagomembresiaList();
            List<Pagomembresia> pagomembresiaListNew = membresia.getPagomembresiaList();
            List<String> illegalOrphanMessages = null;
            for (Pagomembresia pagomembresiaListOldPagomembresia : pagomembresiaListOld) {
                if (!pagomembresiaListNew.contains(pagomembresiaListOldPagomembresia)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Pagomembresia " + pagomembresiaListOldPagomembresia + " since its membresiaId field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (clienteIdNew != null) {
                clienteIdNew = em.getReference(clienteIdNew.getClass(), clienteIdNew.getClienteId());
                membresia.setClienteId(clienteIdNew);
            }
            List<Pagomembresia> attachedPagomembresiaListNew = new ArrayList<Pagomembresia>();
            for (Pagomembresia pagomembresiaListNewPagomembresiaToAttach : pagomembresiaListNew) {
                pagomembresiaListNewPagomembresiaToAttach = em.getReference(pagomembresiaListNewPagomembresiaToAttach.getClass(), pagomembresiaListNewPagomembresiaToAttach.getPagoId());
                attachedPagomembresiaListNew.add(pagomembresiaListNewPagomembresiaToAttach);
            }
            pagomembresiaListNew = attachedPagomembresiaListNew;
            membresia.setPagomembresiaList(pagomembresiaListNew);
            membresia = em.merge(membresia);
            if (clienteIdOld != null && !clienteIdOld.equals(clienteIdNew)) {
                clienteIdOld.getMembresiaList().remove(membresia);
                clienteIdOld = em.merge(clienteIdOld);
            }
            if (clienteIdNew != null && !clienteIdNew.equals(clienteIdOld)) {
                clienteIdNew.getMembresiaList().add(membresia);
                clienteIdNew = em.merge(clienteIdNew);
            }
            for (Pagomembresia pagomembresiaListNewPagomembresia : pagomembresiaListNew) {
                if (!pagomembresiaListOld.contains(pagomembresiaListNewPagomembresia)) {
                    Membresia oldMembresiaIdOfPagomembresiaListNewPagomembresia = pagomembresiaListNewPagomembresia.getMembresiaId();
                    pagomembresiaListNewPagomembresia.setMembresiaId(membresia);
                    pagomembresiaListNewPagomembresia = em.merge(pagomembresiaListNewPagomembresia);
                    if (oldMembresiaIdOfPagomembresiaListNewPagomembresia != null && !oldMembresiaIdOfPagomembresiaListNewPagomembresia.equals(membresia)) {
                        oldMembresiaIdOfPagomembresiaListNewPagomembresia.getPagomembresiaList().remove(pagomembresiaListNewPagomembresia);
                        oldMembresiaIdOfPagomembresiaListNewPagomembresia = em.merge(oldMembresiaIdOfPagomembresiaListNewPagomembresia);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = membresia.getMembresiaId();
                if (findMembresia(id) == null) {
                    throw new NonexistentEntityException("The membresia with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws IllegalOrphanException, NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Membresia membresia;
            try {
                membresia = em.getReference(Membresia.class, id);
                membresia.getMembresiaId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The membresia with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<Pagomembresia> pagomembresiaListOrphanCheck = membresia.getPagomembresiaList();
            for (Pagomembresia pagomembresiaListOrphanCheckPagomembresia : pagomembresiaListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Membresia (" + membresia + ") cannot be destroyed since the Pagomembresia " + pagomembresiaListOrphanCheckPagomembresia + " in its pagomembresiaList field has a non-nullable membresiaId field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Clientes clienteId = membresia.getClienteId();
            if (clienteId != null) {
                clienteId.getMembresiaList().remove(membresia);
                clienteId = em.merge(clienteId);
            }
            em.remove(membresia);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Membresia> findMembresiaEntities() {
        return findMembresiaEntities(true, -1, -1);
    }

    public List<Membresia> findMembresiaEntities(int maxResults, int firstResult) {
        return findMembresiaEntities(false, maxResults, firstResult);
    }

    private List<Membresia> findMembresiaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Membresia.class));
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

    public Membresia findMembresia(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Membresia.class, id);
        } finally {
            em.close();
        }
    }

    public int getMembresiaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Membresia> rt = cq.from(Membresia.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
