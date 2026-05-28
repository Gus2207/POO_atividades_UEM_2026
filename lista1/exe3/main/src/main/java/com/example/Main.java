package com.example;

public class Main {

    public static void main(String[] args) {
        Aluno fulano = new Aluno();

        fulano.setNome("Fulano da Silva");
        fulano.setMatricula(181516);
        fulano.setNota1(5);
        fulano.setNota2(9);

        fulano.verificaSituacao();
    }
}
