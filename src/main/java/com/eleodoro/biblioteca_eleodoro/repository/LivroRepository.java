package com.eleodoro.biblioteca_eleodoro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eleodoro.biblioteca_eleodoro.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{
    
}
