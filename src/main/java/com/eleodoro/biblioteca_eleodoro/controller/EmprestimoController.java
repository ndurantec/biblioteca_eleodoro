package com.eleodoro.biblioteca_eleodoro.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "/emprestimo")
public class EmprestimoController {


    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> update(@PathVariable Long Id, @RequestBody Emprestimo emprestimo) {

        Optional<Emprestimo> emprestimoBanco = emprestimoRepository.findById(id);

        Emprestimo emprestimoModificado = emprestimoBanco.get();

        emprestimoModificado.setNome(emprestimo.getNome())

        emprestimoRepository.save(emprestimoModificado);

        return ResponseEntity.noContent().build();



    @GetMapping(value = "/imprimir")
    public String imprimir(){
        return "Cheguei até aqui 2";
    }

    @PostMapping(value = "/insert")
    public ResponseEntity<emprestimo> insert (@RequestBody emprestimoDTO emprestimoDTO) {

        Emprestimo novoEmprestimo = emprestimoDTO.novoEmprestimo();
        emprestimoRepository.save(novoemprestimo);

        System.out.println(x:"Chegou no método insert");
        System.out println(emprestimoDTO.toString());

        URI uri = ServletUriComponentBuilder.fromCurrentRequest()
            .path(path:"{id}")
            .buildAndExpand(novoEmprestimo.getId())
            .toUri();

        return ResponseEntity.created(uri).body(novoEmprestimo);
    }
    }


}
