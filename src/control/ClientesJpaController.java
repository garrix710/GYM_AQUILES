/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import com.digitalpersona.onetouch.DPFPFeatureSet;
import com.digitalpersona.onetouch.DPFPGlobal;
import com.digitalpersona.onetouch.DPFPTemplate;
import com.digitalpersona.onetouch.verification.DPFPVerification;
import com.digitalpersona.onetouch.verification.DPFPVerificationResult;
import control.exceptions.IllegalOrphanException;
import control.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import modelo.Pagomembresia;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import modelo.Asistencia;
import modelo.Clientes;
import modelo.Membresia;

/**
 *
 * @author tuzos
 */
public class ClientesJpaController implements Serializable {

    public ClientesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Clientes clientes) {
        if (clientes.getPagomembresiaList() == null) {
            clientes.setPagomembresiaList(new ArrayList<Pagomembresia>());
        }
        if (clientes.getAsistenciaList() == null) {
            clientes.setAsistenciaList(new ArrayList<Asistencia>());
        }
        if (clientes.getMembresiaList() == null) {
            clientes.setMembresiaList(new ArrayList<Membresia>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Pagomembresia> attachedPagomembresiaList = new ArrayList<Pagomembresia>();
            for (Pagomembresia pagomembresiaListPagomembresiaToAttach : clientes.getPagomembresiaList()) {
                pagomembresiaListPagomembresiaToAttach = em.getReference(pagomembresiaListPagomembresiaToAttach.getClass(), pagomembresiaListPagomembresiaToAttach.getPagoId());
                attachedPagomembresiaList.add(pagomembresiaListPagomembresiaToAttach);
            }
            clientes.setPagomembresiaList(attachedPagomembresiaList);
            List<Asistencia> attachedAsistenciaList = new ArrayList<Asistencia>();
            for (Asistencia asistenciaListAsistenciaToAttach : clientes.getAsistenciaList()) {
                asistenciaListAsistenciaToAttach = em.getReference(asistenciaListAsistenciaToAttach.getClass(), asistenciaListAsistenciaToAttach.getAsistenciaId());
                attachedAsistenciaList.add(asistenciaListAsistenciaToAttach);
            }
            clientes.setAsistenciaList(attachedAsistenciaList);
            List<Membresia> attachedMembresiaList = new ArrayList<Membresia>();
            for (Membresia membresiaListMembresiaToAttach : clientes.getMembresiaList()) {
                membresiaListMembresiaToAttach = em.getReference(membresiaListMembresiaToAttach.getClass(), membresiaListMembresiaToAttach.getMembresiaId());
                attachedMembresiaList.add(membresiaListMembresiaToAttach);
            }
            clientes.setMembresiaList(attachedMembresiaList);
            em.persist(clientes);
            for (Pagomembresia pagomembresiaListPagomembresia : clientes.getPagomembresiaList()) {
                Clientes oldClienteIdOfPagomembresiaListPagomembresia = pagomembresiaListPagomembresia.getClienteId();
                pagomembresiaListPagomembresia.setClienteId(clientes);
                pagomembresiaListPagomembresia = em.merge(pagomembresiaListPagomembresia);
                if (oldClienteIdOfPagomembresiaListPagomembresia != null) {
                    oldClienteIdOfPagomembresiaListPagomembresia.getPagomembresiaList().remove(pagomembresiaListPagomembresia);
                    oldClienteIdOfPagomembresiaListPagomembresia = em.merge(oldClienteIdOfPagomembresiaListPagomembresia);
                }
            }
            for (Asistencia asistenciaListAsistencia : clientes.getAsistenciaList()) {
                Clientes oldClienteIdOfAsistenciaListAsistencia = asistenciaListAsistencia.getClienteId();
                asistenciaListAsistencia.setClienteId(clientes);
                asistenciaListAsistencia = em.merge(asistenciaListAsistencia);
                if (oldClienteIdOfAsistenciaListAsistencia != null) {
                    oldClienteIdOfAsistenciaListAsistencia.getAsistenciaList().remove(asistenciaListAsistencia);
                    oldClienteIdOfAsistenciaListAsistencia = em.merge(oldClienteIdOfAsistenciaListAsistencia);
                }
            }
            for (Membresia membresiaListMembresia : clientes.getMembresiaList()) {
                Clientes oldClienteIdOfMembresiaListMembresia = membresiaListMembresia.getClienteId();
                membresiaListMembresia.setClienteId(clientes);
                membresiaListMembresia = em.merge(membresiaListMembresia);
                if (oldClienteIdOfMembresiaListMembresia != null) {
                    oldClienteIdOfMembresiaListMembresia.getMembresiaList().remove(membresiaListMembresia);
                    oldClienteIdOfMembresiaListMembresia = em.merge(oldClienteIdOfMembresiaListMembresia);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Clientes clientes) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Clientes persistentClientes = em.find(Clientes.class, clientes.getClienteId());
            List<Pagomembresia> pagomembresiaListOld = persistentClientes.getPagomembresiaList();
            List<Pagomembresia> pagomembresiaListNew = clientes.getPagomembresiaList();
            List<Asistencia> asistenciaListOld = persistentClientes.getAsistenciaList();
            List<Asistencia> asistenciaListNew = clientes.getAsistenciaList();
            List<Membresia> membresiaListOld = persistentClientes.getMembresiaList();
            List<Membresia> membresiaListNew = clientes.getMembresiaList();
            List<String> illegalOrphanMessages = null;
            for (Pagomembresia pagomembresiaListOldPagomembresia : pagomembresiaListOld) {
                if (!pagomembresiaListNew.contains(pagomembresiaListOldPagomembresia)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Pagomembresia " + pagomembresiaListOldPagomembresia + " since its clienteId field is not nullable.");
                }
            }
            for (Asistencia asistenciaListOldAsistencia : asistenciaListOld) {
                if (!asistenciaListNew.contains(asistenciaListOldAsistencia)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Asistencia " + asistenciaListOldAsistencia + " since its clienteId field is not nullable.");
                }
            }
            for (Membresia membresiaListOldMembresia : membresiaListOld) {
                if (!membresiaListNew.contains(membresiaListOldMembresia)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Membresia " + membresiaListOldMembresia + " since its clienteId field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            List<Pagomembresia> attachedPagomembresiaListNew = new ArrayList<Pagomembresia>();
            for (Pagomembresia pagomembresiaListNewPagomembresiaToAttach : pagomembresiaListNew) {
                pagomembresiaListNewPagomembresiaToAttach = em.getReference(pagomembresiaListNewPagomembresiaToAttach.getClass(), pagomembresiaListNewPagomembresiaToAttach.getPagoId());
                attachedPagomembresiaListNew.add(pagomembresiaListNewPagomembresiaToAttach);
            }
            pagomembresiaListNew = attachedPagomembresiaListNew;
            clientes.setPagomembresiaList(pagomembresiaListNew);
            List<Asistencia> attachedAsistenciaListNew = new ArrayList<Asistencia>();
            for (Asistencia asistenciaListNewAsistenciaToAttach : asistenciaListNew) {
                asistenciaListNewAsistenciaToAttach = em.getReference(asistenciaListNewAsistenciaToAttach.getClass(), asistenciaListNewAsistenciaToAttach.getAsistenciaId());
                attachedAsistenciaListNew.add(asistenciaListNewAsistenciaToAttach);
            }
            asistenciaListNew = attachedAsistenciaListNew;
            clientes.setAsistenciaList(asistenciaListNew);
            List<Membresia> attachedMembresiaListNew = new ArrayList<Membresia>();
            for (Membresia membresiaListNewMembresiaToAttach : membresiaListNew) {
                membresiaListNewMembresiaToAttach = em.getReference(membresiaListNewMembresiaToAttach.getClass(), membresiaListNewMembresiaToAttach.getMembresiaId());
                attachedMembresiaListNew.add(membresiaListNewMembresiaToAttach);
            }
            membresiaListNew = attachedMembresiaListNew;
            clientes.setMembresiaList(membresiaListNew);
            clientes = em.merge(clientes);
            for (Pagomembresia pagomembresiaListNewPagomembresia : pagomembresiaListNew) {
                if (!pagomembresiaListOld.contains(pagomembresiaListNewPagomembresia)) {
                    Clientes oldClienteIdOfPagomembresiaListNewPagomembresia = pagomembresiaListNewPagomembresia.getClienteId();
                    pagomembresiaListNewPagomembresia.setClienteId(clientes);
                    pagomembresiaListNewPagomembresia = em.merge(pagomembresiaListNewPagomembresia);
                    if (oldClienteIdOfPagomembresiaListNewPagomembresia != null && !oldClienteIdOfPagomembresiaListNewPagomembresia.equals(clientes)) {
                        oldClienteIdOfPagomembresiaListNewPagomembresia.getPagomembresiaList().remove(pagomembresiaListNewPagomembresia);
                        oldClienteIdOfPagomembresiaListNewPagomembresia = em.merge(oldClienteIdOfPagomembresiaListNewPagomembresia);
                    }
                }
            }
            for (Asistencia asistenciaListNewAsistencia : asistenciaListNew) {
                if (!asistenciaListOld.contains(asistenciaListNewAsistencia)) {
                    Clientes oldClienteIdOfAsistenciaListNewAsistencia = asistenciaListNewAsistencia.getClienteId();
                    asistenciaListNewAsistencia.setClienteId(clientes);
                    asistenciaListNewAsistencia = em.merge(asistenciaListNewAsistencia);
                    if (oldClienteIdOfAsistenciaListNewAsistencia != null && !oldClienteIdOfAsistenciaListNewAsistencia.equals(clientes)) {
                        oldClienteIdOfAsistenciaListNewAsistencia.getAsistenciaList().remove(asistenciaListNewAsistencia);
                        oldClienteIdOfAsistenciaListNewAsistencia = em.merge(oldClienteIdOfAsistenciaListNewAsistencia);
                    }
                }
            }
            for (Membresia membresiaListNewMembresia : membresiaListNew) {
                if (!membresiaListOld.contains(membresiaListNewMembresia)) {
                    Clientes oldClienteIdOfMembresiaListNewMembresia = membresiaListNewMembresia.getClienteId();
                    membresiaListNewMembresia.setClienteId(clientes);
                    membresiaListNewMembresia = em.merge(membresiaListNewMembresia);
                    if (oldClienteIdOfMembresiaListNewMembresia != null && !oldClienteIdOfMembresiaListNewMembresia.equals(clientes)) {
                        oldClienteIdOfMembresiaListNewMembresia.getMembresiaList().remove(membresiaListNewMembresia);
                        oldClienteIdOfMembresiaListNewMembresia = em.merge(oldClienteIdOfMembresiaListNewMembresia);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = clientes.getClienteId();
                if (findClientes(id) == null) {
                    throw new NonexistentEntityException("The clientes with id " + id + " no longer exists.");
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
            Clientes clientes;
            try {
                clientes = em.getReference(Clientes.class, id);
                clientes.getClienteId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The clientes with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<Pagomembresia> pagomembresiaListOrphanCheck = clientes.getPagomembresiaList();
            for (Pagomembresia pagomembresiaListOrphanCheckPagomembresia : pagomembresiaListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Clientes (" + clientes + ") cannot be destroyed since the Pagomembresia " + pagomembresiaListOrphanCheckPagomembresia + " in its pagomembresiaList field has a non-nullable clienteId field.");
            }
            List<Asistencia> asistenciaListOrphanCheck = clientes.getAsistenciaList();
            for (Asistencia asistenciaListOrphanCheckAsistencia : asistenciaListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Clientes (" + clientes + ") cannot be destroyed since the Asistencia " + asistenciaListOrphanCheckAsistencia + " in its asistenciaList field has a non-nullable clienteId field.");
            }
            List<Membresia> membresiaListOrphanCheck = clientes.getMembresiaList();
            for (Membresia membresiaListOrphanCheckMembresia : membresiaListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Clientes (" + clientes + ") cannot be destroyed since the Membresia " + membresiaListOrphanCheckMembresia + " in its membresiaList field has a non-nullable clienteId field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(clientes);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Clientes> findClientesEntities() {
        return findClientesEntities(true, -1, -1);
    }

    public List<Clientes> findClientesEntities(int maxResults, int firstResult) {
        return findClientesEntities(false, maxResults, firstResult);
    }

    private List<Clientes> findClientesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Clientes.class));
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

    public Clientes findClientes(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Clientes.class, id);
        } finally {
            em.close();
        }
    }

    public int getClientesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Clientes> rt = cq.from(Clientes.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    public Clientes findClientePorHuella(DPFPFeatureSet featuresCapturados) {
    if (featuresCapturados == null) return null;

    EntityManager em = getEntityManager();
    DPFPVerification verificador = DPFPGlobal.getVerificationFactory().createVerification();

    try {
        // Obtener todos los clientes con huella
        List<Clientes> clientes = em.createQuery("SELECT c FROM Clientes c WHERE c.huellaDactilar IS NOT NULL", Clientes.class).getResultList();

        for (Clientes cliente : clientes) {
            byte[] huellaCliente = cliente.getHuellaDactilar();
            if (huellaCliente != null) {
                DPFPTemplate templateCliente = DPFPGlobal.getTemplateFactory().createTemplate(huellaCliente);

                DPFPVerificationResult result = verificador.verify(featuresCapturados, templateCliente);

                if (result.isVerified()) {
                    return cliente;  // Coincidencia encontrada
                }
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        em.close();
    }

    return null;  // No se encontró coincidencia
}




    
}
