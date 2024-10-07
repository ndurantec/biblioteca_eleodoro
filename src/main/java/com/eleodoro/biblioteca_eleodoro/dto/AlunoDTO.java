package com.eleodoro.biblioteca_eleodoro.dto;

import java.time.LocalDateTime;

import com.eleodoro.biblioteca_eleodoro.model.Aluno;

public class AlunoDTO {

    private String nome;
    private String endereco;
    private String email;
    private int cgm;
    private String telefone;
    private LocalDateTime dataNascimento;
    
    @Deprecated
    public AlunoDTO() {
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

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Aluno novoAluno() {
        return new Aluno(nome, endereco, email, cgm, telefone, dataNascimento);
    }

}
