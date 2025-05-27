package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Entrenador;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2025-05-26T19:04:36")
@StaticMetamodel(TareaMantenimientoEntrenador.class)
public class TareaMantenimientoEntrenador_ { 

    public static volatile SingularAttribute<TareaMantenimientoEntrenador, Integer> tareaId;
    public static volatile SingularAttribute<TareaMantenimientoEntrenador, Date> fechaTarea;
    public static volatile SingularAttribute<TareaMantenimientoEntrenador, String> estadoTarea;
    public static volatile SingularAttribute<TareaMantenimientoEntrenador, Entrenador> entrenadorId;
    public static volatile SingularAttribute<TareaMantenimientoEntrenador, String> descripcionTarea;

}