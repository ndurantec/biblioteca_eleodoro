package com.eleodoro.biblioteca_eleodoro.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "/livro")
public class LivroController {

    @GetMapping(value = "/imprimir")
    public void imprimir(){
        System.out.println("Cheguei até aqui 3");
    }
    
}
