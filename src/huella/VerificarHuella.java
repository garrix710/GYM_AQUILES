/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huella;
import com.digitalpersona.onetouch.*;
import com.digitalpersona.onetouch.capture.DPFPCapture;
import com.digitalpersona.onetouch.capture.event.*;
import com.digitalpersona.onetouch.processing.*;
import com.digitalpersona.onetouch.verification.DPFPVerification;

import java.io.*;
import java.sql.*;
import java.util.concurrent.CountDownLatch;
/**
 *
 * @author abiga
 */
public class VerificarHuella {

    private final DPFPCapture lector;
    private byte[] datosHuella;
    private final CountDownLatch sincronizador = new CountDownLatch(1);
    private boolean capturando = false;

    public VerificarHuella() {
        lector = DPFPGlobal.getCaptureFactory().createCapture();

        lector.addDataListener(new DPFPDataAdapter() {
            @Override
            public void dataAcquired(DPFPDataEvent e) {
                detenerCaptura();
                DPFPFeatureSet features = extraerCaracteristicas(e.getSample());
                if (features != null) {
                    datosHuella = features.serialize();
                    sincronizador.countDown(); // desbloquea la espera
                }
            }
        });
    }

    private DPFPFeatureSet extraerCaracteristicas(DPFPSample sample) {
        DPFPFeatureExtraction extractor = DPFPGlobal.getFeatureExtractionFactory().createFeatureExtraction();
        try {
            return extractor.createFeatureSet(sample, DPFPDataPurpose.DATA_PURPOSE_VERIFICATION);
        } catch (DPFPImageQualityException e) {
            return null;
        }
    }

    public byte[] obtenerDatosHuella() {
        try {
            detenerCaptura(); // Asegura que esté detenido antes de empezar
            lector.startCapture();
            capturando = true;
            System.out.println("Coloque su dedo en el lector...");
        } catch (IllegalStateException e) {
            System.err.println("El lector ya estaba activo. Se reinicia la captura.");
        }

        try {
            sincronizador.await(); // espera hasta que la huella sea capturada
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return datosHuella;
    }

    private void detenerCaptura() {
        if (capturando) {
            try {
                lector.stopCapture();
                System.out.println("Captura detenida.");
            } catch (IllegalStateException e) {
                System.err.println("La captura ya estaba detenida.");
            }
            capturando = false;
        }
    }
    
    public void stop(){
        try {
            lector.stopCapture();
        } catch (IllegalStateException e) {
            // ignorar si ya estaba detenido
        }
        capturando = false;
    }
    
}



