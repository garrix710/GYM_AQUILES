/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author tuzos
 */
@Entity
@Table(name = "especialidades")
@NamedQueries({
    @NamedQuery(name = "Especialidades.findAll", query = "SELECT e FROM Especialidades e"),
    @NamedQuery(name = "Especialidades.findByEspecialidadId", query = "SELECT e FROM Especialidades e WHERE e.especialidadId = :especialidadId"),
    @NamedQuery(name = "Especialidades.findByNombreEspecialidad", query = "SELECT e FROM Especialidades e WHERE e.nombreEspecialidad = :nombreEspecialidad")})
public class Especialidades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "especialidad_id")
    private Integer especialidadId;
    @Basic(optional = false)
    @Column(name = "nombre_especialidad")
    private String nombreEspecialidad;
    @ManyToMany(mappedBy = "especialidadesList")
    private List<Entrenador> entrenadorList;

    public Especialidades() {
    }

    public Especialidades(Integer especialidadId) {
        this.especialidadId = especialidadId;
    }

    public Especialidades(Integer especialidadId, String nombreEspecialidad) {
        this.especialidadId = especialidadId;
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public Integer getEspecialidadId() {
        return especialidadId;
    }

    public void setEspecialidadId(Integer especialidadId) {
        this.especialidadId = especialidadId;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public List<Entrenador> getEntrenadorList() {
        return entrenadorList;
    }

    public void setEntrenadorList(List<Entrenador> entrenadorList) {
        this.entrenadorList = entrenadorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (especialidadId != null ? especialidadId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Especialidades)) {
            return false;
        }
        Especialidades other = (Especialidades) object;
        if ((this.especialidadId == null && other.especialidadId != null) || (this.especialidadId != null && !this.especialidadId.equals(other.especialidadId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombreEspecialidad;
    }

    
}
