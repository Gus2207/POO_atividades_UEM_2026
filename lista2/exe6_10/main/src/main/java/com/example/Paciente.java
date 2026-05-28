package com.example;

public class Paciente {
    private String nome;
    private int idade;
    private Prontuario prontuario;

    public Paciente(int idade, String nome, Prontuario prontuario) {
        this.idade = idade;
        this.nome = nome;
        this.prontuario = prontuario;
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

    public Prontuario getProntuario() {
        return prontuario;
    }

    public void exibirPaciente(){
        System.out.println("");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Numero Registro: " + getProntuario().getNumeroRegistro());
        System.out.println("Tipo sanguineo: " + getProntuario().getTipoSanguineo());
        System.out.println("Alergias: " + getProntuario().getAlergias());
    }
}
