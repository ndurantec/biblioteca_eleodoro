package com.eleodoro.biblioteca_eleodoro.dto;

import java.time.LocalDateTime;

public class EmprestimoDTO {
    
    private int cgmAluno;
    private String isbnLivro;
    private LocalDateTime dataEmprestimo;
    private LocalDateTime dataEntrega;

    public EmprestimoDTO() {
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

    public LocalDateTime getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDateTime getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDateTime dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    
}
