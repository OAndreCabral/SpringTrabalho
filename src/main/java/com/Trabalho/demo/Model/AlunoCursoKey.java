package com.Trabalho.demo.Model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class AlunoCursoKey implements Serializable {
    @ManyToOne
    private AlunoModel alunoModel;

    @ManyToOne
    private CursoModel cursoModel;

    public AlunoCursoKey() {
    }

    public AlunoModel getAlunoModel() {
        return alunoModel;
    }

    public void setAlunoModel(AlunoModel alunoModel) {
        this.alunoModel = alunoModel;
    }

    public CursoModel getCursoModel() {
        return cursoModel;
    }

    public void setCursoModel(CursoModel cursoModel) {
        this.cursoModel = cursoModel;
    }
}
