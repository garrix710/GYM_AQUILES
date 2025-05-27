/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huella;

import com.digitalpersona.onetouch.DPFPDataPurpose;
import com.digitalpersona.onetouch.DPFPFeatureSet;
import com.digitalpersona.onetouch.DPFPGlobal;
import com.digitalpersona.onetouch.DPFPSample;
import com.digitalpersona.onetouch.DPFPTemplate;
import com.digitalpersona.onetouch.capture.DPFPCapture;
import com.digitalpersona.onetouch.capture.event.DPFPDataAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPDataEvent;
import com.digitalpersona.onetouch.capture.event.DPFPErrorAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPErrorEvent;
import com.digitalpersona.onetouch.capture.event.DPFPReaderStatusAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPReaderStatusEvent;
import com.digitalpersona.onetouch.capture.event.DPFPSensorAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPSensorEvent;
import com.digitalpersona.onetouch.processing.DPFPEnrollment;
import com.digitalpersona.onetouch.processing.DPFPFeatureExtraction;
import com.digitalpersona.onetouch.processing.DPFPImageQualityException;
import com.digitalpersona.onetouch.verification.DPFPVerification;
import com.digitalpersona.onetouch.verification.DPFPVerificationResult;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 *
 * @author tuzos
 */
public class huella {
    private final DPFPCapture Lector=DPFPGlobal.getCaptureFactory().createCapture();

    private final DPFPEnrollment Reclutador = DPFPGlobal.getEnrollmentFactory().createEnrollment();
    private final DPFPVerification Verificador = DPFPGlobal.getVerificationFactory().createVerification();
    private DPFPTemplate template;
    public static String TEMPLATE_PROPERTY = "templates";
    final DPFPSample[] sample = new DPFPSample[1];
    final boolean[] huellaCapturada = {false};
    private JLabel lblImagenHuella; 
    private JTextArea txtArea ;
    public DPFPFeatureSet featuresinscripcion;
    public DPFPFeatureSet featuresverificacion;
    
    public huella(JLabel lblImagenHuella, JTextArea txtArea){
        this.lblImagenHuella = lblImagenHuella;
    this.txtArea = txtArea;
    }
    
  public DPFPFeatureSet capturarFeatureSet() {
    DPFPSample sample = capturarHuella();  // Tu método que captura la muestra
    if (sample == null) {
        JOptionPane.showMessageDialog(null, "No se pudo capturar la huella", "Error", JOptionPane.ERROR_MESSAGE);
        return null;
    }

    DPFPFeatureSet features = extraerCaracteristicas(sample, DPFPDataPurpose.DATA_PURPOSE_VERIFICATION);
    if (features == null) {
        JOptionPane.showMessageDialog(null, "No se pudieron extraer las características de la huella", "Error", JOptionPane.ERROR_MESSAGE);
        return null;
    }

    return features;  // Devuelve el feature set para comparar
}




    public void iniciar(){//Iniciar el lector
        Lector.addDataListener (new DPFPDataAdapter(){
        @Override public void dataAcquired(final DPFPDataEvent e){
            SwingUtilities.invokeLater(() -> {
                EnviarTexto("La Huella Digital ha sido Capturada");
                ProcesarCaptura(e.getSample());
            });}
                });
        
        Lector.addReaderStatusListener (new DPFPReaderStatusAdapter(){
        @Override public void readerConnected(final DPFPReaderStatusEvent e){
            SwingUtilities.invokeLater(() -> {
                EnviarTexto("El sensor de huella digital está activo o conectado");
            });}
        @Override public void readerDisconnected(final DPFPReaderStatusEvent e){
            SwingUtilities.invokeLater(new Runnable() {@Override
            public void run(){
                EnviarTexto("El sensor de huella digital está desactivado o desconectado");
                    }});}
                });
        
        Lector.addSensorListener (new DPFPSensorAdapter(){
        @Override public void fingerTouched(final DPFPSensorEvent e){
            SwingUtilities.invokeLater(() -> {
                EnviarTexto("El dedo ha sido colocado sobre el lector de huella");
            });}
        @Override public void fingerGone(final DPFPSensorEvent e){
            SwingUtilities.invokeLater(() -> {
                EnviarTexto("El dedo ha sido quitado del lector de huella");
            });}
                });
        
        Lector.addErrorListener (new DPFPErrorAdapter(){
        public void errorReader(final DPFPErrorEvent e){
            SwingUtilities.invokeLater(() -> {
                EnviarTexto("Error: "+e.getError());
            });}
        });
        
    }
    
  
    
