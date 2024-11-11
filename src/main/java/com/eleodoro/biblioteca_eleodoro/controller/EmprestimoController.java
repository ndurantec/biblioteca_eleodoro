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
import com.eleodoro.biblioteca_eleodoro.dto.EmprestimoDTO;
import com.eleodoro.biblioteca_eleodoro.model.Aluno;
import com.eleodoro.biblioteca_eleodoro.model.Emprestimo;
import com.eleodoro.biblioteca_eleodoro.model.Livro;
import com.eleodoro.biblioteca_eleodoro.repository.EmprestimoRepository;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/emprestimo")
public class EmprestimoController {

    @Autowired
    private EmprestimoRepository emprestimoRepository;

    @PostMapping(value = "/insert")
    public ResponseEntity<Emprestimo> insert (@RequestBody EmprestimoDTO emprestimoDTO) {
        System.out.println("Chegou no método insert");
        System.out.println(emprestimoDTO.toString());

        Emprestimo novoEmprestimo = emprestimoDTO.novoEmprestimo();
        emprestimoRepository.save(novoEmprestimo);


        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("{id}")
            .buildAndExpand(novoEmprestimo.getId())
            .toUri();

        return ResponseEntity.created(uri).body(novoEmprestimo);

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Emprestimo> update(@PathVariable Long id, @RequestBody EmprestimoDTO emprestimoDto) {

 
        Optional<Emprestimo> emprestimoBanco = emprestimoRepository.findById(id);

        Emprestimo emprestimoObjeto = emprestimoBanco.get();

        emprestimoObjeto.setCgmAluno(emprestimoDto.getCgmAluno());
        emprestimoObjeto.setIsbnLivro(emprestimoDto.getIsbnLivro());
        emprestimoObjeto.setDataEmprestimo(emprestimoDto.getDataEmprestimo());
        emprestimoObjeto.setDataEntrega(emprestimoDto.getDataEntrega());



        emprestimoRepository.save(emprestimoObjeto);

        return ResponseEntity.ok().body(emprestimoObjeto);
    }

    @PostMapping("/findByNome")
    public ResponseEntity<Emprestimo> buscarEmprestimoPorIsbnLivro(@RequestBody EmprestimoDTO emprestimoDto) {        
        Emprestimo emprestimoBanco = emprestimoRepository.consultarPorIsbnLivro(emprestimoDto.getIsbnLivro());             
        return ResponseEntity.ok().body(emprestimoBanco);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmprestimo(@PathVariable Long id) {
    Optional<Emprestimo> emprestimoBanco = emprestimoRepository.findById(id);

        if (emprestimoBanco.isPresent()) {
         emprestimoRepository.delete(emprestimoBanco.get());
         return ResponseEntity.ok("Emprestimo with nome " + id + " deleted.");
        }
    
        return ResponseEntity.notFound().build();
    }


    @GetMapping(value = "/imprimir") String imprimir() {
        return "Cheguei até aqui 2";
    }

}
