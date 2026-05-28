package com.example;

public class Produto{
    private String nome;
    private Double preco;

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void mostraInformacoes() {
        System.out.println("Produto: " + this.nome);
        System.out.println("Preço: " + this.preco);
    }
    
}