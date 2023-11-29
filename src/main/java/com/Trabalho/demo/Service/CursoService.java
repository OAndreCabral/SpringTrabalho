package com.Trabalho.demo.Service;

import com.Trabalho.demo.Model.CursoModel;
import com.Trabalho.demo.Repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public CursoModel createCurso(CursoModel cursoModel) {
        return cursoRepository.save(cursoModel);
    }
    public List<CursoModel> getAllCursos() {
        return cursoRepository.findAll();
    }
    public Optional<CursoModel> getByIDCurso(Long id) {
        return cursoRepository.findById(id);
    }
    public void deleteCurso(Long id) {
        cursoRepository.deleteById(id);
    }
}
