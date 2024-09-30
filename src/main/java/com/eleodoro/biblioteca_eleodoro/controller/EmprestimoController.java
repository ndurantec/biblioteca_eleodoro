package com.eleodoro.biblioteca_eleodoro.controller;

import java.net.URI;
import java.util.Optional;

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
import com.eleodoro.biblioteca_eleodoro.dto.EmprestimoDTO;
import com.eleodoro.biblioteca_eleodoro.model.Emprestimo;

@RestController
@CrossOrigin
@RequestMapping(value = "/emprestimo")
public class EmprestimoController {




    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> update(@PathVariable Long Id, @RequestBody Emprestimo emprestimo) {

        Object emprestimoRepository;
        //Optional<Emprestimo> emprestimoBanco = ((Object) emprestimoRepository).findById(Id);

        //Emprestimo emprestimoModificado = emprestimoBanco.get();

        //emprestimoModificado.setNome(emprestimo.getNome());

        //emprestimoRepository.save(emprestimoModificado);

        return ResponseEntity.noContent().build();


        
        
    }

    @GetMapping(value = "/imprimir") String imprimir() {
        return "Cheguei até aqui 2";
    }
       
    @PostMapping(value = "/insert")
    public ResponseEntity<Emprestimo> insert (@RequestBody EmprestimoDTO emprestimoDTO) {

        Emprestimo novoEmprestimo = emprestimoDTO.novoEmprestimo();
        //emprestimoRepository.save(novoemprestimo);

        System.out.println("Chegou no método insert");
        System.out.println(emprestimoDTO.toString());

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("{id}")
            .buildAndExpand(novoEmprestimo.getId())
            .toUri();

        return ResponseEntity.created(uri).body(novoEmprestimo);

    }
}
