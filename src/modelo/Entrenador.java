/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import control_datos.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author tuzos
 */
@Entity
@Table(name = "entrenador")
@NamedQueries({
    @NamedQuery(name = "Entrenador.findAll", query = "SELECT e FROM Entrenador e"),
    @NamedQuery(name = "Entrenador.findByEntrenadorId", query = "SELECT e FROM Entrenador e WHERE e.entrenadorId = :entrenadorId"),
    @NamedQuery(name = "Entrenador.findByNombreCompleto", query = "SELECT e FROM Entrenador e WHERE e.nombreCompleto = :nombreCompleto"),
    @NamedQuery(name = "Entrenador.findByCorreoElectronico", query = "SELECT e FROM Entrenador e WHERE e.correoElectronico = :correoElectronico"),
    @NamedQuery(name = "Entrenador.findByTelefonoContacto", query = "SELECT e FROM Entrenador e WHERE e.telefonoContacto = :telefonoContacto")})
public class Entrenador implements Serializable, Usuario {

    @Basic(optional = false)
    @Lob
    @Column(name = "huella_dactilar", nullable = false)
    private byte[] huellaDactilar;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "entrenador_id")
    private Integer entrenadorId;
    @Basic(optional = false)
    @Column(name = "nombre_completo")
    private String nombreCompleto;
    @Basic(optional = false)
    @Column(name = "correo_electronico")
    private String correoElectronico;
    @Basic(optional = false)
    @Column(name = "telefono_contacto")
    private String telefonoContacto;
    @JoinTable(name = "entrenador_especialidad", joinColumns = {
        @JoinColumn(name = "entrenador_id", referencedColumnName = "entrenador_id")}, inverseJoinColumns = {
        @JoinColumn(name = "especialidad_id", referencedColumnName = "especialidad_id")})
    @ManyToMany
    private List<Especialidades> especialidadesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "entrenadorId")
    private List<Horario> horarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "entrenadorId")
    private List<TareaMantenimientoEntrenador> tareaMantenimientoEntrenadorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "entrenadorId")
    private List<Pagoentrenador> pagoentrenadorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "entrenadorId")
    private List<Asistenciaentrenador> asistenciaentrenadorList;

    public Entrenador() {
    }

    public Entrenador(Integer entrenadorId) {
        this.entrenadorId = entrenadorId;
    }

    public Entrenador(Integer entrenadorId, String nombreCompleto, String correoElectronico, String telefonoContacto, byte[] huellaDactilar) {
        this.entrenadorId = entrenadorId;
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
        this.telefonoContacto = telefonoContacto;
        this.huellaDactilar = huellaDactilar;
    }

    public Integer getEntrenadorId() {
        return entrenadorId;
    }

    public void setEntrenadorId(Integer entrenadorId) {
        this.entrenadorId = entrenadorId;
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

    public List<Especialidades> getEspecialidadesList() {
        return especialidadesList;
    }

    public void setEspecialidadesList(List<Especialidades> especialidadesList) {
        this.especialidadesList = especialidadesList;
    }

    public List<Horario> getHorarioList() {
        return horarioList;
    }

    public void setHorarioList(List<Horario> horarioList) {
        this.horarioList = horarioList;
    }

    public List<TareaMantenimientoEntrenador> getTareaMantenimientoEntrenadorList() {
        return tareaMantenimientoEntrenadorList;
    }

    public void setTareaMantenimientoEntrenadorList(List<TareaMantenimientoEntrenador> tareaMantenimientoEntrenadorList) {
        this.tareaMantenimientoEntrenadorList = tareaMantenimientoEntrenadorList;
    }

    public List<Pagoentrenador> getPagoentrenadorList() {
        return pagoentrenadorList;
    }

    public void setPagoentrenadorList(List<Pagoentrenador> pagoentrenadorList) {
        this.pagoentrenadorList = pagoentrenadorList;
    }

    public List<Asistenciaentrenador> getAsistenciaentrenadorList() {
        return asistenciaentrenadorList;
    }

    public void setAsistenciaentrenadorList(List<Asistenciaentrenador> asistenciaentrenadorList) {
        this.asistenciaentrenadorList = asistenciaentrenadorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entrenadorId != null ? entrenadorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entrenador)) {
            return false;
        }
        Entrenador other = (Entrenador) object;
        if ((this.entrenadorId == null && other.entrenadorId != null) || (this.entrenadorId != null && !this.entrenadorId.equals(other.entrenadorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Entrenador[ entrenadorId=" + entrenadorId + " ]";
    }

    @Override
    public String getTipoUsuario() {
        return "E";    
    }

    @Override
    public Integer getId() {
        return Integer.valueOf(this.entrenadorId);
    }

    @Override
    public String getIdentificadorUnicoGlobal() {
                return getTipoUsuario() + "_" + this.entrenadorId; // "Entrenador_123"
    }

}
