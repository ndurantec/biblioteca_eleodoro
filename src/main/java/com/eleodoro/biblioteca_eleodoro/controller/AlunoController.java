package com.eleodoro.biblioteca_eleodoro.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "/aluno")
public class AlunoController {

    @GetMapping(value = "/imprimir")
    public String imprimir(){
        return "Cheguei até aqui";
    }
}
