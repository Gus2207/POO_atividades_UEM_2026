package com.example;

public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;

    public Endereco(String bairro, String cidade, int numero, String rua) {
        this.bairro = bairro;
        this.cidade = cidade;
        this.numero = numero;
        this.rua = rua;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    
}
