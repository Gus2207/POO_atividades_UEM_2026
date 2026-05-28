package com.example;

public class ISBN {
    private int codigo;
    private String editora;
    private Livro livro;

    public ISBN(int codigo, String editora) {
        this.codigo = codigo;
        this.editora = editora;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Livro getLivro() {
        return livro;
    }
    public void setLivro(Livro livro){
        this.livro = livro;
    }

  

}
