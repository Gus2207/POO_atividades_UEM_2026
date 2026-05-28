package com.example;

public class Usuario {
    private String nome;
    private String email;
    private StatusUsuario statusUsuario;

    public Usuario(String email, String nome, StatusUsuario statusUsuario) {
        this.email = email;
        this.nome = nome;
        this.statusUsuario = statusUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public StatusUsuario getStatusUsuario() {
        return statusUsuario;
    }

    public void setStatusUsuario(StatusUsuario statusUsuario) {
        this.statusUsuario = statusUsuario;
    }
}
