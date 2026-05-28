package com.example;

public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void adicionarPontos(int pontos){
        setPontuacao(getPontuacao() + pontos);

        setNivel(getNivel() + (pontos / 100));
    }
}
