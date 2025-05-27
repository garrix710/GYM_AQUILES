/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "pagoentrenador")
@NamedQueries({
    @NamedQuery(name = "Pagoentrenador.findAll", query = "SELECT p FROM Pagoentrenador p"),
    @NamedQuery(name = "Pagoentrenador.findByPagoId", query = "SELECT p FROM Pagoentrenador p WHERE p.pagoId = :pagoId"),
    @NamedQuery(name = "Pagoentrenador.findByFechaPago", query = "SELECT p FROM Pagoentrenador p WHERE p.fechaPago = :fechaPago"),
    @NamedQuery(name = "Pagoentrenador.findByMontoPago", query = "SELECT p FROM Pagoentrenador p WHERE p.montoPago = :montoPago"),
    @NamedQuery(name = "Pagoentrenador.findByDescripcionPago", query = "SELECT p FROM Pagoentrenador p WHERE p.descripcionPago = :descripcionPago")})
public class Pagoentrenador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pago_id")
    private Integer pagoId;
    @Basic(optional = false)
    @Column(name = "fecha_pago")
    @Temporal(TemporalType.DATE)
    private Date fechaPago;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "monto_pago")
    private BigDecimal montoPago;
    @Column(name = "descripcion_pago")
    private String descripcionPago;
    @JoinColumn(name = "entrenador_id", referencedColumnName = "entrenador_id")
    @ManyToOne(optional = false)
    private Entrenador entrenadorId;

    public Pagoentrenador() {
    }

    public Pagoentrenador(Integer pagoId) {
        this.pagoId = pagoId;
    }

    public Pagoentrenador(Integer pagoId, Date fechaPago, BigDecimal montoPago) {
        this.pagoId = pagoId;
        this.fechaPago = fechaPago;
        this.montoPago = montoPago;
    }

    public Integer getPagoId() {
        return pagoId;
    }

    public void setPagoId(Integer pagoId) {
        this.pagoId = pagoId;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public BigDecimal getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(BigDecimal montoPago) {
        this.montoPago = montoPago;
    }

    public String getDescripcionPago() {
        return descripcionPago;
    }

    public void setDescripcionPago(String descripcionPago) {
        this.descripcionPago = descripcionPago;
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
        hash += (pagoId != null ? pagoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pagoentrenador)) {
            return false;
        }
        Pagoentrenador other = (Pagoentrenador) object;
        if ((this.pagoId == null && other.pagoId != null) || (this.pagoId != null && !this.pagoId.equals(other.pagoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Pagoentrenador[ pagoId=" + pagoId + " ]";
    }
    
}
