package com.Trabalho.demo.Controller;

import com.Trabalho.demo.Model.AlunoCurso;
import com.Trabalho.demo.Service.AlunoCursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/aluno-curso")
public class AlunoCursoController {

    @Autowired
    AlunoCursoService cursoService;

    @GetMapping("/{id}")
    public ResponseEntity<List<AlunoCurso>> findAllAlunoCurso(@PathVariable(value = "id") Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(cursoService.getAlunoCursoID(id));
    }


}
