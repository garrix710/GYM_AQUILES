/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control_datos;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Membresia;

/**
 *
 * @author abiga
 */
public class MtMembresia extends AbstractTableModel{

    private List<Membresia> lMembresia;
    private String encabezado[] = {"membresiaID","clienteID","tipoMembresia","fechaInicio","fechaFin","estado","precio"};
    
    public MtMembresia(List<Membresia>membresias){
        lMembresia=membresias;
    }
    
    @Override
    public int getRowCount() {
        if(lMembresia!=null){
            return lMembresia.size();
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
            case 0: return lMembresia.get(r).getMembresiaId();
            case 1: return lMembresia.get(r).getClienteId();
            case 2: return lMembresia.get(r).getTipoMembresia();
            case 3: return lMembresia.get(r).getFechaInicio();
            case 4: return lMembresia.get(r).getFechaVencimiento();
            case 5: return lMembresia.get(r).getEstadoMembresia();
            default: return lMembresia.get(r).getPrecio();
        }
    }
    
    public Membresia getMembresiaAt(int fila) {
    if (lMembresia != null && fila >= 0 && fila < lMembresia.size()) {
        return lMembresia.get(fila);
    }
    return null;
}
    
}
