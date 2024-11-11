package com.eleodoro.biblioteca_eleodoro.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.eleodoro.biblioteca_eleodoro.model.Emprestimo;

public class EmprestimoDTO {
    
    private Long id;
    private int cgmAluno;
    private String isbnLivro;
    private LocalDate dataEmprestimo;
    private LocalDate dataEntrega;
    
    public EmprestimoDTO() {
    }
    
    public EmprestimoDTO(int cgmAluno, String isbnLivro, LocalDate dataEmprestimo, LocalDate dataEntrega) {
        this.cgmAluno = cgmAluno;
        this.isbnLivro = isbnLivro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataEntrega = dataEntrega;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
        
    public int getCgmAluno() {
        return cgmAluno;
    }

    public void setCgmAluno(int cgmAluno) {
        this.cgmAluno = cgmAluno;
    }

    public String getIsbnLivro() {
        return isbnLivro;
    }

    public void setIsbnLivro(String isbnLivro) {
        this.isbnLivro = isbnLivro;
    }
      
    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }
    
    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    
    public LocalDate getDataEntrega() {
        return dataEntrega;
    }
    
    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Emprestimo novoEmprestimo() {
        return new Emprestimo(cgmAluno, isbnLivro, dataEmprestimo, dataEntrega);
    }
    
}
