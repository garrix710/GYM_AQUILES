/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Paneles;

import control.AdmDatos;
import control.AsistenciaJpaController;
import control.ClientesJpaController;
import control.MembresiaJpaController;
import control.PagomembresiaJpaController;
import control_datos.MtCliente;
import control_datos.MtMembresia;
import control_datos.MtPagomembresia;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Asistencia;
import modelo.Clientes;
import static modelo.Clientes_.clienteId;
import modelo.Membresia;
import static modelo.Membresia_.fechaVencimiento;
import modelo.Pagomembresia;

/**
 *
 * @author abiga
 */
public class PanelTarjeta extends javax.swing.JPanel {
private Clientes cliente;
private final ClientesJpaController cClientes;
//Datos persistentes tabla Membresias
private Membresia Membresia;
private final MembresiaJpaController cMembresias;
//Datos persistentes tabla Pagomembresia
private Pagomembresia pagomembresia;
private final PagomembresiaJpaController cPagomembresias;
private final AsistenciaJpaController cAsistencias;

private final AdmDatos adm;

private final List<Clientes> clientes;
private final List<Membresia> membresias;
private final List<Pagomembresia> pagomembresias;

private final MtCliente mtc;
private final MtMembresia mtm;
private final MtPagomembresia mtp;
    /**
     * Creates new form PanelTarjeta
     */
    public PanelTarjeta() {
        initComponents();
        
        adm = new AdmDatos();
    
    //Inicializacion de datos clientes
    cClientes = new ClientesJpaController(adm.getEmf());
    clientes = cClientes.findClientesEntities();
    mtc = new MtCliente(clientes);
    
    //Inicializacion de datos membresias
    cMembresias = new MembresiaJpaController(adm.getEmf());
    membresias = cMembresias.findMembresiaEntities();
    mtm = new MtMembresia(membresias);
    
    //Inicializacion de datos Pagomembresia
    cPagomembresias = new PagomembresiaJpaController(adm.getEmf());
    pagomembresias = cPagomembresias.findPagomembresiaEntities();
    mtp = new MtPagomembresia(pagomembresias);
    
    cAsistencias = new AsistenciaJpaController(adm.getEmf());
    }
    
    public void cargarDatosClientes(int clienteID) {
    LocalDate hoy = LocalDate.now();
    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

    // Obtener cliente desde el modelo
    Clientes clienteSeleccionado = mtc.buscarPorId(clienteID);
    if (clienteSeleccionado == null) {
        JOptionPane.showMessageDialog(this, "No se encontró el cliente con ID: " + clienteID);
        return;
    }
    
    this.cliente = clienteSeleccionado;


    // Buscar la membresía correspondiente al cliente
    Membresia membresiaSeleccionada = null;
    for (Membresia m : membresias) {
        if (m.getClienteId().getClienteId().equals(clienteSeleccionado.getClienteId())) {
            membresiaSeleccionada = m;
            break;
        }
    }

    if (membresiaSeleccionada == null) {
        JOptionPane.showMessageDialog(this, "No se encontró una membresía para este cliente.");
        return;
    }

    // Buscar el pago correspondiente a la membresía
    Pagomembresia pagoSeleccionado = null;
    for (Pagomembresia p : pagomembresias) {
        if (p.getMembresiaId().getMembresiaId().equals(membresiaSeleccionada.getMembresiaId())) {
            pagoSeleccionado = p;
            break;
        }
    }

    if (pagoSeleccionado == null) {
        JOptionPane.showMessageDialog(this, "No se encontró un pago para esta membresía.");
        return;
    }

    // Mostrar los datos
    txtNombre.setText(clienteSeleccionado.getNombreCompleto());
    txtCorreo.setText(clienteSeleccionado.getCorreoElectronico());
    txtFecha_Fin.setText(formatoFecha.format(membresiaSeleccionada.getFechaVencimiento()));

    // Calcular días restantes
    LocalDate fechaVencimiento = membresiaSeleccionada.getFechaVencimiento().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    long diasRestantes = ChronoUnit.DAYS.between(hoy, fechaVencimiento);

    // Cambiar color según los días restantes
    if (diasRestantes < 0) {
        panelEstado.setBackground(Color.RED);  // Fecha vencida
        labelEstado.setText("Vencida");
        btnRegistrarA.setVisible(false);
        btnRenovar.setVisible(true);
    } else if (diasRestantes <= 5) {
        panelEstado.setBackground(Color.YELLOW);  // Menos de 5 días
        labelEstado.setText("Se vence en: "+diasRestantes);
        btnRenovar.setVisible(false);
    } else {
        panelEstado.setBackground(Color.GREEN);  // Más de 5 días
        labelEstado.setText("Activa");
        btnRenovar.setVisible(false);
    }
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEstado = new javax.swing.JPanel();
        labelEstado = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelFoto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFecha_Fin = new javax.swing.JLabel();
        btnRegistrarA = new javax.swing.JButton();
        btnRenovar = new javax.swing.JButton();

        setBackground(new java.awt.Color(26, 26, 26));

        labelEstado.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        labelEstado.setForeground(new java.awt.Color(26, 26, 26));
        labelEstado.setText("Estado");

        javax.swing.GroupLayout panelEstadoLayout = new javax.swing.GroupLayout(panelEstado);
        panelEstado.setLayout(panelEstadoLayout);
        panelEstadoLayout.setHorizontalGroup(
            panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadoLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(labelEstado)
                .addContainerGap(203, Short.MAX_VALUE))
        );
        panelEstadoLayout.setVerticalGroup(
            panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstadoLayout.createSequentialGroup()
                .addComponent(labelEstado)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(26, 26, 26));

        labelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoInicio.jpeg"))); // NOI18N
        labelFoto.setText("IMAGEN CLIENTE");

        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Nombre");

        txtNombre.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setText("jLabel3");

        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("Correo");

        txtCorreo.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setText("jLabel3");

        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Vencimiento");

        txtFecha_Fin.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txtFecha_Fin.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha_Fin.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre)
                    .addComponent(jLabel4)
                    .addComponent(txtCorreo)
                    .addComponent(jLabel6)
                    .addComponent(txtFecha_Fin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha_Fin)
                        .addGap(10, 10, 10))
                    .addComponent(labelFoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        btnRegistrarA.setText("Registrar Asistencia");
        btnRegistrarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAActionPerformed(evt);
            }
        });

        btnRenovar.setText("Renovar");
        btnRenovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenovarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnRenovar)
                .addGap(70, 70, 70)
                .addComponent(btnRegistrarA)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarA)
                    .addComponent(btnRenovar))
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRenovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenovarActionPerformed
        // TODO add your handling code here:
        try {
        if (cliente == null) {
            JOptionPane.showMessageDialog(this, "No hay cliente cargado para renovar membresía.");
            return;
        }

        // Buscar la membresía del cliente
        Membresia membresiaActual = null;
        for (Membresia m : membresias) {
            if (m.getClienteId().getClienteId().equals(cliente.getClienteId())) {
                membresiaActual = m;
                break;
            }
        }

        if (membresiaActual == null) {
            JOptionPane.showMessageDialog(this, "No se encontró membresía para este cliente.");
            return;
        }

        // Calcular nueva fecha de vencimiento
        Date fechaActual = new Date();
        LocalDate fechaVenc = membresiaActual.getFechaVencimiento().toInstant()
            .atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate hoy = LocalDate.now();

        // Si la membresía está vigente, sumamos 1 mes a la fecha de vencimiento,
        // si está vencida, sumamos 1 mes a la fecha actual
        LocalDate nuevaFechaVenc;
        if (fechaVenc.isAfter(hoy)) {
            nuevaFechaVenc = fechaVenc.plusMonths(1);
        } else {
            nuevaFechaVenc = hoy.plusMonths(1);
        }

        // Convertir nuevaFechaVenc a java.util.Date para persistir
        Date nuevaFechaVencDate = java.sql.Date.valueOf(nuevaFechaVenc);
        membresiaActual.setFechaVencimiento(nuevaFechaVencDate);

        // Actualizar membresía en base de datos
        cMembresias.edit(membresiaActual);

        // Crear nuevo pago de membresía
        Pagomembresia nuevoPago = new Pagomembresia();
        nuevoPago.setFechaPago(fechaActual);
        nuevoPago.setMontoPago(membresiaActual.getPrecio()); // Suponiendo que membresia tiene un método getPrecio()
        nuevoPago.setMembresiaId(membresiaActual);

        // Guardar pago en base de datos
        cPagomembresias.create(nuevoPago);

        // Actualizar la lista local y la tabla si es necesario
        pagomembresias.add(nuevoPago);
        mtp.fireTableDataChanged();

        // Actualizar etiqueta de fecha de vencimiento en el panel
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        txtFecha_Fin.setText(formatoFecha.format(nuevaFechaVencDate));

        // Mostrar mensaje de éxito
        JOptionPane.showMessageDialog(this, "Membresía renovada correctamente hasta: " + formatoFecha.format(nuevaFechaVencDate));

        // Cambiar el estado del panel a activo y ocultar botón renovar si es necesario
        panelEstado.setBackground(Color.GREEN);
        labelEstado.setText("Activa");
        btnRenovar.setVisible(false);

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error al renovar membresía: " + ex.getMessage());
        ex.printStackTrace();
    }
    }//GEN-LAST:event_btnRenovarActionPerformed

    private void btnRegistrarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAActionPerformed
        // TODO add your handling code here:
        try {
        if (cliente == null) {
            JOptionPane.showMessageDialog(this, "No hay cliente cargado para registrar asistencia.");
            return;
        }

        // Crear una nueva asistencia
        Asistencia nuevaAsistencia = new Asistencia();
        nuevaAsistencia.setClienteId(cliente); // Usa el cliente actual
        nuevaAsistencia.setFechaHoraEntrada(new Date());  // Fecha actual
        // Guardar en base de datos
        cAsistencias.create(nuevaAsistencia);

        JOptionPane.showMessageDialog(this, "Asistencia registrada correctamente.");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error al registrar asistencia: " + ex.getMessage());
        ex.printStackTrace();
    }
    }//GEN-LAST:event_btnRegistrarAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarA;
    private javax.swing.JButton btnRenovar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JPanel panelEstado;
    private javax.swing.JLabel txtCorreo;
    private javax.swing.JLabel txtFecha_Fin;
    private javax.swing.JLabel txtNombre;
    // End of variables declaration//GEN-END:variables
}
