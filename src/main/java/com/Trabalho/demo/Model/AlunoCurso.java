package com.Trabalho.demo.Model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

import java.io.Serializable;

@Entity
public class AlunoCurso implements Serializable {

    @EmbeddedId
    private AlunoCursoKey alunoCursoKey;

    public AlunoCurso() {
    }

    public AlunoCursoKey getAlunoCursoKey() {
        return alunoCursoKey;
    }

    public void setAlunoCursoKey(AlunoCursoKey alunoCursoKey) {
        this.alunoCursoKey = alunoCursoKey;
    }
}
