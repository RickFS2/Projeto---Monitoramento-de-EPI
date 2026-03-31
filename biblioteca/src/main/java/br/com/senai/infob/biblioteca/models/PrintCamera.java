package br.com.senai.infob.biblioteca.models;

import java.security.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="PrintCamera")
public class PrintCamera {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="PrintCamera")
    private int PrintCameraId;
    
    @Column(name="Validação")
    private boolean Validação;

    @Column(name="Imagem_path")
    private String ImagemPath;

    @Column(name="Data_hora")
    private Timestamp dataHora;

        @ManyToOne
    @JoinColumn(name = "camera_id")
    private Camera camera;
    public PrintCamera() {
    }

    public PrintCamera(int printCameraId, boolean validação, String imagemPath, Timestamp dataHora) {
        PrintCameraId = printCameraId;
        Validação = validação;
        ImagemPath = imagemPath;
        this.dataHora = dataHora;
    }

    public int getPrintCameraId() {
        return PrintCameraId;
    }

    public void setPrintCameraId(int printCameraId) {
        PrintCameraId = printCameraId;
    }

    public boolean isValidação() {
        return Validação;
    }

    public void setValidação(boolean validação) {
        Validação = validação;
    }

    public String getImagemPath() {
        return ImagemPath;
    }

    public void setImagemPath(String imagemPath) {
        ImagemPath = imagemPath;
    }

    public Timestamp getDataHora() {
        return dataHora;
    }

    public void setDataHora(Timestamp dataHora) {
        this.dataHora = dataHora;
    } 
}

