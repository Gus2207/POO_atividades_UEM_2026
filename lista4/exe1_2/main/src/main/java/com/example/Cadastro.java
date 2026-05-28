package com.example;

public class Cadastro {

    public void cadastrarProduto(Produto produto, Usuario usuario){
        if(usuario.getNivelAcesso() != NivelAcesso.ADMIN){
            throw new IllegalAccessError("Erro: Usuário sem permissão");
        }else{
            System.out.println("Produto " + produto.getNome() + " cadastrado por " + usuario.getNome());
        }
    }
}
