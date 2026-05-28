package com.gustavo;

public class Main {

    public static void main(String[] args) {
        PlacaMae placaMae = new PlacaMae("B450M", "ASUS");

        Computador pc = new Computador("Ryzen 5 5600G", placaMae, 16);

        pc.exibirConfiguracao();
    }
}
