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
@Table(name = "compras")
@NamedQueries({
    @NamedQuery(name = "Compras.findAll", query = "SELECT c FROM Compras c"),
    @NamedQuery(name = "Compras.findByCompraId", query = "SELECT c FROM Compras c WHERE c.compraId = :compraId"),
    @NamedQuery(name = "Compras.findByFechaCompra", query = "SELECT c FROM Compras c WHERE c.fechaCompra = :fechaCompra"),
    @NamedQuery(name = "Compras.findByDescripcionCompra", query = "SELECT c FROM Compras c WHERE c.descripcionCompra = :descripcionCompra"),
    @NamedQuery(name = "Compras.findByMontoCompra", query = "SELECT c FROM Compras c WHERE c.montoCompra = :montoCompra"),
    @NamedQuery(name = "Compras.findByProveedorNombre", query = "SELECT c FROM Compras c WHERE c.proveedorNombre = :proveedorNombre")})
public class Compras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "compra_id")
    private Integer compraId;
    @Basic(optional = false)
    @Column(name = "fecha_compra")
    @Temporal(TemporalType.DATE)
    private Date fechaCompra;
    @Basic(optional = false)
    @Column(name = "descripcion_compra")
    private String descripcionCompra;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "monto_compra")
    private BigDecimal montoCompra;
    @Column(name = "proveedor_nombre")
    private String proveedorNombre;

    public Compras() {
    }

    public Compras(Integer compraId) {
        this.compraId = compraId;
    }

    public Compras(Integer compraId, Date fechaCompra, String descripcionCompra, BigDecimal montoCompra) {
        this.compraId = compraId;
        this.fechaCompra = fechaCompra;
        this.descripcionCompra = descripcionCompra;
        this.montoCompra = montoCompra;
    }

    public Integer getCompraId() {
        return compraId;
    }

    public void setCompraId(Integer compraId) {
        this.compraId = compraId;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getDescripcionCompra() {
        return descripcionCompra;
    }

    public void setDescripcionCompra(String descripcionCompra) {
        this.descripcionCompra = descripcionCompra;
    }

    public BigDecimal getMontoCompra() {
        return montoCompra;
    }

    public void setMontoCompra(BigDecimal montoCompra) {
        this.montoCompra = montoCompra;
    }

    public String getProveedorNombre() {
        return proveedorNombre;
    }

    public void setProveedorNombre(String proveedorNombre) {
        this.proveedorNombre = proveedorNombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (compraId != null ? compraId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compras)) {
            return false;
        }
        Compras other = (Compras) object;
        if ((this.compraId == null && other.compraId != null) || (this.compraId != null && !this.compraId.equals(other.compraId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Compras[ compraId=" + compraId + " ]";
    }
    
}
