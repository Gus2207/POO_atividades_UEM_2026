package com.example;

public class Funcionario {
    private String nome;
    private String cargo;
    private Cracha cracha;

    public Funcionario(String cargo, Cracha cracha, String nome) {
        this.cargo = cargo;
        this.cracha = cracha;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Cracha getCracha() {
        return cracha;
    }

    public void exibirFuncionario(){
        System.out.println("");
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Codigo crácha: " + getCracha().getCodigo());
        System.out.println("validade Cracha: " + getCracha().getDataValidade());
    }
}
