package com.example;

public class Publicacao {
    
    public void publicarComentario(Usuario usuario, Comentario comentario){
        if(usuario.getNivelAcesso() != NivelAcesso.PADRAO){
            throw new IllegalAccessError("Usuario não tem permissao para publicar um comentario");
        }else{
            System.out.println("Comentario " + comentario.getDescricao() + " publicado por " + usuario.getNome());
        }
    }
}
