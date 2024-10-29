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

        //Optional<Livro> livroBanco = ((Object) livroRepository).findById(Id);

        //Aluno livroModificado = livroBanco.get();

        //livroModificado.setNome(livro.getNome());

        //livroRepository.save(livroModificado);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/{id}")
    ResponseEntity<Livro> buscarPorId(@PathVariable Long id) {
      return (ResponseEntity<Livro>) livroRepository.findById(id)
          .map(registro -> ResponseEntity.ok().body(registro))
          .orElse(ResponseEntity.notFound().build());
    }


    // @DeleteMapping("/{id}")
    // public ResponseEntity<String> deleteLivro(@PathVariable Long id) {
    // Optional<Livro> livroBanco = livroRepository.findById(id);

    //     if (livroBanco.isPresent()) {
    //         livroRepository.delete(livroBanco.get());
    //         return ResponseEntity.ok("Livro with nome " + id + " deleted.");
    //     }
    
    //     return ResponseEntity.notFound().build();
    // }

    @GetMapping(value = "/imprimir")
    public String imprimir(){
        return "Cheguei até aqui 3";
    }
}
