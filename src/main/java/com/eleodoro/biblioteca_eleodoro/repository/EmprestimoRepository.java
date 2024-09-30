package com.eleodoro.biblioteca_eleodoro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eleodoro.biblioteca_eleodoro.model.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long>{
    
}
