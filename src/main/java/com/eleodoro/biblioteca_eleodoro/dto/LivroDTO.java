package com.eleodoro.biblioteca_eleodoro.dto;

import com.eleodoro.biblioteca_eleodoro.model.Livro;

public class LivroDTO {

    private String nome;
    private String genero;
    private int anoPublicacao;
    private String isbn;
    private int estante;
    private int idadeIndicativa;
    private String autor;
    
    public LivroDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getEstante() {
        return estante;
    }

    public void setEstante(int estante) {
        this.estante = estante;
    }

    public int getIdadeIndicativa() {
        return idadeIndicativa;
    }

    public void setIdadeIndicativa(int idadeIndicativa) {
        this.idadeIndicativa = idadeIndicativa;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Livro novoLivro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'novoLivro'");
    }

    
    
}
