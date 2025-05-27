package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Asistencia;
import modelo.Membresia;
import modelo.Pagomembresia;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2025-05-26T19:04:36")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, Integer> clienteId;
    public static volatile SingularAttribute<Clientes, Date> fechaRegistro;
    public static volatile ListAttribute<Clientes, Pagomembresia> pagomembresiaList;
    public static volatile ListAttribute<Clientes, Membresia> membresiaList;
    public static volatile SingularAttribute<Clientes, String> nombreCompleto;
    public static volatile SingularAttribute<Clientes, String> telefonoContacto;
    public static volatile SingularAttribute<Clientes, byte[]> huellaDactilar;
    public static volatile SingularAttribute<Clientes, String> correoElectronico;
    public static volatile ListAttribute<Clientes, Asistencia> asistenciaList;

}