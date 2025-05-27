/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Paneles;

import control.AdmDatos;
import control.AsistenciaJpaController;
import control.AsistenciaentrenadorJpaController;
import control.EntrenadorJpaController;
import control.EspecialidadesJpaController;
import control.HorarioJpaController;
import control.PagomembresiaJpaController;
import control_datos.MtEntrenador;
import control_datos.MtEspecialidades;
import control_datos.MtHorario;
import control_datos.MtMembresia;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Asistencia;
import modelo.Asistenciaentrenador;
import modelo.Clientes;
import modelo.Entrenador;
import modelo.Especialidades;
import modelo.Horario;
import modelo.Membresia;
import modelo.Pagomembresia;

/**
 *
 * @author abiga
 */
public class PanelTarjetaEntrenador extends javax.swing.JPanel {
private Entrenador cliente;
    private final AdmDatos adm;
    private Entrenador entrenador;
private final EntrenadorJpaController cEntrenadores;

private Especialidades especialidad;
private final EspecialidadesJpaController cEspecialidades;

private Horario horario;
private final HorarioJpaController cHorarios;

private final List<Entrenador> entrenadores;
private final List<Especialidades> especialidades;
private final List<Horario> horarios;

private final MtEntrenador mte;
private final MtEspecialidades mtespe;
private final MtHorario mth;

private final AsistenciaentrenadorJpaController cAsistenciaEntrenador;

String dias;
            Date horaInicio;
            Date horaFin;
            
            private DayOfWeek dia; // Ejemplo: MONDAY
private LocalTime horaEntrada;
private LocalTime horaSalida;


    /**
     * Creates new form PanelTarjetaEntrenador
     */
    public PanelTarjetaEntrenador() {
        initComponents();
        adm = new AdmDatos();
        cEntrenadores = new EntrenadorJpaController(adm.getEmf());
    entrenadores = cEntrenadores.findEntrenadorEntities();
    mte = new MtEntrenador(entrenadores);
    
    cEspecialidades = new EspecialidadesJpaController(adm.getEmf());
    especialidades = cEspecialidades.findEspecialidadesEntities();
    mtespe = new MtEspecialidades(especialidades);
    //Inicializacion de datos Pagomembresia
    cHorarios = new HorarioJpaController(adm.getEmf());
    horarios = cHorarios.findHorarioEntities();
    mth = new MtHorario(horarios);
    
    cAsistenciaEntrenador = new AsistenciaentrenadorJpaController(adm.getEmf());
    }
    
    
    public void cargarDatosClientes(int entrenadorID) {
        
    LocalDate hoy = LocalDate.now();

    Entrenador entrenadorSeleccionado = mte.buscarPorId(entrenadorID);
    if (entrenadorSeleccionado == null) {
        JOptionPane.showMessageDialog(this, "No se encontró el entrenador con ID: " + entrenadorID);
        return;
    }

    this.entrenador = entrenadorSeleccionado;

    // Buscar el horario del entrenador
    Horario horarioSeleccionado = null;
    for (Horario h : horarios) {
        if (h.getEntrenadorId().getEntrenadorId().equals(entrenadorID)) {
            horarioSeleccionado = h;
            break;
        }
    }

    if (horarioSeleccionado == null) {
        JOptionPane.showMessageDialog(this, "No se encontró un horario para este entrenador.");
        return;
    }

    // Mostrar los datos del entrenador
    txtNombre.setText(entrenadorSeleccionado.getNombreCompleto());
    txtCorreo.setText(entrenadorSeleccionado.getCorreoElectronico());
    txtHorario.setText(horarioSeleccionado.getDiaSemana() + " " +
                       horarioSeleccionado.getHoraInicio() + " - " +
                       horarioSeleccionado.getHoraFin());

    // Validar asistencia según día y hora
    LocalDateTime ahora = LocalDateTime.now();
    DayOfWeek diaActual = ahora.getDayOfWeek();
    LocalTime horaActual = ahora.toLocalTime();

    // Convertir las horas del horario
LocalTime horaInicio = horarioSeleccionado.getHoraInicio()
    .toInstant().atZone(ZoneId.systemDefault()).toLocalTime();

LocalTime horaFin = horarioSeleccionado.getHoraFin()
    .toInstant().atZone(ZoneId.systemDefault()).toLocalTime();

    // Comparar días y horas
if (horarioSeleccionado.getDiaSemana().equals(diaActual)) {
    if (!horaActual.isBefore(horaInicio) && !horaActual.isAfter(horaFin)) {
        labelEstado.setText("Asistencia registrada");
        panelEstado.setBackground(Color.GREEN);
        
    } else {
        labelEstado.setText("Fuera de horario");
        panelEstado.setBackground(Color.ORANGE);
    }
} else {
    labelEstado.setText("Hoy no tiene horario");
    panelEstado.setBackground(Color.GRAY);
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

        jPanel1 = new javax.swing.JPanel();
        panelEstado = new javax.swing.JPanel();
        labelEstado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelFoto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtHorario = new javax.swing.JLabel();
        btnRegistrarA = new javax.swing.JButton();

        setBackground(new java.awt.Color(26, 26, 26));

        jPanel1.setBackground(new java.awt.Color(26, 26, 26));

        labelEstado.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        labelEstado.setForeground(new java.awt.Color(26, 26, 26));
        labelEstado.setText("Estado");

        javax.swing.GroupLayout panelEstadoLayout = new javax.swing.GroupLayout(panelEstado);
        panelEstado.setLayout(panelEstadoLayout);
        panelEstadoLayout.setHorizontalGroup(
            panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadoLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(labelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEstadoLayout.setVerticalGroup(
            panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstadoLayout.createSequentialGroup()
                .addComponent(labelEstado)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(26, 26, 26));

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
        jLabel6.setText("Horario");

        txtHorario.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        txtHorario.setForeground(new java.awt.Color(255, 255, 255));
        txtHorario.setText("jLabel3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre)
                    .addComponent(jLabel4)
                    .addComponent(txtCorreo)
                    .addComponent(jLabel6)
                    .addComponent(txtHorario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
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
                        .addComponent(txtHorario)
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addComponent(btnRegistrarA)
                .addGap(151, 151, 151))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnRegistrarA)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAActionPerformed

        String estado = labelEstado.getText();
        
        // Verificar si el estado indica que no tiene horario
    if (estado.equalsIgnoreCase("Hoy no tiene horario")) {
        JOptionPane.showMessageDialog(this, "No se puede registrar asistencia: el entrenador no tiene horario asignado.");
        return;
    }
        try {
        if (entrenador == null) {
            JOptionPane.showMessageDialog(this, "No hay cliente cargado para registrar asistencia.");
            return;
        }

        // Crear una nueva asistencia
        Asistenciaentrenador nuevaAsistencia = new Asistenciaentrenador();
        nuevaAsistencia.setEntrenadorId(entrenador); // Usa el cliente actual
        nuevaAsistencia.setFechaHoraEntrada(new Date());  // Fecha actual
        // Guardar en base de datos
        cAsistenciaEntrenador.create(nuevaAsistencia);

        JOptionPane.showMessageDialog(this, "Asistencia registrada correctamente.");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error al registrar asistencia: " + ex.getMessage());
        ex.printStackTrace();
    }
    }//GEN-LAST:event_btnRegistrarAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarA;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JPanel panelEstado;
    private javax.swing.JLabel txtCorreo;
    private javax.swing.JLabel txtHorario;
    private javax.swing.JLabel txtNombre;
    // End of variables declaration//GEN-END:variables
}
