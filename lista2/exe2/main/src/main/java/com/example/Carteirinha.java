package com.example;

public class Carteirinha {
    private int numero;
    private String dataEmissao;

    public Carteirinha(String dataEmissao, int numero) {
        this.dataEmissao = dataEmissao;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }
    
}
