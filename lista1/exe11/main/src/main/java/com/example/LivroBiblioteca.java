package com.example;

public class LivroBiblioteca {
    private String titulo;
    private String autor;
    private int codigo;
    private boolean disponivel;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isdisponivel() {
        return disponivel;
    }

    public void setdisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar(){
        if(isdisponivel()){
            setdisponivel(false);
        }else{
            System.out.println("Livro já está emprestado");
        }
    }

    public void devolverLivro(){
        setdisponivel(true);
    }

    public void exibirInformacoes(){
        System.out.println("titulo livro: " + getTitulo());
        System.out.println("autor do livro: " + getAutor());
        System.out.println("codigo do livro: " + getCodigo());
        System.out.println("Situacao: ");
        if(!isdisponivel()){
            System.out.println("Livro disponivel");
        }else{
            System.out.println("Livro não esta disponivel");
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
