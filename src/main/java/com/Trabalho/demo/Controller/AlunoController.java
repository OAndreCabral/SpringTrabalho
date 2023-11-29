package com.Trabalho.demo.Controller;

import com.Trabalho.demo.Model.AlunoModel;
import com.Trabalho.demo.Service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @PostMapping
    public ResponseEntity<Object> createAluno(@RequestBody AlunoModel alunoModel){
        return ResponseEntity.status(HttpStatus.OK).body(alunoService.createAluno(alunoModel));
    }

    @GetMapping
    public ResponseEntity<List<AlunoModel>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(alunoService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity <Optional<AlunoModel>> getByID(@PathVariable(value = "id") Long id){
        return ResponseEntity.status(HttpStatus.OK).body(alunoService.getByID(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity <AlunoModel> updateByID(
            @PathVariable(value = "id") Long id,
            @RequestBody AlunoModel alunoModel) {

        Optional <AlunoModel> alunoEncontrado = alunoService.getByID(id);

        if(alunoEncontrado.isEmpty()){
           ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado");
        }

        AlunoModel alunoFinal = alunoEncontrado.get();
        alunoFinal.setNome(alunoModel.getNome());
        alunoFinal.setTelefone(alunoModel.getTelefone());

        return ResponseEntity.status(HttpStatus.OK).body(alunoService.createAluno(alunoFinal));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteByID(
            @PathVariable(value = "id") Long id) {
        alunoService.deleteAluno(id);
        return ResponseEntity.status(HttpStatus.OK).body("Deletado");
    }
}
