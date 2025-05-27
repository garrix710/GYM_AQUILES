package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Entrenador;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2025-05-26T19:04:36")
@StaticMetamodel(Horario.class)
public class Horario_ { 

    public static volatile SingularAttribute<Horario, Date> horaFin;
    public static volatile SingularAttribute<Horario, String> diaSemana;
    public static volatile SingularAttribute<Horario, Entrenador> entrenadorId;
    public static volatile SingularAttribute<Horario, Integer> horarioId;
    public static volatile SingularAttribute<Horario, Date> horaInicio;

}