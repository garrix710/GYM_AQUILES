/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control_datos;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Administrador;
/**
 *
 * @author abiga
 */
public class MtAdministrador extends AbstractTableModel{

    private List<Administrador> lAdministradores;
    private String encabezado[] = {"Num Entrenador","Nombre","Correo","Telefono"};
    
    public MtAdministrador(List<Administrador>administradores){
        lAdministradores=administradores;
    }
    
    @Override
    public int getRowCount() {
        if(lAdministradores!=null){
            return lAdministradores.size();
        }return 0;
    }

    @Override
    public int getColumnCount() {
        return encabezado.length;
    }
    
    @Override
    public String getColumnName(int c){
        return encabezado[c];
    }

    @Override
    public Object getValueAt(int r, int c) {
        switch(c){
            case 0: return lAdministradores.get(r).getAdministradorId();
            case 1: return lAdministradores.get(r).getNombreCompleto();
            case 2: return lAdministradores.get(r).getCorreoElectronico();
            default: return lAdministradores.get(r).getTelefonoContacto();
        }
    }
    
    public Administrador getAdministradorAt(int fila) {
    if (lAdministradores != null && fila >= 0 && fila < lAdministradores.size()) {
        return lAdministradores.get(fila);
    }
    return null;
}
    
}
