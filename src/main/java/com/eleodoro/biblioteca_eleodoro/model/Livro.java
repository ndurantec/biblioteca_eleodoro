package com.eleodoro.biblioteca_eleodoro.model;

public class Livro {
    
    private String nome;
    private String genero;
    private int anoPublicacao;
    private String isbn;
    private int estante;
    private int idadeIndicativa;
    private String autor;

    public Livro() {
    }

    public Livro(String nome, String genero, int anoPublicacao, String isbn, int estante, int idadeIndicativa,
            String autor) {
        this.nome = nome;
        this.genero = genero;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
        this.estante = estante;
        this.idadeIndicativa = idadeIndicativa;
        this.autor = autor;
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
    public void validarISBN() {

    }

    public void cadastrarLivro(){

    }
    
    public void alterarLivro(){

    }
    
    public void consultarISBN(){

    }
    
    public void deletarLivro(){

    }
    
    public void buscarLivro(){
        
    }
    public void validarISBN() {

    }

    public void cadastrarLivro(){

    }
    
    public void alterarLivro(){

    }
    
    public void consultarISBN(){

    }
    
    public void deletarLivro(){

    }
    
    public void buscarLivro(){
        
    }


    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", genero=" + genero + ", anoPublicacao=" + anoPublicacao + ", isbn=" + isbn
                + ", estante=" + estante + ", idadeIndicativa=" + idadeIndicativa + ", autor=" + autor + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + anoPublicacao;
        result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
        result = prime * result + estante;
        result = prime * result + idadeIndicativa;
        result = prime * result + ((autor == null) ? 0 : autor.hashCode());
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
        Livro other = (Livro) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (anoPublicacao != other.anoPublicacao)
            return false;
        if (isbn == null) {
            if (other.isbn != null)
                return false;
        } else if (!isbn.equals(other.isbn))
            return false;
        if (estante != other.estante)
            return false;
        if (idadeIndicativa != other.idadeIndicativa)
            return false;
        if (autor == null) {
            if (other.autor != null)
                return false;
        } else if (!autor.equals(other.autor))
            return false;
        return true;
    }

    
    

}
