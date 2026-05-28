package com.example;

public class Main {

    public static void main(String[] args) {
        Usuario usuraio1 = new Usuario("alguemdasilve@email.com", "Alguem da Silva", StatusUsuario.PADRAO);
        Usuario usuario2 = new Usuario("outrodesouza@email.com", "Outro de Souza", StatusUsuario.GERENTE);
        SistemaSolicitacao sistemaSolicitacao = new SistemaSolicitacao();

        sistemaSolicitacao.criarSolicitacao("Um dia ai", "Entregar umas coisas para alguem");
        sistemaSolicitacao.criarSolicitacao("Outro dia ai", "Entregar mais coisas para outro alguem ai");
        sistemaSolicitacao.criarSolicitacao("19/05/2057", "Relatório de Planejamento Estratégico");

        try {
            sistemaSolicitacao.analisaSolicitacao(usuraio1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            sistemaSolicitacao.analisaSolicitacao(usuario2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sistemaSolicitacao.exibeSolicitacoes();
    }
}
