/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control_datos;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Asistencia;

/**
 *
 * @author abiga
 */
public class MtAsistencia extends AbstractTableModel{
    private List<Asistencia> lAsistencias;
    
    private String encabezado[] = {"Cliente id","Nombre_Cliente","fecha","Horario"};
    
    public MtAsistencia(List<Asistencia>asistencias){
        lAsistencias=asistencias;
    }

    @Override
    public int getRowCount() {
        if(lAsistencias!=null){
            return lAsistencias.size();
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
            case 0: return lAsistencias.get(r).getClienteId();
            case 1: return lAsistencias.get(r).getClienteId().getNombreCompleto();
            case 2: 
                SimpleDateFormat sdfFecha = new SimpleDateFormat("yyyy-MM-dd");
                return sdfFecha.format(lAsistencias.get(r).getFechaHoraEntrada());
            default: 
                SimpleDateFormat sdfHora = new SimpleDateFormat("HH:mm:ss");
                return sdfHora.format(lAsistencias.get(r).getFechaHoraEntrada());
        }
    }

    public Object getValueAt(int fila) {
        if (lAsistencias != null && fila >= 0 && fila < lAsistencias.size()) {
        return lAsistencias.get(fila);
    }
    return null;
    }
 
}
