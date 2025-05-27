/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control_datos;

/**
 *
 * @author abiga
 */
public interface Usuario {
    String getTipoUsuario(); // Retornará "Entrenador" o "Cliente"
    Integer getId(); // Puede ser el ID del entrenador o del cliente
    String getNombreCompleto();
    byte[] getHuellaDactilar(); 
    String getIdentificadorUnicoGlobal();
}
