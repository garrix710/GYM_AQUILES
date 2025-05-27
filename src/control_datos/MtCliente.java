/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_datos;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Clientes;

/**
 *
 * @author abiga
 */
public class MtCliente extends AbstractTableModel{

    private List<Clientes> lClientes;
    private String encabezado[] = {"Num cliente","Nombre","Correo","Telefono"};
    
    public MtCliente(List<Clientes>clientes){
        lClientes=clientes;
    }
    
    @Override
    public int getRowCount() {
        if(lClientes!=null){
            return lClientes.size();
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
            case 0: return lClientes.get(r).getClienteId();
            case 1: return lClientes.get(r).getNombreCompleto();
            case 2: return lClientes.get(r).getCorreoElectronico();
            default: return lClientes.get(r).getTelefonoContacto();
        }
    }
    
    public Clientes getClienteAt(int fila) {
    if (lClientes != null && fila >= 0 && fila < lClientes.size()) {
        return lClientes.get(fila);
    }
    return null;
}
    
    public Clientes buscarPorId(int id) {
    for (Clientes c : lClientes) {
        if (c.getClienteId() == id) {
            return c;
        }
    }
    return null;
}
    
}
