package com.example;

public class Comentario {
    private Usuario usuario;
    private String descricao;
    private String data;

    public Comentario(String data, String descricao, Usuario usuario) {
        this.data = data;
        this.descricao = descricao;
        this.usuario = usuario;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
