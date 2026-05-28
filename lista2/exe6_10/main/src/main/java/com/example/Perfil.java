package com.example;

public class Perfil {
    private String bio;
    private String foto;
    private boolean visibilidade;

    public Perfil(String bio, String foto, boolean visibilidade) {
        this.bio = bio;
        this.foto = foto;
        this.visibilidade = visibilidade;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public boolean isVisibilidade() {
        return visibilidade;
    }

    public void setVisibilidade(boolean visibilidade) {
        this.visibilidade = visibilidade;
    }

    
}
