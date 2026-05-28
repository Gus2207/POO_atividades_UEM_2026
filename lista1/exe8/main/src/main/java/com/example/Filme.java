package com.example;

public class Filme {
    private String titulo;
    private String genero;
    private double duracao;
    private int avaliacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void exibirFichaTecnica(){
        System.out.println("Titulo do filme: " + getTitulo());
        System.out.println("Genero do filme: " + getGenero());
        System.out.println("Duracao do filme: " + getDuracao());
        System.out.println("Avaliação do filme " + getAvaliacao());
    }

    public void alterarAvaliacao(int novaAvaliacao){
        if(novaAvaliacao > 10 || novaAvaliacao < 0){
            System.out.println("O valor possivel para avaliar o filme vai de 0 a 10");
        }
    }
}
