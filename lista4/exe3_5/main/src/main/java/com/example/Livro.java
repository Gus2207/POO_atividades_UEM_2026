package com.example;

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
        this.disponivel = true;
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

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestarLivro(){
        if(isDisponivel()){
            System.out.println("Parabens você pegou o livro emprestado!");
            setDisponivel(!isDisponivel());
        }else{
            System.out.println("O livro não está disponivel para emprestimo");
        }
    }
}
