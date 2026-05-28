package com.example;

public class ReservaHotel {
    private String nomeHospede;
    private int quantidadeDiarias;
    private double valorDiaria;

    public String getNomeHospede() {
        return nomeHospede;
    }

    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }

    public int getQuantidadeDiarias() {
        return quantidadeDiarias;
    }

    public void setQuantidadeDiarias(int quantidadeDiarias) {
        this.quantidadeDiarias = quantidadeDiarias;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public double calcularTotal(){
        return getQuantidadeDiarias() * getValorDiaria();
    }

    public void exibirReserva(){
        System.out.println("Nome do hospede: " + getNomeHospede());
        System.out.println("Quantidade de diarias: " + getQuantidadeDiarias());
        System.out.println("Valor das diarias: " + getValorDiaria());
        System.out.println("Valor total: " + calcularTotal());
    }
}
