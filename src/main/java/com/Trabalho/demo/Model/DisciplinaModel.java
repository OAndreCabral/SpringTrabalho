package com.Trabalho.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.List;

@Entity
public class DisciplinaModel implements Serializable {
    @Id
    private Long id;
    private String nome;

    @ManyToOne
    private CursoModel cursoModel;

    public DisciplinaModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
