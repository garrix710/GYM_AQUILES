package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Pagoadministrador;
import modelo.TareaMantenimientoAdministrador;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2025-05-26T19:04:36")
@StaticMetamodel(Administrador.class)
public class Administrador_ { 

    public static volatile SingularAttribute<Administrador, Integer> administradorId;
    public static volatile SingularAttribute<Administrador, String> password;
    public static volatile ListAttribute<Administrador, Pagoadministrador> pagoadministradorList;
    public static volatile ListAttribute<Administrador, TareaMantenimientoAdministrador> tareaMantenimientoAdministradorList;
    public static volatile SingularAttribute<Administrador, String> nombreCompleto;
    public static volatile SingularAttribute<Administrador, String> telefonoContacto;
    public static volatile SingularAttribute<Administrador, byte[]> huellaDactilar;
    public static volatile SingularAttribute<Administrador, String> correoElectronico;

}