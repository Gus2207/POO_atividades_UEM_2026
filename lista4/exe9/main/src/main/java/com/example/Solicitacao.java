package com.example;

public class Solicitacao {
    private String descricao;
    private String dataEntrega; 
    private StatusSolicitacao statusSolicitacao;

    public Solicitacao(String dataEntrega, String descricao) {
        this.dataEntrega = dataEntrega;
        this.descricao = descricao;
        this.statusSolicitacao = StatusSolicitacao.PENDENTE;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public StatusSolicitacao getStatusSolicitacao() {
        return statusSolicitacao;
    }

    public void setStatusSolicitacao(StatusSolicitacao statusSolicitacao) {
        this.statusSolicitacao = statusSolicitacao;
    }
}
