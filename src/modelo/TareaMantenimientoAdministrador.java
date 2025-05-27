/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author tuzos
 */
@Entity
@Table(name = "tarea_mantenimiento_administrador")
@NamedQueries({
    @NamedQuery(name = "TareaMantenimientoAdministrador.findAll", query = "SELECT t FROM TareaMantenimientoAdministrador t"),
    @NamedQuery(name = "TareaMantenimientoAdministrador.findByTareaId", query = "SELECT t FROM TareaMantenimientoAdministrador t WHERE t.tareaId = :tareaId"),
    @NamedQuery(name = "TareaMantenimientoAdministrador.findByDescripcionTarea", query = "SELECT t FROM TareaMantenimientoAdministrador t WHERE t.descripcionTarea = :descripcionTarea"),
    @NamedQuery(name = "TareaMantenimientoAdministrador.findByEstadoTarea", query = "SELECT t FROM TareaMantenimientoAdministrador t WHERE t.estadoTarea = :estadoTarea"),
    @NamedQuery(name = "TareaMantenimientoAdministrador.findByFechaTarea", query = "SELECT t FROM TareaMantenimientoAdministrador t WHERE t.fechaTarea = :fechaTarea")})
public class TareaMantenimientoAdministrador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tarea_id")
    private Integer tareaId;
    @Basic(optional = false)
    @Column(name = "descripcion_tarea")
    private String descripcionTarea;
    @Basic(optional = false)
    @Column(name = "estado_tarea")
    private String estadoTarea;
    @Basic(optional = false)
    @Column(name = "fecha_tarea")
    @Temporal(TemporalType.DATE)
    private Date fechaTarea;
    @JoinColumn(name = "administrador_id", referencedColumnName = "administrador_id")
    @ManyToOne(optional = false)
    private Administrador administradorId;

    public TareaMantenimientoAdministrador() {
    }

    public TareaMantenimientoAdministrador(Integer tareaId) {
        this.tareaId = tareaId;
    }

    public TareaMantenimientoAdministrador(Integer tareaId, String descripcionTarea, String estadoTarea, Date fechaTarea) {
        this.tareaId = tareaId;
        this.descripcionTarea = descripcionTarea;
        this.estadoTarea = estadoTarea;
        this.fechaTarea = fechaTarea;
    }

    public Integer getTareaId() {
        return tareaId;
    }

    public void setTareaId(Integer tareaId) {
        this.tareaId = tareaId;
    }

    public String getDescripcionTarea() {
        return descripcionTarea;
    }

    public void setDescripcionTarea(String descripcionTarea) {
        this.descripcionTarea = descripcionTarea;
    }

    public String getEstadoTarea() {
        return estadoTarea;
    }

    public void setEstadoTarea(String estadoTarea) {
        this.estadoTarea = estadoTarea;
    }

    public Date getFechaTarea() {
        return fechaTarea;
    }

    public void setFechaTarea(Date fechaTarea) {
        this.fechaTarea = fechaTarea;
    }

    public Administrador getAdministradorId() {
        return administradorId;
    }

    public void setAdministradorId(Administrador administradorId) {
        this.administradorId = administradorId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tareaId != null ? tareaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TareaMantenimientoAdministrador)) {
            return false;
        }
        TareaMantenimientoAdministrador other = (TareaMantenimientoAdministrador) object;
        if ((this.tareaId == null && other.tareaId != null) || (this.tareaId != null && !this.tareaId.equals(other.tareaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.TareaMantenimientoAdministrador[ tareaId=" + tareaId + " ]";
    }
    
}
