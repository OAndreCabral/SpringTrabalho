package com.Trabalho.demo.Model;

import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class AlunoDisciplinaKey implements Serializable {
    @ManyToOne
    private AlunoCurso alunoCurso;

    @ManyToOne
    private DisciplinaModel disciplinaModel;

    public AlunoDisciplinaKey() {
    }
    public AlunoCurso getAlunoCurso() {
        return alunoCurso;
    }

    public void setAlunoCurso(AlunoCurso alunoCurso) {
        this.alunoCurso = alunoCurso;
    }

    public DisciplinaModel getDisciplinaModel() {
        return disciplinaModel;
    }

    public void setDisciplinaModel(DisciplinaModel disciplinaModel) {
        this.disciplinaModel = disciplinaModel;
    }
}
