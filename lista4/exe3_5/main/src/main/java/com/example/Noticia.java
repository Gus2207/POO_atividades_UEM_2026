package com.example;

public class Noticia {
    private String titulo;
    private String foto;
    private String texto;

    public Noticia(String foto, String texto, String titulo) {
        this.foto = foto;
        this.texto = texto;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    
}
