package com.eleodoro.biblioteca_eleodoro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eleodoro.biblioteca_eleodoro.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
    
}
