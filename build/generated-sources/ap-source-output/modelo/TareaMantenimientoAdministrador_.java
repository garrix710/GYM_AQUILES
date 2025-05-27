package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Administrador;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2025-05-26T19:04:36")
@StaticMetamodel(TareaMantenimientoAdministrador.class)
public class TareaMantenimientoAdministrador_ { 

    public static volatile SingularAttribute<TareaMantenimientoAdministrador, Administrador> administradorId;
    public static volatile SingularAttribute<TareaMantenimientoAdministrador, Integer> tareaId;
    public static volatile SingularAttribute<TareaMantenimientoAdministrador, Date> fechaTarea;
    public static volatile SingularAttribute<TareaMantenimientoAdministrador, String> estadoTarea;
    public static volatile SingularAttribute<TareaMantenimientoAdministrador, String> descripcionTarea;

}