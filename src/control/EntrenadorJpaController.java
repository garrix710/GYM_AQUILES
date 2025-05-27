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
import modelo.Especialidades;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import modelo.Horario;
import modelo.TareaMantenimientoEntrenador;
import modelo.Pagoentrenador;
import modelo.Asistenciaentrenador;
import modelo.Entrenador;

/**
 *
 * @author tuzos
 */
public class EntrenadorJpaController implements Serializable {

    public EntrenadorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Entrenador entrenador) {
        if (entrenador.getEspecialidadesList() == null) {
            entrenador.setEspecialidadesList(new ArrayList<Especialidades>());
        }
        if (entrenador.getHorarioList() == null) {
            entrenador.setHorarioList(new ArrayList<Horario>());
        }
        if (entrenador.getTareaMantenimientoEntrenadorList() == null) {
            entrenador.setTareaMantenimientoEntrenadorList(new ArrayList<TareaMantenimientoEntrenador>());
        }
        if (entrenador.getPagoentrenadorList() == null) {
            entrenador.setPagoentrenadorList(new ArrayList<Pagoentrenador>());
        }
        if (entrenador.getAsistenciaentrenadorList() == null) {
            entrenador.setAsistenciaentrenadorList(new ArrayList<Asistenciaentrenador>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Especialidades> attachedEspecialidadesList = new ArrayList<Especialidades>();
            for (Especialidades especialidadesListEspecialidadesToAttach : entrenador.getEspecialidadesList()) {
                especialidadesListEspecialidadesToAttach = em.getReference(especialidadesListEspecialidadesToAttach.getClass(), especialidadesListEspecialidadesToAttach.getEspecialidadId());
                attachedEspecialidadesList.add(especialidadesListEspecialidadesToAttach);
            }
            entrenador.setEspecialidadesList(attachedEspecialidadesList);
            List<Horario> attachedHorarioList = new ArrayList<Horario>();
            for (Horario horarioListHorarioToAttach : entrenador.getHorarioList()) {
                horarioListHorarioToAttach = em.getReference(horarioListHorarioToAttach.getClass(), horarioListHorarioToAttach.getHorarioId());
                attachedHorarioList.add(horarioListHorarioToAttach);
            }
            entrenador.setHorarioList(attachedHorarioList);
            List<TareaMantenimientoEntrenador> attachedTareaMantenimientoEntrenadorList = new ArrayList<TareaMantenimientoEntrenador>();
            for (TareaMantenimientoEntrenador tareaMantenimientoEntrenadorListTareaMantenimientoEntrenadorToAttach : entrenador.getTareaMantenimientoEntrenadorList()) {
                tareaMantenimientoEntrenadorListTareaMantenimientoEntrenadorToAttach = em.getReference(tareaMantenimientoEntrenadorListTareaMantenimientoEntrenadorToAttach.getClass(), tareaMantenimientoEntrenadorListTareaMantenimientoEntrenadorToAttach.getTareaId());
                attachedTareaMantenimientoEntrenadorList.add(tareaMantenimientoEntrenadorListTareaMantenimientoEntrenadorToAttach);
            }
            entrenador.setTareaMantenimientoEntrenadorList(attachedTareaMantenimientoEntrenadorList);
            List<Pagoentrenador> attachedPagoentrenadorList = new ArrayList<Pagoentrenador>();
            for (Pagoentrenador pagoentrenadorListPagoentrenadorToAttach : entrenador.getPagoentrenadorList()) {
                pagoentrenadorListPagoentrenadorToAttach = em.getReference(pagoentrenadorListPagoentrenadorToAttach.getClass(), pagoentrenadorListPagoentrenadorToAttach.getPagoId());
                attachedPagoentrenadorList.add(pagoentrenadorListPagoentrenadorToAttach);
            }
            entrenador.setPagoentrenadorList(attachedPagoentrenadorList);
            List<Asistenciaentrenador> attachedAsistenciaentrenadorList = new ArrayList<Asistenciaentrenador>();
            for (Asistenciaentrenador asistenciaentrenadorListAsistenciaentrenadorToAttach : entrenador.getAsistenciaentrenadorList()) {
                asistenciaentrenadorListAsistenciaentrenadorToAttach = em.getReference(asistenciaentrenadorListAsistenciaentrenadorToAttach.getClass(), asistenciaentrenadorListAsistenciaentrenadorToAttach.getAsistenciaId());
                attachedAsistenciaentrenadorList.add(asistenciaentrenadorListAsistenciaentrenadorToAttach);
            }
            entrenador.setAsistenciaentrenadorList(attachedAsistenciaentrenadorList);
            em.persist(entrenador);
            for (Especialidades especialidadesListEspecialidades : entrenador.getEspecialidadesList()) {
                especialidadesListEspecialidades.getEntrenadorList().add(entrenador);
                especialidadesListEspecialidades = em.merge(especialidadesListEspecialidades);
            }
            for (Horario horarioListHorario : entrenador.getHorarioList()) {
                Entrenador oldEntrenadorIdOfHorarioListHorario = horarioListHorario.getEntrenadorId();
                horarioListHorario.setEntrenadorId(entrenador);
                horarioListHorario = em.merge(horarioListHorario);
                if (oldEntrenadorIdOfHorarioListHorario != null) {
                    oldEntrenadorIdOfHorarioListHorario.getHorarioList().remove(horarioListHorario);
                    oldEntrenadorIdOfHorarioListHorario = em.merge(oldEntrenadorIdOfHorarioListHorario);
                }
            }
            for (TareaMantenimientoEntrenador tareaMantenimientoEntrenadorListTareaMantenimientoEntrenador : entrenador.getTareaMantenimientoEntrenadorList()) {
                Entrenador oldEntrenadorIdOfTareaMantenimientoEntrenadorListTareaMantenimientoEntrenador = tareaMantenimientoEntrenadorListTareaMantenimientoEntrenador.getEntrenadorId();
                tareaMantenimientoEntrenadorListTareaMantenimientoEntrenador.setEntrenadorId(entrenador);
                tareaMantenimientoEntrenadorListTareaMantenimientoEntrenador = em.merge(tareaMantenimientoEntrenadorListTareaMantenimientoEntrenador);
                if (oldEntrenadorIdOfTareaMantenimientoEntrenadorListTareaMantenimientoEntrenador != null) {
                    oldEntrenadorIdOfTareaMantenimientoEntrenadorListTareaMantenimientoEntrenador.getTareaMantenimientoEntrenadorList().remove(tareaMantenimientoEntrenadorListTareaMantenimientoEntrenador);
                    oldEntrenadorIdOfTareaMantenimientoEntrenadorListTareaMantenimientoEntrenador = em.merge(oldEntrenadorIdOfTareaMantenimientoEntrenadorListTareaMantenimientoEntrenador);
                }
            }
            for (Pagoentrenador pagoentrenadorListPagoentrenador : entrenador.getPagoentrenadorList()) {
                Entrenador oldEntrenadorIdOfPagoentrenadorListPagoentrenador = pagoentrenadorListPagoentrenador.getEntrenadorId();
                pagoentrenadorListPagoentrenador.setEntrenadorId(entrenador);
                pagoentrenadorListPagoentrenador = em.merge(pagoentrenadorListPagoentrenador);
                if (oldEntrenadorIdOfPagoentrenadorListPagoentrenador != null) {
                    oldEntrenadorIdOfPagoentrenadorListPagoentrenador.getPagoentrenadorList().remove(pagoentrenadorListPagoentrenador);
                    oldEntrenadorIdOfPagoentrenadorListPagoentrenador = em.merge(oldEntrenadorIdOfPagoentrenadorListPagoentrenador);
                }
            }
            for (Asistenciaentrenador asistenciaentrenadorListAsistenciaentrenador : entrenador.getAsistenciaentrenadorList()) {
                Entrenador oldEntrenadorIdOfAsistenciaentrenadorListAsistenciaentrenador = asistenciaentrenadorListAsistenciaentrenador.getEntrenadorId();
                asistenciaentrenadorListAsistenciaentrenador.setEntrenadorId(entrenador);
                asistenciaentrenadorListAsistenciaentrenador = em.merge(asistenciaentrenadorListAsistenciaentrenador);
                if (oldEntrenadorIdOfAsistenciaentrenadorListAsistenciaentrenador != null) {
                    oldEntrenadorIdOfAsistenciaentrenadorListAsistenciaentrenador.getAsistenciaentrenadorList().remove(asistenciaentrenadorListAsistenciaentrenador);
                    oldEntrenadorIdOfAsistenciaentrenadorListAsistenciaentrenador = em.merge(oldEntrenadorIdOfAsistenciaentrenadorListAsistenciaentrenador);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Entrenador entrenador) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Entrenador persistentEntrenador = em.find(Entrenador.class, entrenador.getEntrenadorId());
            List<Especialidades> especialidadesListOld = persistentEntrenador.getEspecialidadesList();
            List<Especialidades> especialidadesListNew = entrenador.getEspecialidadesList();
            List<Horario> horarioListOld = persistentEntrenador.getHorarioList();
            List<Horario> horarioListNew = entrenador.getHorarioList();
            List<TareaMantenimientoEntrenador> tareaMantenimientoEntrenadorListOld = persistentEntrenador.getTareaMantenimientoEntrenadorList();
            List<TareaMantenimientoEntrenador> tareaMantenimientoEntrenadorListNew = entrenador.getTareaMantenimientoEntrenadorList();
            List<Pagoentrenador> pagoentrenadorListOld = persistentEntrenador.getPagoentrenadorList();
            List<Pagoentrenador> pagoentrenadorListNew = entrenador.getPagoentrenadorList();
            List<Asistenciaentrenador> asistenciaentrenadorListOld = persistentEntrenador.getAsistenciaentrenadorList();
            List<Asistenciaentrenador> asistenciaentrenadorListNew = entrenador.getAsistenciaentrenadorList();
            List<String> illegalOrphanMessages = null;
            for (Horario horarioListOldHorario : horarioListOld) {
                if (!horarioListNew.contains(horarioListOldHorario)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Horario " + horarioListOldHorario + " since its entrenadorId field is not nullable.");
                }
            }
            for (TareaMantenimientoEntrenador tareaMantenimientoEntrenadorListOldTareaMantenimientoEntrenador : tareaMantenimientoEntrenadorListOld) {
                if (!tareaMantenimientoEntrenadorListNew.contains(tareaMantenimientoEntrenadorListOldTareaMantenimientoEntrenador)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain TareaMantenimientoEntrenador " + tareaMantenimientoEntrenadorListOldTareaMantenimientoEntrenador + " since its entrenadorId field is not nullable.");
                }
            }
            for (Pagoentrenador pagoentrenadorListOldPagoentrenador : pagoentrenadorListOld) {
                if (!pagoentrenadorListNew.contains(pagoentrenadorListOldPagoentrenador)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Pagoentrenador " + pagoentrenadorListOldPagoentrenador + " since its entrenadorId field is not nullable.");
                }
            }
            for (Asistenciaentrenador asistenciaentrenadorListOldAsistenciaentrenador : asistenciaentrenadorListOld) {
                if (!asistenciaentrenadorListNew.contains(asistenciaentrenadorListOldAsistenciaentrenador)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Asistenciaentrenador " + asistenciaentrenadorListOldAsistenciaentrenador + " since its entrenadorId field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            List<Especialidades> attachedEspecialidadesListNew = new ArrayList<Especialidades>();
            for (Especialidades especialidadesListNewEspecialidadesToAttach : especialidadesListNew) {
                especialidadesListNewEspecialidadesToAttach = em.getReference(especialidadesListNewEspecialidadesToAttach.getClass(), especialidadesListNewEspecialidadesToAttach.getEspecialidadId());
                attachedEspecialidadesListNew.add(especialidadesListNewEspecialidadesToAttach);
            }
            especialidadesListNew = attachedEspecialidadesListNew;
            entrenador.setEspecialidadesList(especialidadesListNew);
            List<Horario> attachedHorarioListNew = new ArrayList<Horario>();
            for (Horario horarioListNewHorarioToAttach : horarioListNew) {
                horarioListNewHorarioToAttach = em.getReference(horarioListNewHorarioToAttach.getClass(), horarioListNewHorarioToAttach.getHorarioId());
                attachedHorarioListNew.add(horarioListNewHorarioToAttach);
            }
            horarioListNew = attachedHorarioListNew;
            entrenador.setHorarioList(horarioListNew);
            List<TareaMantenimientoEntrenador> attachedTareaMantenimientoEntrenadorListNew = new ArrayList<TareaMantenimientoEntrenador>();
            for (TareaMantenimientoEntrenador tareaMantenimientoEntrenadorListNewTareaMantenimientoEntrenadorToAttach : tareaMantenimientoEntrenadorListNew) {
                tareaMantenimientoEntrenadorListNewTareaMantenimientoEntrenadorToAttach = em.getReference(tareaMantenimientoEntrenadorListNewTareaMantenimientoEntrenadorToAttach.getClass(), tareaMantenimientoEntrenadorListNewTareaMantenimientoEntrenadorToAttach.getTareaId());
                attachedTareaMantenimientoEntrenadorListNew.add(tareaMantenimientoEntrenadorListNewTareaMantenimientoEntrenadorToAttach);
            }
            tareaMantenimientoEntrenadorListNew = attachedTareaMantenimientoEntrenadorListNew;
            entrenador.setTareaMantenimientoEntrenadorList(tareaMantenimientoEntrenadorListNew);
            List<Pagoentrenador> attachedPagoentrenadorListNew = new ArrayList<Pagoentrenador>();
            for (Pagoentrenador pagoentrenadorListNewPagoentrenadorToAttach : pagoentrenadorListNew) {
                pagoentrenadorListNewPagoentrenadorToAttach = em.getReference(pagoentrenadorListNewPagoentrenadorToAttach.getClass(), pagoentrenadorListNewPagoentrenadorToAttach.getPagoId());
                attachedPagoentrenadorListNew.add(pagoentrenadorListNewPagoentrenadorToAttach);
            }
            pagoentrenadorListNew = attachedPagoentrenadorListNew;
            entrenador.setPagoentrenadorList(pagoentrenadorListNew);
            List<Asistenciaentrenador> attachedAsistenciaentrenadorListNew = new ArrayList<Asistenciaentrenador>();
            for (Asistenciaentrenador asistenciaentrenadorListNewAsistenciaentrenadorToAttach : asistenciaentrenadorListNew) {
                asistenciaentrenadorListNewAsistenciaentrenadorToAttach = em.getReference(asistenciaentrenadorListNewAsistenciaentrenadorToAttach.getClass(), asistenciaentrenadorListNewAsistenciaentrenadorToAttach.getAsistenciaId());
                attachedAsistenciaentrenadorListNew.add(asistenciaentrenadorListNewAsistenciaentrenadorToAttach);
            }
            asistenciaentrenadorListNew = attachedAsistenciaentrenadorListNew;
            entrenador.setAsistenciaentrenadorList(asistenciaentrenadorListNew);
            entrenador = em.merge(entrenador);
            for (Especialidades especialidadesListOldEspecialidades : especialidadesListOld) {
                if (!especialidadesListNew.contains(especialidadesListOldEspecialidades)) {
                    especialidadesListOldEspecialidades.getEntrenadorList().remove(entrenador);
                    especialidadesListOldEspecialidades = em.merge(especialidadesListOldEspecialidades);
                }
            }
            for (Especialidades especialidadesListNewEspecialidades : especialidadesListNew) {
                if (!especialidadesListOld.contains(especialidadesListNewEspecialidades)) {
                    especialidadesListNewEspecialidades.getEntrenadorList().add(entrenador);
                    especialidadesListNewEspecialidades = em.merge(especialidadesListNewEspecialidades);
                }
            }
            for (Horario horarioListNewHorario : horarioListNew) {
                if (!horarioListOld.contains(horarioListNewHorario)) {
                    Entrenador oldEntrenadorIdOfHorarioListNewHorario = horarioListNewHorario.getEntrenadorId();
                    horarioListNewHorario.setEntrenadorId(entrenador);
                    horarioListNewHorario = em.merge(horarioListNewHorario);
                    if (oldEntrenadorIdOfHorarioListNewHorario != null && !oldEntrenadorIdOfHorarioListNewHorario.equals(entrenador)) {
                        oldEntrenadorIdOfHorarioListNewHorario.getHorarioList().remove(horarioListNewHorario);
                        oldEntrenadorIdOfHorarioListNewHorario = em.merge(oldEntrenadorIdOfHorarioListNewHorario);
                    }
                }
            }
            for (TareaMantenimientoEntrenador tareaMantenimientoEntrenadorListNewTareaMantenimientoEntrenador : tareaMantenimientoEntrenadorListNew) {
                if (!tareaMantenimientoEntrenadorListOld.contains(tareaMantenimientoEntrenadorListNewTareaMantenimientoEntrenador)) {
                    Entrenador oldEntrenadorIdOfTareaMantenimientoEntrenadorListNewTareaMantenimientoEntrenador = tareaMantenimientoEntrenadorListNewTareaMantenimientoEntrenador.getEntrenadorId();
                    tareaMantenimientoEntrenadorListNewTareaMantenimientoEntrenador.setEntrenadorId(entrenador);
                    tareaMantenimientoEntrenadorListNewTareaMantenimientoEntrenador = em.merge(tareaMantenimientoEntrenadorListNewTareaMantenimientoEntrenador);
                    if (oldEntrenadorIdOfTareaMantenimientoEntrenadorListNewTareaMantenimientoEntrenador != null && !oldEntrenadorIdOfTareaMantenimientoEntrenadorListNewTareaMantenimientoEntrenador.equals(entrenador)) {
                        oldEntrenadorIdOfTareaMantenimientoEntrenadorListNewTareaMantenimientoEntrenador.getTareaMantenimientoEntrenadorList().remove(tareaMantenimientoEntrenadorListNewTareaMantenimientoEntrenador);
                        oldEntrenadorIdOfTareaMantenimientoEntrenadorListNewTareaMantenimientoEntrenador = em.merge(oldEntrenadorIdOfTareaMantenimientoEntrenadorListNewTareaMantenimientoEntrenador);
                    }
                }
            }
            for (Pagoentrenador pagoentrenadorListNewPagoentrenador : pagoentrenadorListNew) {
                if (!pagoentrenadorListOld.contains(pagoentrenadorListNewPagoentrenador)) {
                    Entrenador oldEntrenadorIdOfPagoentrenadorListNewPagoentrenador = pagoentrenadorListNewPagoentrenador.getEntrenadorId();
                    pagoentrenadorListNewPagoentrenador.setEntrenadorId(entrenador);
                    pagoentrenadorListNewPagoentrenador = em.merge(pagoentrenadorListNewPagoentrenador);
                    if (oldEntrenadorIdOfPagoentrenadorListNewPagoentrenador != null && !oldEntrenadorIdOfPagoentrenadorListNewPagoentrenador.equals(entrenador)) {
                        oldEntrenadorIdOfPagoentrenadorListNewPagoentrenador.getPagoentrenadorList().remove(pagoentrenadorListNewPagoentrenador);
                        oldEntrenadorIdOfPagoentrenadorListNewPagoentrenador = em.merge(oldEntrenadorIdOfPagoentrenadorListNewPagoentrenador);
                    }
                }
            }
            for (Asistenciaentrenador asistenciaentrenadorListNewAsistenciaentrenador : asistenciaentrenadorListNew) {
                if (!asistenciaentrenadorListOld.contains(asistenciaentrenadorListNewAsistenciaentrenador)) {
                    Entrenador oldEntrenadorIdOfAsistenciaentrenadorListNewAsistenciaentrenador = asistenciaentrenadorListNewAsistenciaentrenador.getEntrenadorId();
                    asistenciaentrenadorListNewAsistenciaentrenador.setEntrenadorId(entrenador);
                    asistenciaentrenadorListNewAsistenciaentrenador = em.merge(asistenciaentrenadorListNewAsistenciaentrenador);
                    if (oldEntrenadorIdOfAsistenciaentrenadorListNewAsistenciaentrenador != null && !oldEntrenadorIdOfAsistenciaentrenadorListNewAsistenciaentrenador.equals(entrenador)) {
                        oldEntrenadorIdOfAsistenciaentrenadorListNewAsistenciaentrenador.getAsistenciaentrenadorList().remove(asistenciaentrenadorListNewAsistenciaentrenador);
                        oldEntrenadorIdOfAsistenciaentrenadorListNewAsistenciaentrenador = em.merge(oldEntrenadorIdOfAsistenciaentrenadorListNewAsistenciaentrenador);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = entrenador.getEntrenadorId();
                if (findEntrenador(id) == null) {
                    throw new NonexistentEntityException("The entrenador with id " + id + " no longer exists.");
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
            Entrenador entrenador;
            try {
                entrenador = em.getReference(Entrenador.class, id);
                entrenador.getEntrenadorId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The entrenador with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<Horario> horarioListOrphanCheck = entrenador.getHorarioList();
            for (Horario horarioListOrphanCheckHorario : horarioListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Entrenador (" + entrenador + ") cannot be destroyed since the Horario " + horarioListOrphanCheckHorario + " in its horarioList field has a non-nullable entrenadorId field.");
            }
            List<TareaMantenimientoEntrenador> tareaMantenimientoEntrenadorListOrphanCheck = entrenador.getTareaMantenimientoEntrenadorList();
            for (TareaMantenimientoEntrenador tareaMantenimientoEntrenadorListOrphanCheckTareaMantenimientoEntrenador : tareaMantenimientoEntrenadorListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Entrenador (" + entrenador + ") cannot be destroyed since the TareaMantenimientoEntrenador " + tareaMantenimientoEntrenadorListOrphanCheckTareaMantenimientoEntrenador + " in its tareaMantenimientoEntrenadorList field has a non-nullable entrenadorId field.");
            }
            List<Pagoentrenador> pagoentrenadorListOrphanCheck = entrenador.getPagoentrenadorList();
            for (Pagoentrenador pagoentrenadorListOrphanCheckPagoentrenador : pagoentrenadorListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Entrenador (" + entrenador + ") cannot be destroyed since the Pagoentrenador " + pagoentrenadorListOrphanCheckPagoentrenador + " in its pagoentrenadorList field has a non-nullable entrenadorId field.");
            }
            List<Asistenciaentrenador> asistenciaentrenadorListOrphanCheck = entrenador.getAsistenciaentrenadorList();
            for (Asistenciaentrenador asistenciaentrenadorListOrphanCheckAsistenciaentrenador : asistenciaentrenadorListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Entrenador (" + entrenador + ") cannot be destroyed since the Asistenciaentrenador " + asistenciaentrenadorListOrphanCheckAsistenciaentrenador + " in its asistenciaentrenadorList field has a non-nullable entrenadorId field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            List<Especialidades> especialidadesList = entrenador.getEspecialidadesList();
            for (Especialidades especialidadesListEspecialidades : especialidadesList) {
                especialidadesListEspecialidades.getEntrenadorList().remove(entrenador);
                especialidadesListEspecialidades = em.merge(especialidadesListEspecialidades);
            }
            em.remove(entrenador);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Entrenador> findEntrenadorEntities() {
        return findEntrenadorEntities(true, -1, -1);
    }

    public List<Entrenador> findEntrenadorEntities(int maxResults, int firstResult) {
        return findEntrenadorEntities(false, maxResults, firstResult);
    }

    private List<Entrenador> findEntrenadorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Entrenador.class));
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

    public Entrenador findEntrenador(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Entrenador.class, id);
        } finally {
            em.close();
        }
    }

    public int getEntrenadorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Entrenador> rt = cq.from(Entrenador.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
