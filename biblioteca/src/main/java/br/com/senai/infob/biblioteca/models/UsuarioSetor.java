package br.com.senai.infob.biblioteca.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario_setor")
public class UsuarioSetor {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="usuario_setor")
    private int usuarioSetorId;

    @Id
    @Column(name="usuario_id")
    private int usuarioId;

    @Id
    @Column(name="setor_id")
    private int setorId;

    public UsuarioSetor() {
    }

    public UsuarioSetor(int usuarioSetorId, int usuarioId, int setorId) {
        this.usuarioSetorId = usuarioSetorId;
        this.usuarioId = usuarioId;
        this.setorId = setorId;
    }

    public int getUsuarioSetorId() {
        return usuarioSetorId;
    }

    public void setUsuarioSetorId(int usuarioSetorId) {
        this.usuarioSetorId = usuarioSetorId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getSetorId() {
        return setorId;
    }

    public void setSetorId(int setorId) {
        this.setorId = setorId;
    }

    
}
