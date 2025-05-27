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
import modelo.Pagoadministrador;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import modelo.Administrador;
import modelo.TareaMantenimientoAdministrador;

/**
 *
 * @author tuzos
 */
public class AdministradorJpaController implements Serializable {

    public AdministradorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Administrador administrador) {
        if (administrador.getPagoadministradorList() == null) {
            administrador.setPagoadministradorList(new ArrayList<Pagoadministrador>());
        }
        if (administrador.getTareaMantenimientoAdministradorList() == null) {
            administrador.setTareaMantenimientoAdministradorList(new ArrayList<TareaMantenimientoAdministrador>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Pagoadministrador> attachedPagoadministradorList = new ArrayList<Pagoadministrador>();
            for (Pagoadministrador pagoadministradorListPagoadministradorToAttach : administrador.getPagoadministradorList()) {
                pagoadministradorListPagoadministradorToAttach = em.getReference(pagoadministradorListPagoadministradorToAttach.getClass(), pagoadministradorListPagoadministradorToAttach.getPagoId());
                attachedPagoadministradorList.add(pagoadministradorListPagoadministradorToAttach);
            }
            administrador.setPagoadministradorList(attachedPagoadministradorList);
            List<TareaMantenimientoAdministrador> attachedTareaMantenimientoAdministradorList = new ArrayList<TareaMantenimientoAdministrador>();
            for (TareaMantenimientoAdministrador tareaMantenimientoAdministradorListTareaMantenimientoAdministradorToAttach : administrador.getTareaMantenimientoAdministradorList()) {
                tareaMantenimientoAdministradorListTareaMantenimientoAdministradorToAttach = em.getReference(tareaMantenimientoAdministradorListTareaMantenimientoAdministradorToAttach.getClass(), tareaMantenimientoAdministradorListTareaMantenimientoAdministradorToAttach.getTareaId());
                attachedTareaMantenimientoAdministradorList.add(tareaMantenimientoAdministradorListTareaMantenimientoAdministradorToAttach);
            }
            administrador.setTareaMantenimientoAdministradorList(attachedTareaMantenimientoAdministradorList);
            em.persist(administrador);
            for (Pagoadministrador pagoadministradorListPagoadministrador : administrador.getPagoadministradorList()) {
                Administrador oldAdministradorIdOfPagoadministradorListPagoadministrador = pagoadministradorListPagoadministrador.getAdministradorId();
                pagoadministradorListPagoadministrador.setAdministradorId(administrador);
                pagoadministradorListPagoadministrador = em.merge(pagoadministradorListPagoadministrador);
                if (oldAdministradorIdOfPagoadministradorListPagoadministrador != null) {
                    oldAdministradorIdOfPagoadministradorListPagoadministrador.getPagoadministradorList().remove(pagoadministradorListPagoadministrador);
                    oldAdministradorIdOfPagoadministradorListPagoadministrador = em.merge(oldAdministradorIdOfPagoadministradorListPagoadministrador);
                }
            }
            for (TareaMantenimientoAdministrador tareaMantenimientoAdministradorListTareaMantenimientoAdministrador : administrador.getTareaMantenimientoAdministradorList()) {
                Administrador oldAdministradorIdOfTareaMantenimientoAdministradorListTareaMantenimientoAdministrador = tareaMantenimientoAdministradorListTareaMantenimientoAdministrador.getAdministradorId();
                tareaMantenimientoAdministradorListTareaMantenimientoAdministrador.setAdministradorId(administrador);
                tareaMantenimientoAdministradorListTareaMantenimientoAdministrador = em.merge(tareaMantenimientoAdministradorListTareaMantenimientoAdministrador);
                if (oldAdministradorIdOfTareaMantenimientoAdministradorListTareaMantenimientoAdministrador != null) {
                    oldAdministradorIdOfTareaMantenimientoAdministradorListTareaMantenimientoAdministrador.getTareaMantenimientoAdministradorList().remove(tareaMantenimientoAdministradorListTareaMantenimientoAdministrador);
                    oldAdministradorIdOfTareaMantenimientoAdministradorListTareaMantenimientoAdministrador = em.merge(oldAdministradorIdOfTareaMantenimientoAdministradorListTareaMantenimientoAdministrador);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Administrador administrador) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Administrador persistentAdministrador = em.find(Administrador.class, administrador.getAdministradorId());
            List<Pagoadministrador> pagoadministradorListOld = persistentAdministrador.getPagoadministradorList();
            List<Pagoadministrador> pagoadministradorListNew = administrador.getPagoadministradorList();
            List<TareaMantenimientoAdministrador> tareaMantenimientoAdministradorListOld = persistentAdministrador.getTareaMantenimientoAdministradorList();
            List<TareaMantenimientoAdministrador> tareaMantenimientoAdministradorListNew = administrador.getTareaMantenimientoAdministradorList();
            List<String> illegalOrphanMessages = null;
            for (Pagoadministrador pagoadministradorListOldPagoadministrador : pagoadministradorListOld) {
                if (!pagoadministradorListNew.contains(pagoadministradorListOldPagoadministrador)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Pagoadministrador " + pagoadministradorListOldPagoadministrador + " since its administradorId field is not nullable.");
                }
            }
            for (TareaMantenimientoAdministrador tareaMantenimientoAdministradorListOldTareaMantenimientoAdministrador : tareaMantenimientoAdministradorListOld) {
                if (!tareaMantenimientoAdministradorListNew.contains(tareaMantenimientoAdministradorListOldTareaMantenimientoAdministrador)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain TareaMantenimientoAdministrador " + tareaMantenimientoAdministradorListOldTareaMantenimientoAdministrador + " since its administradorId field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            List<Pagoadministrador> attachedPagoadministradorListNew = new ArrayList<Pagoadministrador>();
            for (Pagoadministrador pagoadministradorListNewPagoadministradorToAttach : pagoadministradorListNew) {
                pagoadministradorListNewPagoadministradorToAttach = em.getReference(pagoadministradorListNewPagoadministradorToAttach.getClass(), pagoadministradorListNewPagoadministradorToAttach.getPagoId());
                attachedPagoadministradorListNew.add(pagoadministradorListNewPagoadministradorToAttach);
            }
            pagoadministradorListNew = attachedPagoadministradorListNew;
            administrador.setPagoadministradorList(pagoadministradorListNew);
            List<TareaMantenimientoAdministrador> attachedTareaMantenimientoAdministradorListNew = new ArrayList<TareaMantenimientoAdministrador>();
            for (TareaMantenimientoAdministrador tareaMantenimientoAdministradorListNewTareaMantenimientoAdministradorToAttach : tareaMantenimientoAdministradorListNew) {
                tareaMantenimientoAdministradorListNewTareaMantenimientoAdministradorToAttach = em.getReference(tareaMantenimientoAdministradorListNewTareaMantenimientoAdministradorToAttach.getClass(), tareaMantenimientoAdministradorListNewTareaMantenimientoAdministradorToAttach.getTareaId());
                attachedTareaMantenimientoAdministradorListNew.add(tareaMantenimientoAdministradorListNewTareaMantenimientoAdministradorToAttach);
            }
            tareaMantenimientoAdministradorListNew = attachedTareaMantenimientoAdministradorListNew;
            administrador.setTareaMantenimientoAdministradorList(tareaMantenimientoAdministradorListNew);
            administrador = em.merge(administrador);
            for (Pagoadministrador pagoadministradorListNewPagoadministrador : pagoadministradorListNew) {
                if (!pagoadministradorListOld.contains(pagoadministradorListNewPagoadministrador)) {
                    Administrador oldAdministradorIdOfPagoadministradorListNewPagoadministrador = pagoadministradorListNewPagoadministrador.getAdministradorId();
                    pagoadministradorListNewPagoadministrador.setAdministradorId(administrador);
                    pagoadministradorListNewPagoadministrador = em.merge(pagoadministradorListNewPagoadministrador);
                    if (oldAdministradorIdOfPagoadministradorListNewPagoadministrador != null && !oldAdministradorIdOfPagoadministradorListNewPagoadministrador.equals(administrador)) {
                        oldAdministradorIdOfPagoadministradorListNewPagoadministrador.getPagoadministradorList().remove(pagoadministradorListNewPagoadministrador);
                        oldAdministradorIdOfPagoadministradorListNewPagoadministrador = em.merge(oldAdministradorIdOfPagoadministradorListNewPagoadministrador);
                    }
                }
            }
            for (TareaMantenimientoAdministrador tareaMantenimientoAdministradorListNewTareaMantenimientoAdministrador : tareaMantenimientoAdministradorListNew) {
                if (!tareaMantenimientoAdministradorListOld.contains(tareaMantenimientoAdministradorListNewTareaMantenimientoAdministrador)) {
                    Administrador oldAdministradorIdOfTareaMantenimientoAdministradorListNewTareaMantenimientoAdministrador = tareaMantenimientoAdministradorListNewTareaMantenimientoAdministrador.getAdministradorId();
                    tareaMantenimientoAdministradorListNewTareaMantenimientoAdministrador.setAdministradorId(administrador);
                    tareaMantenimientoAdministradorListNewTareaMantenimientoAdministrador = em.merge(tareaMantenimientoAdministradorListNewTareaMantenimientoAdministrador);
                    if (oldAdministradorIdOfTareaMantenimientoAdministradorListNewTareaMantenimientoAdministrador != null && !oldAdministradorIdOfTareaMantenimientoAdministradorListNewTareaMantenimientoAdministrador.equals(administrador)) {
                        oldAdministradorIdOfTareaMantenimientoAdministradorListNewTareaMantenimientoAdministrador.getTareaMantenimientoAdministradorList().remove(tareaMantenimientoAdministradorListNewTareaMantenimientoAdministrador);
                        oldAdministradorIdOfTareaMantenimientoAdministradorListNewTareaMantenimientoAdministrador = em.merge(oldAdministradorIdOfTareaMantenimientoAdministradorListNewTareaMantenimientoAdministrador);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = administrador.getAdministradorId();
                if (findAdministrador(id) == null) {
                    throw new NonexistentEntityException("The administrador with id " + id + " no longer exists.");
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
            Administrador administrador;
            try {
                administrador = em.getReference(Administrador.class, id);
                administrador.getAdministradorId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The administrador with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<Pagoadministrador> pagoadministradorListOrphanCheck = administrador.getPagoadministradorList();
            for (Pagoadministrador pagoadministradorListOrphanCheckPagoadministrador : pagoadministradorListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Administrador (" + administrador + ") cannot be destroyed since the Pagoadministrador " + pagoadministradorListOrphanCheckPagoadministrador + " in its pagoadministradorList field has a non-nullable administradorId field.");
            }
            List<TareaMantenimientoAdministrador> tareaMantenimientoAdministradorListOrphanCheck = administrador.getTareaMantenimientoAdministradorList();
            for (TareaMantenimientoAdministrador tareaMantenimientoAdministradorListOrphanCheckTareaMantenimientoAdministrador : tareaMantenimientoAdministradorListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Administrador (" + administrador + ") cannot be destroyed since the TareaMantenimientoAdministrador " + tareaMantenimientoAdministradorListOrphanCheckTareaMantenimientoAdministrador + " in its tareaMantenimientoAdministradorList field has a non-nullable administradorId field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(administrador);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Administrador> findAdministradorEntities() {
        return findAdministradorEntities(true, -1, -1);
    }

    public List<Administrador> findAdministradorEntities(int maxResults, int firstResult) {
        return findAdministradorEntities(false, maxResults, firstResult);
    }

    private List<Administrador> findAdministradorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Administrador.class));
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

    public Administrador findAdministrador(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Administrador.class, id);
        } finally {
            em.close();
        }
    }

    public int getAdministradorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Administrador> rt = cq.from(Administrador.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
