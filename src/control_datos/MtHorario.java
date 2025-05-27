/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control_datos;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Horario;
import modelo.Membresia;

/**
 *
 * @author abiga
 */
public class MtHorario extends AbstractTableModel{

    private List<Horario> lHorario;
    private String encabezado[] = {"horarioID","entrenadorID","dia_semana","hora_inicio","hora_fin"};
    
    public MtHorario(List<Horario>horarios){
        lHorario=horarios;
    }
    
    @Override
    public int getRowCount() {
        if(lHorario!=null){
            return lHorario.size();
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
            case 0: return lHorario.get(r).getHorarioId();
            case 1: return lHorario.get(r).getEntrenadorId();
            case 2: return lHorario.get(r).getDiaSemana();
            case 3: return lHorario.get(r).getHoraInicio();
            default: return lHorario.get(r).getHoraFin();
        }
    }
    
    public Horario getHoraioAt(int fila) {
    if (lHorario != null && fila >= 0 && fila < lHorario.size()) {
        return lHorario.get(fila);
    }
    return null;
}
    
}
