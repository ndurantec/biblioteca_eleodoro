package com.eleodoro.biblioteca_eleodoro.controller;

import java.net.URI;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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

    @PutMapping("/{id}")    
    public ResponseEntity<Void> update(@PathVariable Long Id, @RequestBody Aluno aluno) {

        Optional<Aluno> alunoBanco = alunoRepository.findById(Id);

        Aluno alunoModificado = alunoBanco.get();

        alunoModificado.setNome(aluno.getNome());
        alunoModificado.setEndereco(aluno.getEndereco());
        alunoModificado.setEmail(aluno.getEmail());
        alunoModificado.setCgm(aluno.getCgm());
        alunoModificado.setTelefone(aluno.getTelefone());
        alunoModificado.setDataNascimento(aluno.getDataNascimento());
  

        alunoRepository.save(alunoModificado);

        return ResponseEntity.noContent().build();
    }

    @PostMapping("/findByNome")
    public ResponseEntity<Aluno> buscarAlunoPorNome(@RequestBody AlunoDTO alunoDto) {
        // Optional<Aluno> aluno = alunoRepository.consultarPorNome(alunoDto.getNome());
        Aluno alunoBanco = alunoRepository.consultarPorNome(alunoDto.getNome());
        //Aluno alunoObjeto = aluno.get();        
        return ResponseEntity.ok().body(alunoBanco);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAluno(@PathVariable Long id) {
    Optional<Aluno> alunoBanco = alunoRepository.findById(id);

        if (alunoBanco.isPresent()) {
            alunoRepository.delete(alunoBanco.get());
            return ResponseEntity.ok("Aluno with nome " + id + " deleted.");
        }
    
        return ResponseEntity.notFound().build();
    }


    @GetMapping(value = "/imprimir")
    public String imprimir(){
        return "Cheguei até aqui";
    }
}
