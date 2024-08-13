package com.eleodoro.biblioteca_eleodoro.model;

import java.time.LocalDateTime;

public class Emprestimo {
    
    private int cgmAluno;
    private String isbnLivro;
    private LocalDateTime dataEmprestimo;
    private LocalDateTime dataEntrega;

    public Emprestimo() {
    }

    public Emprestimo(int cgmAluno, String isbnLivro, LocalDateTime dataEmprestimo, LocalDateTime dataEntrega) {
        this.cgmAluno = cgmAluno;
        this.isbnLivro = isbnLivro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataEntrega = dataEntrega;
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
    
    public void validarCgmAluno(){

    }

    public void validarIsbn(){
        
    }


    @Override
    public String toString() {
        return "Emprestimo [cgmAluno=" + cgmAluno + ", isbnLivro=" + isbnLivro + ", dataEmprestimo=" + dataEmprestimo
                + ", dataEntrega=" + dataEntrega + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + cgmAluno;
        result = prime * result + ((isbnLivro == null) ? 0 : isbnLivro.hashCode());
        result = prime * result + ((dataEmprestimo == null) ? 0 : dataEmprestimo.hashCode());
        result = prime * result + ((dataEntrega == null) ? 0 : dataEntrega.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Emprestimo other = (Emprestimo) obj;
        if (cgmAluno != other.cgmAluno)
            return false;
        if (isbnLivro == null) {
            if (other.isbnLivro != null)
                return false;
        } else if (!isbnLivro.equals(other.isbnLivro))
            return false;
        if (dataEmprestimo == null) {
            if (other.dataEmprestimo != null)
                return false;
        } else if (!dataEmprestimo.equals(other.dataEmprestimo))
            return false;
        if (dataEntrega == null) {
            if (other.dataEntrega != null)
                return false;
        } else if (!dataEntrega.equals(other.dataEntrega))
            return false;
        return true;
    }

    
    
}
