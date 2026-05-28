package com.example;

public class Usuario {
    private String login;
    private String email;
    private Perfil perfil;

    public Usuario(String email, String login, Perfil perfil) {
        this.email = email;
        this.login = login;
        this.perfil = perfil;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void exibiUsuario(){
        System.out.println("");
        System.out.println("Login: " + getLogin());
        System.out.println("Email: " + getEmail());
        System.out.println("Bio: " + getPerfil().getBio());
        System.out.println("Foto: " + getPerfil().getFoto());
        System.out.println("visibilidade: " + getPerfil().isVisibilidade());
    }
}
