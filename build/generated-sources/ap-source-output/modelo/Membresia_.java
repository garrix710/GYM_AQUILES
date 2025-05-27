package modelo;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Clientes;
import modelo.Pagomembresia;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2025-05-26T19:04:36")
@StaticMetamodel(Membresia.class)
public class Membresia_ { 

    public static volatile SingularAttribute<Membresia, String> tipoMembresia;
    public static volatile SingularAttribute<Membresia, BigDecimal> precio;
    public static volatile SingularAttribute<Membresia, Integer> membresiaId;
    public static volatile SingularAttribute<Membresia, Clientes> clienteId;
    public static volatile SingularAttribute<Membresia, Date> fechaInicio;
    public static volatile SingularAttribute<Membresia, Date> fechaVencimiento;
    public static volatile SingularAttribute<Membresia, String> estadoMembresia;
    public static volatile ListAttribute<Membresia, Pagomembresia> pagomembresiaList;

}