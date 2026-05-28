package com.example;

public class Tarefa {
    private String titulo;
    private String descricao;
    private StatusTarefa status;

    public Tarefa(String descricao, StatusTarefa status, String titulo) {
        this.descricao = descricao;
        this.status = status;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StatusTarefa getStatus() {
        return status;
    }

    public void setStatus(StatusTarefa status) {
        this.status = status;
    }

    public void concluirTarefa(){
        if(getStatus() != StatusTarefa.EM_ANDAMENTO){
            throw new IllegalArgumentException("Erro: a tarefa precisa estar em andamento para ser concluida");
        }else{
            setStatus(StatusTarefa.CONCLUIDA);
            System.out.println("Parabens sua tarefa foi marcada como concluida");
        }
    }
}
