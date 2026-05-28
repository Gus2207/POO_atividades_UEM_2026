package com.example;

public class Aluno {
    private String nome;
    private String curso;
    private Carteirinha carteirinha;

    public Aluno(Carteirinha carteirinha, String curso, String nome) {
        this.carteirinha = carteirinha;
        this.curso = curso;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Carteirinha getCarteirinha() {
        return carteirinha;
    }

    public void exibirDados(){
        System.out.println("nome: " + getNome());
        System.out.println("curso: " + getCurso());
        System.out.println("numero carteirinha: " + getCarteirinha().getNumero());
        System.out.println("data emissão carteirinha>: " + getCarteirinha().getDataEmissao());
    }
    
}
