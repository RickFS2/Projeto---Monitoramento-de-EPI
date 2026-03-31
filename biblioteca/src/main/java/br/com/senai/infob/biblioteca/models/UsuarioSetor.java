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

    public UsuarioSetor() {
    }

    public UsuarioSetor(int usuarioSetorId) {
        this.usuarioSetorId = usuarioSetorId;
    }

    public int getUsuarioSetorId() {
        return usuarioSetorId;
    }

    public void setUsuarioSetorId(int usuarioSetorId) {
        this.usuarioSetorId = usuarioSetorId;
    }
}
