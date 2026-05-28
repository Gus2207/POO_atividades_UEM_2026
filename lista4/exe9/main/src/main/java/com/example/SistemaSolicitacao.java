package com.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaSolicitacao {
    private List<Solicitacao> solicitacoes;
    Scanner scan = new Scanner(System.in);

    public SistemaSolicitacao() {
        this.solicitacoes = new ArrayList<>();
    }

    public void criarSolicitacao(String dataEntrega, String descricao){
        Solicitacao solicitacao = new Solicitacao(dataEntrega, descricao);
        solicitacoes.add(solicitacao);
    }

    public void analisaSolicitacao(Usuario usuario){
        if(usuario.getStatusUsuario() != StatusUsuario.GERENTE){
            throw new IllegalArgumentException("Erro: Somente gerentes podem aprovar solicitações");
        }else{
            for (Solicitacao elem : solicitacoes) {
                if(elem.getStatusSolicitacao() == StatusSolicitacao.PENDENTE){
                    System.out.println("");
                    System.out.println("Deseja aprovar a solicitação: " + elem.getDescricao() + "1 - SIM, 2 - NÃO");
                    int aprovar = scan.nextInt();

                    if(aprovar == 1){
                        elem.setStatusSolicitacao(StatusSolicitacao.APROVADA);
                    }else{
                        elem.setStatusSolicitacao(StatusSolicitacao.CANCELADA);
                    }
                }
            }
        }
    }

    public List<Solicitacao> getSolicitacoes() {
        return solicitacoes;
    }

    public void setSolicitacoes(List<Solicitacao> solicitacoes) {
        this.solicitacoes = solicitacoes;
    }

    public void exibeSolicitacoes(){
        for (Solicitacao elem : solicitacoes) {
            System.out.println("");
            System.out.println("Solicitacao: " + elem.getDescricao());
            System.out.println("Status: " + elem.getStatusSolicitacao().toString());
        }
    }
    
}
