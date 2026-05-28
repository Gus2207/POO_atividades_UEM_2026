package com.example;

public class Main {

    public static void main(String[] args) {
        Vetor vetor = new Vetor();

        BublleSort ordenador = new BublleSort();

        vetor.adicionarElemento(5);
        vetor.adicionarElemento(15);
        vetor.adicionarElemento(6);
        vetor.adicionarElemento(1);
        vetor.adicionarElemento(9);
        vetor.adicionarElemento(25);
        vetor.adicionarElemento(2);
        vetor.adicionarElemento(98);
        vetor.adicionarElemento(72);
        vetor.adicionarElemento(71);
        vetor.adicionarElemento(4);
        vetor.adicionarElemento(7);
        vetor.adicionarElemento(11);
        vetor.adicionarElemento(88);

        vetor.exibeVetor();

        ordenador.ordenar(vetor);

        vetor.exibeVetor();

    }
}
