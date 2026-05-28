package com.example;

public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado;

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

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public void emprestarLivro(){
        if(!isEmprestado()){
            setEmprestado(true);
        }else{
            System.out.println("Livro já está emprestado");
        }
    }

    public void devolverLivro(){
        setEmprestado(false);
    }

    public void verifcarDisponibilidade(){
        if(!isEmprestado()){
            System.out.println("Livro disponivel");
        }else{
            System.out.println("Livro já está emprestado");
        }
    }
}
