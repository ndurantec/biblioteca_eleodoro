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

import com.eleodoro.biblioteca_eleodoro.dto.LivroDTO;
import com.eleodoro.biblioteca_eleodoro.model.Livro;
import com.eleodoro.biblioteca_eleodoro.repository.LivroRepository;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/livro")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @PostMapping(value = "/insert")
    public ResponseEntity<Livro> insert (@RequestBody LivroDTO livroDTO) {
        System.out.println("Chegou no método insert");
        System.out.println(livroDTO.toString());

        Livro novoLivro = livroDTO.novoLivro();
        livroRepository.save(novoLivro);


        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("{id}")
            .buildAndExpand(novoLivro.getId())
            .toUri();

        return ResponseEntity.created(uri).body(novoLivro);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> update(@PathVariable Long Id, @RequestBody Livro livro) {
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/imprimir")
    public String imprimir(){
        return "Cheguei até aqui 3";
    }
}
