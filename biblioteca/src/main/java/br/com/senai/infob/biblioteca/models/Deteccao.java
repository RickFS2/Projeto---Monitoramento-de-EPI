package br.com.senai.infob.biblioteca.models;

import java.security.Timestamp;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="deteccao")
public class Deteccao{
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="deteccao_id")
    private int DeteccaoId;

    @Column(name="usando_epi")
    private boolean UsandoEpi;

    @Column(name="data_hora")
    private Timestamp DataHora;

    @ManyToOne
@JoinColumn(name = "funcionario_id")
private Funcionario funcionario;

@ManyToOne
@JoinColumn(name = "camera_id")
private Camera camera;

@ManyToOne
@JoinColumn(name = "epi_id")
private Epi epi;

@ManyToOne
@JoinColumn(name = "maquina_id")
private Maquina maquina;

@OneToMany(mappedBy = "deteccao")
private List<Alerta> alertas;
    public Deteccao() {
    }

    public Deteccao(int deteccaoId, boolean usandoEpi, Timestamp dataHora) {
        DeteccaoId = deteccaoId;
        UsandoEpi = usandoEpi;
        DataHora = dataHora;
    }

    public int getDeteccaoId() {
        return DeteccaoId;
    }

    public void setDeteccaoId(int deteccaoId) {
        DeteccaoId = deteccaoId;
    }

    public boolean isUsandoEpi() {
        return UsandoEpi;
    }

    public void setUsandoEpi(boolean usandoEpi) {
        UsandoEpi = usandoEpi;
    }

    public Timestamp getDataHora() {
        return DataHora;
    }

    public void setDataHora(Timestamp dataHora) {
        DataHora = dataHora;
    }

    
}
