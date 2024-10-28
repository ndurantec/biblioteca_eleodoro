package com.eleodoro.biblioteca_eleodoro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.eleodoro.biblioteca_eleodoro.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

    @Query(value = "select * from aluno where nome = ?1", nativeQuery = true)
    Aluno consultarPorNome(String nome);
    
}
