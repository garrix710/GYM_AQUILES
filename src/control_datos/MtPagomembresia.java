/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control_datos;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Pagomembresia;

/**
 *
 * @author abiga
 */
public class MtPagomembresia extends AbstractTableModel{

    private List<Pagomembresia> lPagomembresia;
    private String encabezado[] = {"pagoID","membresiaID","fechaPago","metodoPago"};
    
    public MtPagomembresia(List<Pagomembresia>pagomembresias){
        lPagomembresia=pagomembresias;
    }
    
    @Override
    public int getRowCount() {
        if(lPagomembresia!=null){
            return lPagomembresia.size();
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
            case 0: return lPagomembresia.get(r).getPagoId();
            case 1: return lPagomembresia.get(r).getMembresiaId();
            case 2: return lPagomembresia.get(r).getFechaPago();
            default: return lPagomembresia.get(r).getMetodoPago();
        }
    }
    
    public Pagomembresia getPagomembresiaAt(int fila) {
    if (lPagomembresia != null && fila >= 0 && fila < lPagomembresia.size()) {
        return lPagomembresia.get(fila);
    }
    return null;
}
    
}