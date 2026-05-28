package com.example;

public class Main {

    public static void main(String[] args) {
        Motor motor = new Motor(12345, "200cv", "Flex");

        Carro carro = new Carro("Toyota", "Corolla", motor);
        carro.ligarCarro();
        carro.exibirFichaTecnica();
    }
}