    public DPFPFeatureSet extraerCaracteristicas(DPFPSample sample, DPFPDataPurpose purpose){
        DPFPFeatureExtraction extractor = DPFPGlobal.getFeatureExtractionFactory().createFeatureExtraction();
        try{
            return extractor.createFeatureSet(sample, purpose);
        } catch (DPFPImageQualityException e){
            return null;
        }
    }
    public Image CrearImagenHuella(DPFPSample sample){
        return DPFPGlobal.getSampleConversionFactory().createImage(sample);
    }
    public void DibujarHuella(Image image){
        lblImagenHuella.setIcon(new ImageIcon(
        image.getScaledInstance(lblImagenHuella.getWidth(),
        lblImagenHuella.getHeight(),
        Image.SCALE_DEFAULT)));
        lblImagenHuella.repaint();
    }
    public void EstadoHuellas(){
        EnviarTexto("Muestra de huellas necesarias para guardar template"+
        Reclutador.getFeaturesNeeded());
    }
    public void EnviarTexto(String string){
        txtArea.append(string + "\n");
    }
    public void start(){
        Lector.startCapture();
        EnviarTexto("Utilizando el lector de huella dactilar");
    }
    public void stop(){
        Lector.stopCapture();
        EnviarTexto("No se está utilizando el lector de huella dactilar");
    }
    public DPFPTemplate getTemplate(){
        return template;
    }
    public void setTemplate(DPFPTemplate template){
        DPFPTemplate old = this.template;
        this.template = template;
        //firePropertyChange(TEMPLATE_PROPERTY, old, template);
    }
    public void ProcesarCaptura(DPFPSample sample){
        //Procesa la muestra de la huella y crea un conjunto de caracteristicas con el proposito de inscripcion
        featuresinscripcion = extraerCaracteristicas(sample, DPFPDataPurpose.DATA_PURPOSE_ENROLLMENT);
        //Procesa la muestra de la huella y crea un conjunto de caracteristicas con el proposito de verificacion
        featuresverificacion = extraerCaracteristicas(sample, DPFPDataPurpose.DATA_PURPOSE_VERIFICATION);
        if(featuresinscripcion != null)
            try{
                System.out.println("Las caracteristicas de la huella han sido creadas");
                Reclutador.addFeatures(featuresinscripcion);//Agrega las caracteristicas
                //Para dibujar la huella dactilar capturada
                Image image = CrearImagenHuella(sample);
                DibujarHuella(image);
            } catch (DPFPImageQualityException ex){
                System.err.println("Error: "+ex.getMessage());
            }
            finally{
                EstadoHuellas();
                //Comprueba si la plantilla se ha creado
                switch(Reclutador.getTemplateStatus())
                {
                    case TEMPLATE_STATUS_READY:
                        stop();
                        setTemplate(Reclutador.getTemplate());
                        EnviarTexto("La plantilla de la huella ha sido creada, ya puede verificarla");
                        
                        break;
                    
                    case TEMPLATE_STATUS_FAILED:
                        Reclutador.clear();
                        stop();
                        EstadoHuellas();
                        setTemplate(null);
                        
                        start();
                        break;
                        
                }
            }
   
    
    }
    
    public byte[] obtenerDatosHuella() {
    if (template != null) {
        return template.serialize();
    } else {
        throw new IllegalStateException("No se ha capturado ninguna huella. La plantilla está vacía.");
    }
}

    private DPFPSample capturarHuella() {
    

    Lector.addDataListener(new DPFPDataAdapter() {
        @Override
        public void dataAcquired(final DPFPDataEvent e) {
            SwingUtilities.invokeLater(() -> {
                sample[0] = e.getSample();
                huellaCapturada[0] = true;
            });
        }
    });

    Lector.startCapture();
    JOptionPane.showMessageDialog(null, "Coloque su dedo en el lector de huellas");

    while (!huellaCapturada[0]) {
        // Esperar a que se capture la huella
    }

    Lector.stopCapture();
    return sample[0];
}
    
    public DPFPCapture getLector() {
        return Lector;
    }

    public DPFPEnrollment getReclutador() {
        return Reclutador;
    }

    public DPFPVerification getVerificador() {
        return Verificador;
    }

    public static String getTEMPLATE_PROPERTY() {
        return TEMPLATE_PROPERTY;
    }

    public DPFPSample[] getSample() {
        return sample;
    }

    public boolean[] getHuellaCapturada() {
        return huellaCapturada;
    }

    public JLabel getLblImagenHuella() {
        return lblImagenHuella;
    }

    public JTextArea getTxtArea() {
        return txtArea;
    }

    public DPFPFeatureSet getFeaturesinscripcion() {
        return featuresinscripcion;
    }

    public DPFPFeatureSet getFeaturesverificacion() {
        return featuresverificacion;
    }
    
    
    public void limpiarDatos() {
    Reclutador.clear();        // Limpia las características recolectadas
    setTemplate(null);         // Limpia la plantilla de huella
    huellaCapturada[0] = false; // Resetea el flag de captura
    sample[0] = null;          // Limpia la muestra
    
    // Limpia la imagen del JLabel
    lblImagenHuella.setIcon(null);
    lblImagenHuella.repaint();
    
    // Limpia el área de texto
    txtArea.setText("");
}

}
