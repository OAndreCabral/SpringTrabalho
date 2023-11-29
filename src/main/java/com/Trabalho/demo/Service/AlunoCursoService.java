package com.Trabalho.demo.Service;

import com.Trabalho.demo.Model.AlunoCurso;
import com.Trabalho.demo.Repository.AlunoCursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoCursoService {

    @Autowired
    private AlunoCursoRepository alunoCursoRepository;

    public AlunoCurso createAlunocurso(AlunoCurso alunoCurso) {
        return alunoCursoRepository.save(alunoCurso);
    }

    public List<AlunoCurso> getAlunoCursoID(Long id) {
        return alunoCursoRepository.findAllByAlunoCursoKey_AlunoModel_Id(id);
    }
}
