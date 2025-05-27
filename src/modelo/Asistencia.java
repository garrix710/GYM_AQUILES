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
@Table(name = "asistencia")
@NamedQueries({
    @NamedQuery(name = "Asistencia.findAll", query = "SELECT a FROM Asistencia a"),
    @NamedQuery(name = "Asistencia.findByAsistenciaId", query = "SELECT a FROM Asistencia a WHERE a.asistenciaId = :asistenciaId"),
    @NamedQuery(name = "Asistencia.findByFechaHoraEntrada", query = "SELECT a FROM Asistencia a WHERE a.fechaHoraEntrada = :fechaHoraEntrada"),
    @NamedQuery(name = "Asistencia.findByFechaHoraSalida", query = "SELECT a FROM Asistencia a WHERE a.fechaHoraSalida = :fechaHoraSalida")})
public class Asistencia implements Serializable {

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
    @JoinColumn(name = "cliente_id", referencedColumnName = "cliente_id")
    @ManyToOne(optional = false)
    private Clientes clienteId;

    public Asistencia() {
    }

    public Asistencia(Integer asistenciaId) {
        this.asistenciaId = asistenciaId;
    }

    public Asistencia(Integer asistenciaId, Date fechaHoraEntrada) {
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

    public Clientes getClienteId() {
        return clienteId;
    }

    public void setClienteId(Clientes clienteId) {
        this.clienteId = clienteId;
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
        if (!(object instanceof Asistencia)) {
            return false;
        }
        Asistencia other = (Asistencia) object;
        if ((this.asistenciaId == null && other.asistenciaId != null) || (this.asistenciaId != null && !this.asistenciaId.equals(other.asistenciaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Asistencia[ asistenciaId=" + asistenciaId + " ]";
    }
    
}
