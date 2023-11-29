package com.Trabalho.demo.Controller;

import com.Trabalho.demo.Model.CursoModel;
import com.Trabalho.demo.Service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    CursoService cursoService;

    @PostMapping
    public ResponseEntity<Object> createCurso(@RequestBody CursoModel cursoModel){
        return ResponseEntity.status(HttpStatus.OK).body(cursoService.createCurso(cursoModel));
    }

    @GetMapping
    public ResponseEntity<List<CursoModel>> findAllCurso(){
        return ResponseEntity.status(HttpStatus.OK).body(cursoService.getAllCursos());
    }

    @GetMapping("/{id}")
    public ResponseEntity <Optional<CursoModel>> getByIDCurso(@PathVariable(value = "id") Long id){
        return ResponseEntity.status(HttpStatus.OK).body(cursoService.getByIDCurso(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity <CursoModel> updateCursoByID(@PathVariable(value = "id")Long id, @RequestBody CursoModel cursoModel) {

        Optional <CursoModel> cursoEncontrado = cursoService.getByIDCurso(id);

        if(cursoEncontrado.isEmpty()){
            ResponseEntity.status(HttpStatus.OK).body("Não encontrado");
        }

        CursoModel cursoModel1 = cursoEncontrado.get();
        cursoModel1.setNome(cursoModel.getNome());

        return ResponseEntity.status(HttpStatus.OK).body(cursoService.createCurso(cursoModel1));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteByID(
            @PathVariable(value = "id") Long id) {
        cursoService.deleteCurso(id);
        return ResponseEntity.status(HttpStatus.OK).body("Deletado");
    }
}
