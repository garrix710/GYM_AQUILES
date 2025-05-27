/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
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

/**
 *
 * @author tuzos
 */
@Entity
@Table(name = "administrador")
@NamedQueries({
    @NamedQuery(name = "Administrador.findAll", query = "SELECT a FROM Administrador a"),
    @NamedQuery(name = "Administrador.findByAdministradorId", query = "SELECT a FROM Administrador a WHERE a.administradorId = :administradorId"),
    @NamedQuery(name = "Administrador.findByNombreCompleto", query = "SELECT a FROM Administrador a WHERE a.nombreCompleto = :nombreCompleto"),
    @NamedQuery(name = "Administrador.findByCorreoElectronico", query = "SELECT a FROM Administrador a WHERE a.correoElectronico = :correoElectronico"),
    @NamedQuery(name = "Administrador.findByTelefonoContacto", query = "SELECT a FROM Administrador a WHERE a.telefonoContacto = :telefonoContacto")})
public class Administrador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "administrador_id")
    private Integer administradorId;
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
    @Lob
    @Column(name = "huella_dactilar")
    private byte[] huellaDactilar;
    @Column(name = "password")
    private String password;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "administradorId")
    private List<Pagoadministrador> pagoadministradorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "administradorId")
    private List<TareaMantenimientoAdministrador> tareaMantenimientoAdministradorList;

    public Administrador() {
    }

    public Administrador(Integer administradorId) {
        this.administradorId = administradorId;
    }

    public Administrador(Integer administradorId, String nombreCompleto, String correoElectronico, String telefonoContacto, byte[] huellaDactilar) {
        this.administradorId = administradorId;
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
        this.telefonoContacto = telefonoContacto;
        this.huellaDactilar = huellaDactilar;
    }

    public Integer getAdministradorId() {
        return administradorId;
    }

    public void setAdministradorId(Integer administradorId) {
        this.administradorId = administradorId;
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

    public byte[] getHuellaDactilar() {
        return huellaDactilar;
    }

    public void setHuellaDactilar(byte[] huellaDactilar) {
        this.huellaDactilar = huellaDactilar;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public List<Pagoadministrador> getPagoadministradorList() {
        return pagoadministradorList;
    }

    public void setPagoadministradorList(List<Pagoadministrador> pagoadministradorList) {
        this.pagoadministradorList = pagoadministradorList;
    }

    public List<TareaMantenimientoAdministrador> getTareaMantenimientoAdministradorList() {
        return tareaMantenimientoAdministradorList;
    }

    public void setTareaMantenimientoAdministradorList(List<TareaMantenimientoAdministrador> tareaMantenimientoAdministradorList) {
        this.tareaMantenimientoAdministradorList = tareaMantenimientoAdministradorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (administradorId != null ? administradorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administrador)) {
            return false;
        }
        Administrador other = (Administrador) object;
        if ((this.administradorId == null && other.administradorId != null) || (this.administradorId != null && !this.administradorId.equals(other.administradorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Administrador[ administradorId=" + administradorId + " ]";
    }
    
}
