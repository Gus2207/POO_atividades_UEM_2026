package com.example;

public class Pessoa {
    private String nome;
    private int idade;
    private CPF cpf;

    public Pessoa(CPF cpf, int idade, String nome) {
        this.cpf = cpf;
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public CPF getCpf() {
        return cpf;
    }

    public void exibirDados(){
        System.out.println("nome: " + getNome());
        System.out.println("idade: " + getIdade());
        System.out.println("cpf: " + getCpf().getCpf());
    }
}
