/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control_datos;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Especialidades;

/**
 *
 * @author abiga
 */
public class MtEspecialidades extends AbstractTableModel{

    private List<Especialidades> lEspecialidades;
    private String encabezado[] = {"Num especialidad","Nombre"};
    
    public MtEspecialidades(List<Especialidades>especialidades){
        lEspecialidades=especialidades;
    }
    
    @Override
    public int getRowCount() {
        if(lEspecialidades!=null){
            return lEspecialidades.size();
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
            case 0: return lEspecialidades.get(r).getEspecialidadId();
            default : return lEspecialidades.get(r).getNombreEspecialidad();
        }
    }
    
    public Especialidades getEspecialidadesAt(int fila) {
    if (lEspecialidades != null && fila >= 0 && fila < lEspecialidades.size()) {
        return lEspecialidades.get(fila);
    }
    return null;
}
    
}
