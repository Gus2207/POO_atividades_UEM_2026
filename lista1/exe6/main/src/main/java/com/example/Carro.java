package com.example;

public class Carro {
    private String marca;
    private String modelo;
    private double velocidade;

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

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar(){
        setVelocidade(getVelocidade() + 10.0);
    }

    public void frear(){
        if(getVelocidade() < 10.0){
            setVelocidade(0);
        }else{
            setVelocidade(getVelocidade() - 10.0);
        }
    }
}
