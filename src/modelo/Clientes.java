/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import control_datos.Usuario;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "clientes")
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c"),
    @NamedQuery(name = "Clientes.findByClienteId", query = "SELECT c FROM Clientes c WHERE c.clienteId = :clienteId"),
    @NamedQuery(name = "Clientes.findByNombreCompleto", query = "SELECT c FROM Clientes c WHERE c.nombreCompleto = :nombreCompleto"),
    @NamedQuery(name = "Clientes.findByCorreoElectronico", query = "SELECT c FROM Clientes c WHERE c.correoElectronico = :correoElectronico"),
    @NamedQuery(name = "Clientes.findByTelefonoContacto", query = "SELECT c FROM Clientes c WHERE c.telefonoContacto = :telefonoContacto"),
    @NamedQuery(name = "Clientes.findByFechaRegistro", query = "SELECT c FROM Clientes c WHERE c.fechaRegistro = :fechaRegistro")})
public class Clientes implements Serializable, Usuario {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cliente_id")
    private Integer clienteId;
    @Basic(optional = false)
    @Column(name = "nombre_completo")
    private String nombreCompleto;
    @Basic(optional = false)
    @Column(name = "correo_electronico")
    private String correoElectronico;
    @Basic(optional = false)
    @Column(name = "telefono_contacto")
    private String telefonoContacto;
    @Basic(optional = false)
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @Basic(optional = false)
    @Lob
    @Column(name = "huella_dactilar")
    private byte[] huellaDactilar;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clienteId")
    private List<Pagomembresia> pagomembresiaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clienteId")
    private List<Asistencia> asistenciaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clienteId")
    private List<Membresia> membresiaList;

    public Clientes() {
    }

    public Clientes(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public Clientes(Integer clienteId, String nombreCompleto, String correoElectronico, String telefonoContacto, Date fechaRegistro, byte[] huellaDactilar) {
        this.clienteId = clienteId;
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
        this.telefonoContacto = telefonoContacto;
        this.fechaRegistro = fechaRegistro;
        this.huellaDactilar = huellaDactilar;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public byte[] getHuellaDactilar() {
        return huellaDactilar;
    }

    public void setHuellaDactilar(byte[] huellaDactilar) {
        this.huellaDactilar = huellaDactilar;
    }

    public List<Pagomembresia> getPagomembresiaList() {
        return pagomembresiaList;
    }

    public void setPagomembresiaList(List<Pagomembresia> pagomembresiaList) {
        this.pagomembresiaList = pagomembresiaList;
    }

    public List<Asistencia> getAsistenciaList() {
        return asistenciaList;
    }

    public void setAsistenciaList(List<Asistencia> asistenciaList) {
        this.asistenciaList = asistenciaList;
    }

    public List<Membresia> getMembresiaList() {
        return membresiaList;
    }

    public void setMembresiaList(List<Membresia> membresiaList) {
        this.membresiaList = membresiaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clienteId != null ? clienteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.clienteId == null && other.clienteId != null) || (this.clienteId != null && !this.clienteId.equals(other.clienteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ""+clienteId;
    }

    @Override
    public String getTipoUsuario() {
        return "C";
    }

    @Override
    public Integer getId() {
        return Integer.valueOf(this.clienteId);
    }

    @Override
    public String getIdentificadorUnicoGlobal() {
        return getTipoUsuario() + "_" + this.clienteId; // "Entrenador_123"

    }
    
}
