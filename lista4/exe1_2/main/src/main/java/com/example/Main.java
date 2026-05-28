package com.example;

public class Main {

    public static void main(String[] args) {
        Usuario jose = new Usuario("josesilva@email.com","Jose", NivelAcesso.LEITOR);
        Usuario marcos = new Usuario("marcosmonteiro@email.com","Marcos", NivelAcesso.ADMIN);
        Usuario marcelo = new Usuario("marceloborges@email.com","Marcelo", NivelAcesso.PADRAO);
        Produto produto1 = new Produto("Martelo", 14.5);
        Produto produto2 = new Produto("celular", 3000.68);
        Produto produto3 = new Produto("Maca de plastico", 2.0);
        Comentario comentario1 = new Comentario("15/05/2024", "Gostei do video ai", marcos);
        Comentario comentario2 = new Comentario("24/05/1995", "Não gostei do video ai", marcelo);

        Cadastro cadastro = new Cadastro();
        Publicacao publicacao = new Publicacao();

        try{
            cadastro.cadastrarProduto(produto1, jose);
            System.out.println("Criador: " + jose.getNome());
            System.out.println("Nome: " + produto1.getNome());
        }catch(IllegalAccessError e){
            System.out.println("Erro: " + e.getMessage());
        }

        try{
            cadastro.cadastrarProduto(produto2, marcelo);
            System.out.println("Criador: " + marcelo.getNome());
            System.out.println("Nome: " + produto2.getNome());
        }catch(IllegalAccessError e){
            System.out.println("Erro: " + e.getMessage());
        }

        try{
            cadastro.cadastrarProduto(produto3, marcos);
            System.out.println("Criador: " + marcos.getNome());
            System.out.println("Nome: " + produto3.getNome());
        }catch(IllegalAccessError e){
            System.out.println("Erro: " + e.getMessage());
        }

        try{
            publicacao.publicarComentario(marcos, comentario1);
            System.out.println("Comentario: " + comentario1.getDescricao());
            System.out.println("Publicador: " + marcos.getNome());
        }catch(IllegalAccessError e){
            System.out.println("Erro: " + e.getMessage());
        }

        try{
            publicacao.publicarComentario(marcelo, comentario2);
            System.out.println("Comentario: " + comentario2.getDescricao());
            System.out.println("Publicador: " + marcelo.getNome());
        }catch(IllegalAccessError e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}