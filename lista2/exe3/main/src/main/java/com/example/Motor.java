package com.example;

public class Motor {
    private String tipo;
    private String potencia;
    private int numeroSerie;

    public Motor(int numeroSerie, String potencia, String tipo) {
        this.numeroSerie = numeroSerie;
        this.potencia = potencia;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    
}
