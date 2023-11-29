package com.Trabalho.demo.Model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;
@Entity
public class DisciplinaAluno implements Serializable {
    @EmbeddedId
    private AlunoDisciplinaKey alunoDisciplinaKey;
    private Double nota;

    public DisciplinaAluno() {
    }

    public AlunoDisciplinaKey getAlunoDisciplinaKey() {
        return alunoDisciplinaKey;
    }

    public void setAlunoDisciplinaKey(AlunoDisciplinaKey alunoDisciplinaKey) {
        this.alunoDisciplinaKey = alunoDisciplinaKey;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
}
