package com.example;

public class Main {

    public static void main(String[] args) {
        CPF cpf = new CPF(65565565, true);

        Pessoa fulano = new Pessoa(cpf, 18, "Fulano");

        fulano.exibirDados();
    }
}
