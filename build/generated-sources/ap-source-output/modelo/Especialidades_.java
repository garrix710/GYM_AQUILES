package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Entrenador;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2025-05-26T19:04:36")
@StaticMetamodel(Especialidades.class)
public class Especialidades_ { 

    public static volatile SingularAttribute<Especialidades, Integer> especialidadId;
    public static volatile SingularAttribute<Especialidades, String> nombreEspecialidad;
    public static volatile ListAttribute<Especialidades, Entrenador> entrenadorList;

}