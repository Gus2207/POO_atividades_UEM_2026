package com.gustavo;

public class Computador {
    private String marca;
    private int processador;
    private PlacaMae placaMae;

    public Computador(String marca, PlacaMae placaMae, int processador) {
        this.marca = marca;
        this.placaMae = placaMae;
        this.processador = processador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getProcessador() {
        return processador;
    }

    public void setProcessador(int processador) {
        this.processador = processador;
    }

    public PlacaMae getPlacaMae(){
        return placaMae;
    }

    public void exibirConfiguracao(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Processador: " + getProcessador());
        System.out.println("Modelo placa: " + getPlacaMae().getModelo());
        System.out.println("Chipset: " + getPlacaMae().getChipset());
    }
}
