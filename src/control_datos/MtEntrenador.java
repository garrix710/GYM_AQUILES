/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control_datos;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Entrenador;
import modelo.Especialidades;

/**
 *
 * @author abiga
 */
public class MtEntrenador extends AbstractTableModel{

    private List<Entrenador> lEntrenadores;
    private String encabezado[] = {"Num Entrenador","Nombre","Correo","Telefono","Especialidad"};
    
    public MtEntrenador(List<Entrenador>entrenadores){
        lEntrenadores=entrenadores;
    }
    
    @Override
    public int getRowCount() {
        if(lEntrenadores!=null){
            return lEntrenadores.size();
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
            case 0: return lEntrenadores.get(r).getEntrenadorId();
            case 1: return lEntrenadores.get(r).getNombreCompleto();
            case 2: return lEntrenadores.get(r).getCorreoElectronico();
            case 3: return lEntrenadores.get(r).getTelefonoContacto();
            default : 
                List<Especialidades> especialidades = lEntrenadores.get(r).getEspecialidadesList();
                if (especialidades == null || especialidades.isEmpty()) {
                    return "";  // No tiene especialidades
                }
                StringBuilder sb = new StringBuilder();
                for (Especialidades esp : especialidades) {
                    sb.append(esp.getNombreEspecialidad()).append(", ");
                }
                // Eliminar la última coma y espacio
                return sb.substring(0, sb.length() - 2);
        }
    }
    
    public Entrenador getEntrenadorAt(int fila) {
    if (lEntrenadores != null && fila >= 0 && fila < lEntrenadores.size()) {
        return lEntrenadores.get(fila);
    }
    return null;
    }
    
    public Entrenador buscarPorId(int id) {
    for (Entrenador c : lEntrenadores) {
        if (c.getEntrenadorId() == id) {
            return c;
        }
    }
    return null;
}
    
}
