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
@Table(name = "asistenciaentrenador")
@NamedQueries({
    @NamedQuery(name = "Asistenciaentrenador.findAll", query = "SELECT a FROM Asistenciaentrenador a"),
    @NamedQuery(name = "Asistenciaentrenador.findByAsistenciaId", query = "SELECT a FROM Asistenciaentrenador a WHERE a.asistenciaId = :asistenciaId"),
    @NamedQuery(name = "Asistenciaentrenador.findByFechaHoraEntrada", query = "SELECT a FROM Asistenciaentrenador a WHERE a.fechaHoraEntrada = :fechaHoraEntrada"),
    @NamedQuery(name = "Asistenciaentrenador.findByFechaHoraSalida", query = "SELECT a FROM Asistenciaentrenador a WHERE a.fechaHoraSalida = :fechaHoraSalida")})
public class Asistenciaentrenador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "asistencia_id")
    private Integer asistenciaId;
    @Basic(optional = false)
    @Column(name = "fecha_hora_entrada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraEntrada;
    @Column(name = "fecha_hora_salida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraSalida;
    @JoinColumn(name = "entrenador_id", referencedColumnName = "entrenador_id")
    @ManyToOne(optional = false)
    private Entrenador entrenadorId;

    public Asistenciaentrenador() {
    }

    public Asistenciaentrenador(Integer asistenciaId) {
        this.asistenciaId = asistenciaId;
    }

    public Asistenciaentrenador(Integer asistenciaId, Date fechaHoraEntrada) {
        this.asistenciaId = asistenciaId;
        this.fechaHoraEntrada = fechaHoraEntrada;
    }

    public Integer getAsistenciaId() {
        return asistenciaId;
    }

    public void setAsistenciaId(Integer asistenciaId) {
        this.asistenciaId = asistenciaId;
    }

    public Date getFechaHoraEntrada() {
        return fechaHoraEntrada;
    }

    public void setFechaHoraEntrada(Date fechaHoraEntrada) {
        this.fechaHoraEntrada = fechaHoraEntrada;
    }

    public Date getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public void setFechaHoraSalida(Date fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    public Entrenador getEntrenadorId() {
        return entrenadorId;
    }

    public void setEntrenadorId(Entrenador entrenadorId) {
        this.entrenadorId = entrenadorId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (asistenciaId != null ? asistenciaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asistenciaentrenador)) {
            return false;
        }
        Asistenciaentrenador other = (Asistenciaentrenador) object;
        if ((this.asistenciaId == null && other.asistenciaId != null) || (this.asistenciaId != null && !this.asistenciaId.equals(other.asistenciaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Asistenciaentrenador[ asistenciaId=" + asistenciaId + " ]";
    }
    
}
