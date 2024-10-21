package com.eleodoro.biblioteca_eleodoro.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.eleodoro.biblioteca_eleodoro.dto.AlunoDTO;
import com.eleodoro.biblioteca_eleodoro.model.Aluno;
import com.eleodoro.biblioteca_eleodoro.repository.AlunoRepository;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/aluno")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @PostMapping(value = "/insert")
    public ResponseEntity<Aluno> insert (@RequestBody AlunoDTO alunoDTO) {
        System.out.println("Chegou no metodo insert");
        System.out.println(alunoDTO.toString());

        Aluno novoAluno = alunoDTO.novoAluno();
        alunoRepository.save(novoAluno);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("{id}")
            .buildAndExpand(novoAluno.getId())
            .toUri();

        return ResponseEntity.created(uri).body(novoAluno);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> update(@PathVariable Long Id, @RequestBody Aluno aluno) {

        //Optional<Aluno> emprestimoBanco = ((Object) alunoRepository).findById(Id);

        //Aluno alunoModificado = alunoBanco.get();

        //alunoModificado.setNome(aluno.getNome());

        //alunoRepository.save(alunoModificado);

        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/imprimir")
    public String imprimir(){
        return "Cheguei até aqui";
    }
}
