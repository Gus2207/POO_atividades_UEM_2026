package com.example;

public class Carro {
    private String marca;
    private String modelo;
    private Motor motor;

    public Carro(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void ligarCarro(){
        System.out.println("Carro ligado!!");
    }

    public void exibirFichaTecnica(){
        System.out.println("marca: " + getMarca());
        System.out.println("modelo: " + getModelo());
        System.out.println("tipo motor: " + getMotor().getTipo());
        System.out.println("potencia motor: " + getMotor().getPotencia());
        System.out.println("numero de serie motor: " + getMotor().getNumeroSerie());
    }
}
