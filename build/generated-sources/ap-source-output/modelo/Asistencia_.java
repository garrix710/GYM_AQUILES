package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Clientes;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2025-05-26T19:04:36")
@StaticMetamodel(Asistencia.class)
public class Asistencia_ { 

    public static volatile SingularAttribute<Asistencia, Clientes> clienteId;
    public static volatile SingularAttribute<Asistencia, Integer> asistenciaId;
    public static volatile SingularAttribute<Asistencia, Date> fechaHoraSalida;
    public static volatile SingularAttribute<Asistencia, Date> fechaHoraEntrada;

}