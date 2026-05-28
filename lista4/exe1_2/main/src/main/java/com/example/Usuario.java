package com.example;

public class Usuario {
    private String nome;
    private String email;
    private NivelAcesso nivelAcesso; 

    public Usuario(String email, String nome, NivelAcesso nivelAcesso) {
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
