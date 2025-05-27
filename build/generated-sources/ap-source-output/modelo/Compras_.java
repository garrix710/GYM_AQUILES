package modelo;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2025-05-26T19:04:36")
@StaticMetamodel(Compras.class)
public class Compras_ { 

    public static volatile SingularAttribute<Compras, Date> fechaCompra;
    public static volatile SingularAttribute<Compras, String> proveedorNombre;
    public static volatile SingularAttribute<Compras, BigDecimal> montoCompra;
    public static volatile SingularAttribute<Compras, String> descripcionCompra;
    public static volatile SingularAttribute<Compras, Integer> compraId;

}