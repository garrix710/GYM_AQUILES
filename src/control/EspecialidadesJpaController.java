/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import control.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import modelo.Entrenador;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import modelo.Especialidades;

/**
 *
 * @author tuzos
 */
public class EspecialidadesJpaController implements Serializable {

    public EspecialidadesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Especialidades especialidades) {
        if (especialidades.getEntrenadorList() == null) {
            especialidades.setEntrenadorList(new ArrayList<Entrenador>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Entrenador> attachedEntrenadorList = new ArrayList<Entrenador>();
            for (Entrenador entrenadorListEntrenadorToAttach : especialidades.getEntrenadorList()) {
                entrenadorListEntrenadorToAttach = em.getReference(entrenadorListEntrenadorToAttach.getClass(), entrenadorListEntrenadorToAttach.getEntrenadorId());
                attachedEntrenadorList.add(entrenadorListEntrenadorToAttach);
            }
            especialidades.setEntrenadorList(attachedEntrenadorList);
            em.persist(especialidades);
            for (Entrenador entrenadorListEntrenador : especialidades.getEntrenadorList()) {
                entrenadorListEntrenador.getEspecialidadesList().add(especialidades);
                entrenadorListEntrenador = em.merge(entrenadorListEntrenador);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Especialidades especialidades) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Especialidades persistentEspecialidades = em.find(Especialidades.class, especialidades.getEspecialidadId());
            List<Entrenador> entrenadorListOld = persistentEspecialidades.getEntrenadorList();
            List<Entrenador> entrenadorListNew = especialidades.getEntrenadorList();
            List<Entrenador> attachedEntrenadorListNew = new ArrayList<Entrenador>();
            for (Entrenador entrenadorListNewEntrenadorToAttach : entrenadorListNew) {
                entrenadorListNewEntrenadorToAttach = em.getReference(entrenadorListNewEntrenadorToAttach.getClass(), entrenadorListNewEntrenadorToAttach.getEntrenadorId());
                attachedEntrenadorListNew.add(entrenadorListNewEntrenadorToAttach);
            }
            entrenadorListNew = attachedEntrenadorListNew;
            especialidades.setEntrenadorList(entrenadorListNew);
            especialidades = em.merge(especialidades);
            for (Entrenador entrenadorListOldEntrenador : entrenadorListOld) {
                if (!entrenadorListNew.contains(entrenadorListOldEntrenador)) {
                    entrenadorListOldEntrenador.getEspecialidadesList().remove(especialidades);
                    entrenadorListOldEntrenador = em.merge(entrenadorListOldEntrenador);
                }
            }
            for (Entrenador entrenadorListNewEntrenador : entrenadorListNew) {
                if (!entrenadorListOld.contains(entrenadorListNewEntrenador)) {
                    entrenadorListNewEntrenador.getEspecialidadesList().add(especialidades);
                    entrenadorListNewEntrenador = em.merge(entrenadorListNewEntrenador);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = especialidades.getEspecialidadId();
                if (findEspecialidades(id) == null) {
                    throw new NonexistentEntityException("The especialidades with id " + id + " no longer exists.");
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
            Especialidades especialidades;
            try {
                especialidades = em.getReference(Especialidades.class, id);
                especialidades.getEspecialidadId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The especialidades with id " + id + " no longer exists.", enfe);
            }
            List<Entrenador> entrenadorList = especialidades.getEntrenadorList();
            for (Entrenador entrenadorListEntrenador : entrenadorList) {
                entrenadorListEntrenador.getEspecialidadesList().remove(especialidades);
                entrenadorListEntrenador = em.merge(entrenadorListEntrenador);
            }
            em.remove(especialidades);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Especialidades> findEspecialidadesEntities() {
        return findEspecialidadesEntities(true, -1, -1);
    }

    public List<Especialidades> findEspecialidadesEntities(int maxResults, int firstResult) {
        return findEspecialidadesEntities(false, maxResults, firstResult);
    }

    private List<Especialidades> findEspecialidadesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Especialidades.class));
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

    public Especialidades findEspecialidades(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Especialidades.class, id);
        } finally {
            em.close();
        }
    }

    public int getEspecialidadesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Especialidades> rt = cq.from(Especialidades.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
