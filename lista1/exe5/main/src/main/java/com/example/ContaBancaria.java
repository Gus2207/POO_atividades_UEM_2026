package com.example;

public class ContaBancaria {
    private double numero;
    private String titular;
    private double saldo;

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo e: " + getSaldo());
    }

    public void depositar(double valor){
        setSaldo(getSaldo() + valor);
    }

    public void sacar(double valor){
        if(getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
}
