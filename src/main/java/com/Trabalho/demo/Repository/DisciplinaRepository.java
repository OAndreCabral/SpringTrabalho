package com.Trabalho.demo.Repository;

import com.Trabalho.demo.Model.DisciplinaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaRepository extends JpaRepository<DisciplinaModel, Long> {
}
