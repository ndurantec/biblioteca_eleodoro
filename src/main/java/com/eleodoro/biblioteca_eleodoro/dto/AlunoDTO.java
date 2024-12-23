package com.eleodoro.biblioteca_eleodoro.dto;

import java.time.LocalDate;

import com.eleodoro.biblioteca_eleodoro.model.Aluno;

public class AlunoDTO {

    private Long id;
    private String nome;
    private String endereco;
    private String email;
    private int cgm;
    private String telefone;
    private LocalDate dataNascimento;
    
    @Deprecated
    public AlunoDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCgm() {
        return cgm;
    }

    public void setCgm(int cgm) {
        this.cgm = cgm;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Aluno novoAluno() {
        return new Aluno(nome, endereco, email, cgm, telefone, dataNascimento);
    }
   

}
