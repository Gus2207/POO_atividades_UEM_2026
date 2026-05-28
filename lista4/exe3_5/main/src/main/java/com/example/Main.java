package com.example;

public class Main {

    public static void main(String[] args) {
        Usuario jose = new Usuario(NivelAcesso.VISITANTE, "Jose");
        Usuario marcos = new Usuario(NivelAcesso.ADMIN, "Marcos");
        Aluno aluno1 = new Aluno("Psicologia", "Pedro", 154854, StatusAluno.DESATIVADO);
        Aluno aluno2 = new Aluno("Ciências da computação", "Marcos", 564789, StatusAluno.ATIVO);
        Professor professor2 = new Professor("Ciências da computação", "João", 1548515);
        Turma turma1 = new Turma("Psicologia");
        Turma turma2 = new Turma("Ciências da computação");
        Livro livro1 = new Livro("Dom quixote", "Um livro ai");
        Livro livro2 = new Livro("Beltrano da Silva", "Outro livro ai");
        SistemaNoticias sistemaNoticia = new SistemaNoticias();
        EmprestaLivro emprestaLivro = new EmprestaLivro();
        SistemaNotas sistemaNotas = new SistemaNotas();
        Tarefa tarefa1 = new Tarefa("Fazer umas coisas ai", StatusTarefa.NAO_INICIADO, "Fazer coisas");
        Tarefa tarefa2 = new Tarefa("Fazer outras coisas", StatusTarefa.EM_ANDAMENTO, "Fazer mais coisas");

        try{
            sistemaNoticia.criarNoticia("Url imagem", "Apresentaçaõ de tal coisa no dia tal...", "Apresentacao de algo", marcos);
            sistemaNoticia.visualizarNoticia(marcos);
            sistemaNoticia.visualizarNoticia(jose);
            System.out.println("");
            System.out.println("Cara que criou a noticia: " + marcos.getNome());
        }catch(IllegalAccessError e){
            System.out.println("Erro: " + e.getMessage());
        }

        try{
            sistemaNoticia.criarNoticia("Url imagem 2", "Prefeitura não tapa buraco", "Buraco na rua", jose);
            //aqui levando em consideração que só é possivel visualizar uma noticia que tenha sido criada
            sistemaNoticia.visualizarNoticia(jose);
            System.out.println("");
            System.out.println("Cara que criou a noticia: " + jose.getNome());
        }catch(IllegalAccessError e){
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            System.out.println("");
            emprestaLivro.EmprestaLivro(livro1, aluno1);
        } catch (IllegalAccessError e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            System.out.println("");
            emprestaLivro.EmprestaLivro(livro2, aluno2);
        } catch (IllegalAccessError e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            tarefa1.concluirTarefa();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            tarefa2.concluirTarefa();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        turma2.adicionarAlunos(aluno2);
        turma1.adicionarAlunos(aluno1);

        try {
            sistemaNotas.cadastrarNotas(turma2, professor2);
            System.out.println("");
            System.out.println("Notas cadastradas com sucesso");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            sistemaNotas.cadastrarNotas(turma1, professor2);
            System.out.println("");
            System.out.println("Notas cadastradas com sucesso");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
