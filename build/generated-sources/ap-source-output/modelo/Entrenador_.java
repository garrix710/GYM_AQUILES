package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Asistenciaentrenador;
import modelo.Especialidades;
import modelo.Horario;
import modelo.Pagoentrenador;
import modelo.TareaMantenimientoEntrenador;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2025-05-26T19:04:36")
@StaticMetamodel(Entrenador.class)
public class Entrenador_ { 

    public static volatile ListAttribute<Entrenador, Asistenciaentrenador> asistenciaentrenadorList;
    public static volatile ListAttribute<Entrenador, Pagoentrenador> pagoentrenadorList;
    public static volatile ListAttribute<Entrenador, Especialidades> especialidadesList;
    public static volatile SingularAttribute<Entrenador, Integer> entrenadorId;
    public static volatile SingularAttribute<Entrenador, byte[]> huellaDactilar;
    public static volatile SingularAttribute<Entrenador, String> nombreCompleto;
    public static volatile SingularAttribute<Entrenador, String> telefonoContacto;
    public static volatile SingularAttribute<Entrenador, String> correoElectronico;
    public static volatile ListAttribute<Entrenador, Horario> horarioList;
    public static volatile ListAttribute<Entrenador, TareaMantenimientoEntrenador> tareaMantenimientoEntrenadorList;

}