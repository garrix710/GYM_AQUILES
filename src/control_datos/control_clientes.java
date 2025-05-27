/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control_datos;

import control.ClientesJpaController;
import java.util.Date;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.Clientes;

/**
 *
 * @author tuzos
 */
public class control_clientes {
   private EntityManagerFactory emf = Persistence.createEntityManagerFactory("GMSPU"); 
   private Clientes cliente = new Clientes();
   private ClientesJpaController controlador = new ClientesJpaController(emf);
   
   public control_clientes(){
       
   }
   public EntityManagerFactory getEmf() {
        return emf;
    }

    public Clientes getCliente() {
        return cliente;
    }
    public ClientesJpaController getControlador() {
        return controlador;
    }
    public void insert(String nombre, String correo, String numero,Date fecha, byte[] huella){
        Clientes cli = new Clientes();
        cli.setNombreCompleto(nombre);
        cli.setCorreoElectronico(correo);
        cli.setTelefonoContacto(numero);
        cli.setFechaRegistro(fecha);
        cli.setHuellaDactilar(huella);
        controlador.create(cli);
    }
    
}
