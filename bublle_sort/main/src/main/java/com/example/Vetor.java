package com.example;

public class Vetor {
    private int[] vetor;
    private int tamanho; // referente a quantidade de elementos do vetor
    private int capacidadeMaxima;

    public Vetor() {
        this.capacidadeMaxima = 10; //tamanho padrão inicial
        this.vetor = new int[this.capacidadeMaxima];
        this.tamanho = 0;
    }

    public int buscaElemento(int posicao){
        return getVetor()[posicao];
    }

    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getcapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void adicionarElemento(int elemento){
        if(this.tamanho < this.capacidadeMaxima){
            this.vetor[this.tamanho] = elemento;
            this.tamanho += 1;
        }else{
            this.capacidadeMaxima = this.capacidadeMaxima * 2;
            int[] novo_vetor = new int[this.capacidadeMaxima];

            for(int i = 0; i < getTamanho(); i++){
                novo_vetor[i] = buscaElemento(i);
            }
            this.vetor = novo_vetor;
            this.vetor[this.tamanho] = elemento;
            this.tamanho +=1;
        }
    }

    public void alterarElemento(int posicao, int elemento){
        if (posicao < this.tamanho && posicao >= 0) {
            this.vetor[posicao] = elemento;
        }else{
            System.out.println("Posição a ser inserida inválida");
        }
    }

    public void exibeVetor(){
        System.out.println("");
        System.out.print("[ " + buscaElemento(0));
        for(int i = 1; i < getTamanho(); i++){
            System.out.print(", " + buscaElemento(i));
        }
        System.out.print(" ]");
    }

    public void setcapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }
}
