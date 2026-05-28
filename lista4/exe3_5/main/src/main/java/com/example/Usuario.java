package com.example;

public class Usuario {
    private String nome;
    private NivelAcesso nivelAcesso;

    public Usuario(NivelAcesso nivelAcesso, String nome) {
        this.nivelAcesso = nivelAcesso;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelAcesso getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(NivelAcesso nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    
}
