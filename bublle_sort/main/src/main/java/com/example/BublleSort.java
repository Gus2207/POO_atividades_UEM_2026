package com.example;

public class BublleSort implements MetodoOrdenacao{

    @Override
    public void ordenar(Vetor vetor){
        int aux;
        for(int i = 0; i < vetor.getTamanho() - 1; i++){
            for(int j = 0; j < vetor.getTamanho() - 1 - i; j++){
                if(vetor.buscaElemento(j) > vetor.buscaElemento(j + 1)){
                    aux = vetor.buscaElemento(j);
                    vetor.alterarElemento(j, vetor.buscaElemento(j + 1));
                    vetor.alterarElemento(j + 1, aux);
                }
            }
        }
    }
}
