package com.eleodoro.biblioteca_eleodoro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.eleodoro.biblioteca_eleodoro.model.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long>{

    @Query(value = "select * from emprestimo where isbn = ?1", nativeQuery = true)
    Emprestimo consultarPorIsbnLivro(String isbnLivro);
    
}
