package com.example;

public class Main {

    public static void main(String[] args) {
        Produto martelo = new Produto();
        Produto prego = new Produto();

        martelo.setNome("Martelo");
        martelo.setPreco(1.50);

        prego.setNome("Prego");
        prego.setPreco(1.20);

        martelo.mostraInformacoes();
        prego.mostraInformacoes();
    }
}
