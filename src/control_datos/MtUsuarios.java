/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control_datos;

import com.digitalpersona.onetouch.DPFPFeatureSet;
import com.digitalpersona.onetouch.DPFPGlobal;
import com.digitalpersona.onetouch.DPFPTemplate;
import com.digitalpersona.onetouch.verification.DPFPVerification;
import com.digitalpersona.onetouch.verification.DPFPVerificationResult;
import huella.VerificarHuella;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Clientes;
import modelo.Entrenador;


/**
 *
 * @author abiga
 */
public class MtUsuarios extends AbstractTableModel{

    private List<Usuario> lUsuarios;
    private String encabezado[] = {"Tipo","Nombre","Id_Global","Huella"};
    
    public MtUsuarios(List<Entrenador>entrenadores, List<Clientes>clientes){
        lUsuarios=new ArrayList<>();
        if(entrenadores != null){
            lUsuarios.addAll(entrenadores);
        }
        if(clientes != null){
            lUsuarios.addAll(clientes);
        }
    }
    
    @Override
    public int getRowCount() {
        if(lUsuarios!=null){
            return lUsuarios.size();
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
        if (r < 0 || r >= lUsuarios.size()) {
            return null; // Evitar IndexOutOfBoundsException
        }
        switch(c){
            case 0: return lUsuarios.get(r).getTipoUsuario();
            case 1: return lUsuarios.get(r).getNombreCompleto();
            case 3: return lUsuarios.get(r).getIdentificadorUnicoGlobal();
            default : 
                return lUsuarios.get(r).getHuellaDactilar();
        }
    }
    
    public Usuario getUsuarioAt(int fila) {
    if (lUsuarios != null && fila >= 0 && fila < lUsuarios.size()) {
        return lUsuarios.get(fila);
    }
    return null;
    }
    
    public Usuario buscarPorId(String id) { // <--- ¡Cambiado a Integer!
        if (id == null) {
            return null;
        }
        for (Usuario usuario : lUsuarios) {
            if (usuario.getIdentificadorUnicoGlobal() != null && usuario.getIdentificadorUnicoGlobal().equals(id)) { // Comparación de Integer
                return usuario;
            }
        }
        return null;
    }
    
    public List<Usuario> buscarPorNombre(String nombre) {
        List<Usuario> resultados = new ArrayList<>();
        if (nombre == null || nombre.trim().isEmpty()) {
            return resultados;
        }
        String nombreBuscado = nombre.trim().toLowerCase();
        for (Usuario usuario : lUsuarios) {
            if (usuario.getNombreCompleto().toLowerCase().contains(nombreBuscado)) { // Búsqueda parcial y sin distinción de mayúsculas/minúsculas
                resultados.add(usuario);
            }
        }
        return resultados;
    }
    
    public Usuario buscarPorHuella(byte[] huellaCapturada) {
    if (huellaCapturada == null || huellaCapturada.length == 0) {
        return null;
    }

    try {
        // Crear DPFPFeatureSet a partir de la huella capturada
        DPFPFeatureSet features = DPFPGlobal.getFeatureSetFactory().createFeatureSet(huellaCapturada);

        DPFPVerification verificador = DPFPGlobal.getVerificationFactory().createVerification();

        for (Usuario usuario : lUsuarios) {
            byte[] templateGuardado = usuario.getHuellaDactilar(); // esto debe venir del registro (BD)
            if (templateGuardado != null) {
                DPFPTemplate template = DPFPGlobal.getTemplateFactory().createTemplate();
                template.deserialize(templateGuardado);

                DPFPVerificationResult resultado = verificador.verify(features, template);

                if (resultado.isVerified()) {
                    return usuario; // ¡Huella verificada!
                }
            }
        }

    } catch (Exception e) {
        e.printStackTrace(); // Imprime si algo sale mal
    }

    return null; // No se encontró coincidencia
}


    
}