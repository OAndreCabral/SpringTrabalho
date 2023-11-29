package com.Trabalho.demo.Repository;

import com.Trabalho.demo.Model.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoModel, Long> {
}
