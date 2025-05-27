package modelo;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Clientes;
import modelo.Membresia;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2025-05-26T19:04:36")
@StaticMetamodel(Pagomembresia.class)
public class Pagomembresia_ { 

    public static volatile SingularAttribute<Pagomembresia, String> metodoPago;
    public static volatile SingularAttribute<Pagomembresia, Integer> pagoId;
    public static volatile SingularAttribute<Pagomembresia, Membresia> membresiaId;
    public static volatile SingularAttribute<Pagomembresia, Clientes> clienteId;
    public static volatile SingularAttribute<Pagomembresia, BigDecimal> montoPago;
    public static volatile SingularAttribute<Pagomembresia, Date> fechaPago;

}