package com.example;

public class Livro {
    private String titulo;
    private String autor;
    private ISBN isbn;

    public Livro(String autor, ISBN isbn, String titulo) {
        this.autor = autor;
        this.isbn = isbn;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public ISBN getIsbn() {
        return isbn;
    }

    public void exibeDados(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Codigo ISBN: " + getIsbn().getCodigo());
        System.out.println("Editora ISBN: " + getIsbn().getEditora());
    }


}
