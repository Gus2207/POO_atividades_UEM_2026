package com.example;

public class Casa {
    private String cor;
    private int quantidadeDeQuartos;
    private Endereco endereco;

    public Casa(String cor, Endereco endereco, int quantidadeDeQuartos) {
        this.cor = cor;
        this.endereco = endereco;
        this.quantidadeDeQuartos = quantidadeDeQuartos;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuantidadeDeQuartos() {
        return quantidadeDeQuartos;
    }

    public void setQuantidadeDeQuartos(int quantidadeDeQuartos) {
        this.quantidadeDeQuartos = quantidadeDeQuartos;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    
    public void exibirCasa(){
        System.out.println("");
        System.out.println("Cor: " + getCor());
        System.out.println("Quantidade de quartos: " + getQuantidadeDeQuartos());
        System.out.println("Rua: " + getEndereco().getRua());
        System.out.println("Numero: " + getEndereco().getNumero());
        System.out.println("Bairro: " + getEndereco().getBairro());
        System.out.println("Cidade: " + getEndereco().getCidade());
    }
}
