package com.example;

public class CPF {
    private int cpf;
    private boolean situacao;

    public CPF(int cpf, boolean situacao) {
        this.cpf = cpf;
        this.situacao = situacao;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public void exibirDados(){
        System.out.println("cpf: " + getCpf());
        if(isSituacao()){
            System.out.println("Cpf válido");
        }else{
            System.out.println("cpf cancelado");
        }
    }
}
