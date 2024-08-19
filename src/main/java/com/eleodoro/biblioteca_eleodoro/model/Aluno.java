package com.eleodoro.biblioteca_eleodoro.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Aluno implements Serializable{

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    


    private String nome;
    private String endereco;
    private String email;
    private int cgm;
    private String telefone;
    private LocalDateTime dataNascimento;

    public Aluno() {
    }

    public Aluno(String nome, String endereco, String email, int cgm, String telefone, LocalDateTime dataNascimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.cgm = cgm;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }




    public static Long getSerialversionuid() {
        return serialVersionUID;
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

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void cadastrarAluno(String nome, String endereco, String email, int cmg, String telefone, LocalDateTime dataNascimento){

    }

    public void buscarAluno (String nome, int cmg){

    }

    
    public void incluirAluno(String nome, String endereco,String email, int cgm, String telefone, LocalDateTime dataNascimento){

    }


    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", endereco=" + endereco + ", email=" + email + ", cgm=" + cgm + ", telefone="
                + telefone + ", dataNascimento=" + dataNascimento + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + cgm;
        result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
        result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
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
        Aluno other = (Aluno) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (endereco == null) {
            if (other.endereco != null)
                return false;
        } else if (!endereco.equals(other.endereco))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (cgm != other.cgm)
            return false;
        if (telefone == null) {
            if (other.telefone != null)
                return false;
        } else if (!telefone.equals(other.telefone))
            return false;
        if (dataNascimento == null) {
            if (other.dataNascimento != null)
                return false;
        } else if (!dataNascimento.equals(other.dataNascimento))
            return false;
        return true;
    }
}
