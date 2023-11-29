package com.Trabalho.demo.Service;

import com.Trabalho.demo.Model.AlunoModel;
import com.Trabalho.demo.Repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public AlunoModel createAluno(AlunoModel alunoModel){
        return alunoRepository.save(alunoModel);
    }

    public List<AlunoModel> getAll(){
        return alunoRepository.findAll();
    }

    public Optional<AlunoModel> getByID(Long id){
        return alunoRepository.findById(id);
    }

    public void deleteAluno(Long id){
        alunoRepository.deleteById(id);
    }
}
