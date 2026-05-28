package com.example;

public class Main {

    public static void main(String[] args) {
        Carteirinha carteirinha = new Carteirinha("18/15/2012", 165165161);

        Aluno fulano = new Aluno(carteirinha, "Ciencias da computação", "Fualno");

        fulano.exibirDados();
    }
}
