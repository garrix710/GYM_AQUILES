package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Entrenador;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2025-05-26T19:04:36")
@StaticMetamodel(Asistenciaentrenador.class)
public class Asistenciaentrenador_ { 

    public static volatile SingularAttribute<Asistenciaentrenador, Integer> asistenciaId;
    public static volatile SingularAttribute<Asistenciaentrenador, Date> fechaHoraSalida;
    public static volatile SingularAttribute<Asistenciaentrenador, Entrenador> entrenadorId;
    public static volatile SingularAttribute<Asistenciaentrenador, Date> fechaHoraEntrada;

}