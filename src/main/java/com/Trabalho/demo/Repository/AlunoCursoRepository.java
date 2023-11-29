package com.Trabalho.demo.Repository;

import com.Trabalho.demo.Model.AlunoCurso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlunoCursoRepository extends JpaRepository<AlunoCurso, Integer> {
    List<AlunoCurso> findAllByAlunoCursoKey_AlunoModel_Id(Long id);
}
