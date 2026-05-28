package com.example;

public class EmprestaLivro {

    public void EmprestaLivro(Livro livro, Aluno aluno) {
        if(aluno.getStatus() != StatusAluno.ATIVO){
            throw new IllegalAccessError("Erro: O aluno está inativo e não pode pegar um livro emprestado");
        }else{
            livro.emprestarLivro();
            /*nesse caso como o livro sabe se esta disponivel ou não coloco a verificação do emprestar dentro do proprio
            livro, e quanto a regra de que o aluno tem que estar ativo isso não depende apenas do livro mas tambem do aluno
            por conta disso temos a classe EmprestarLivro */
        }
    }
}
