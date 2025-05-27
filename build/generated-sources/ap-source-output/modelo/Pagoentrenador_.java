package modelo;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Entrenador;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2025-05-26T19:04:36")
@StaticMetamodel(Pagoentrenador.class)
public class Pagoentrenador_ { 

    public static volatile SingularAttribute<Pagoentrenador, Integer> pagoId;
    public static volatile SingularAttribute<Pagoentrenador, BigDecimal> montoPago;
    public static volatile SingularAttribute<Pagoentrenador, Entrenador> entrenadorId;
    public static volatile SingularAttribute<Pagoentrenador, String> descripcionPago;
    public static volatile SingularAttribute<Pagoentrenador, Date> fechaPago;

}