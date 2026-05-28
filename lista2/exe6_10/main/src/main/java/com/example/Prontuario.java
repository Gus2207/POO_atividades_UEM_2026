package com.example;

public class Prontuario {
    private int numeroRegistro;
    private String tipoSanguineo;
    private String alergias;

    public Prontuario(String alergias, int numeroRegistro, String tipoSanguineo) {
        this.alergias = alergias;
        this.numeroRegistro = numeroRegistro;
        this.tipoSanguineo = tipoSanguineo;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    
}
