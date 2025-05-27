/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author tuzos
 */
@Entity
@Table(name = "membresia")
@NamedQueries({
    @NamedQuery(name = "Membresia.findAll", query = "SELECT m FROM Membresia m"),
    @NamedQuery(name = "Membresia.findByMembresiaId", query = "SELECT m FROM Membresia m WHERE m.membresiaId = :membresiaId"),
    @NamedQuery(name = "Membresia.findByTipoMembresia", query = "SELECT m FROM Membresia m WHERE m.tipoMembresia = :tipoMembresia"),
    @NamedQuery(name = "Membresia.findByFechaInicio", query = "SELECT m FROM Membresia m WHERE m.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "Membresia.findByFechaVencimiento", query = "SELECT m FROM Membresia m WHERE m.fechaVencimiento = :fechaVencimiento"),
    @NamedQuery(name = "Membresia.findByEstadoMembresia", query = "SELECT m FROM Membresia m WHERE m.estadoMembresia = :estadoMembresia"),
    @NamedQuery(name = "Membresia.findByPrecio", query = "SELECT m FROM Membresia m WHERE m.precio = :precio")})
public class Membresia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "membresia_id")
    private Integer membresiaId;
    @Basic(optional = false)
    @Column(name = "tipo_membresia")
    private String tipoMembresia;
    @Basic(optional = false)
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Basic(optional = false)
    @Column(name = "fecha_vencimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaVencimiento;
    @Basic(optional = false)
    @Column(name = "estado_membresia")
    private String estadoMembresia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "precio")
    private BigDecimal precio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "membresiaId")
    private List<Pagomembresia> pagomembresiaList;
    @JoinColumn(name = "cliente_id", referencedColumnName = "cliente_id")
    @ManyToOne(optional = false)
    private Clientes clienteId;

    public Membresia() {
    }

    public Membresia(Integer membresiaId) {
        this.membresiaId = membresiaId;
    }

    public Membresia(Integer membresiaId, String tipoMembresia, Date fechaInicio, Date fechaVencimiento, String estadoMembresia, BigDecimal precio) {
        this.membresiaId = membresiaId;
        this.tipoMembresia = tipoMembresia;
        this.fechaInicio = fechaInicio;
        this.fechaVencimiento = fechaVencimiento;
        this.estadoMembresia = estadoMembresia;
        this.precio = precio;
    }

    public Integer getMembresiaId() {
        return membresiaId;
    }

    public void setMembresiaId(Integer membresiaId) {
        this.membresiaId = membresiaId;
    }

    public String getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(String tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getEstadoMembresia() {
        return estadoMembresia;
    }

    public void setEstadoMembresia(String estadoMembresia) {
        this.estadoMembresia = estadoMembresia;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public List<Pagomembresia> getPagomembresiaList() {
        return pagomembresiaList;
    }

    public void setPagomembresiaList(List<Pagomembresia> pagomembresiaList) {
        this.pagomembresiaList = pagomembresiaList;
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
        hash += (membresiaId != null ? membresiaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Membresia)) {
            return false;
        }
        Membresia other = (Membresia) object;
        if ((this.membresiaId == null && other.membresiaId != null) || (this.membresiaId != null && !this.membresiaId.equals(other.membresiaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ""+membresiaId;
    }
    
}
