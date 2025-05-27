package modelo;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Administrador;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2025-05-26T19:04:36")
@StaticMetamodel(Pagoadministrador.class)
public class Pagoadministrador_ { 

    public static volatile SingularAttribute<Pagoadministrador, Administrador> administradorId;
    public static volatile SingularAttribute<Pagoadministrador, Integer> pagoId;
    public static volatile SingularAttribute<Pagoadministrador, BigDecimal> montoPago;
    public static volatile SingularAttribute<Pagoadministrador, String> descripcionPago;
    public static volatile SingularAttribute<Pagoadministrador, Date> fechaPago;

}