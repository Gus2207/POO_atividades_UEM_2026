package com.example;

import java.util.ArrayList;
import java.util.List;

public class SistemaNoticias {
    private List<Noticia> noticias;

    public SistemaNoticias() {
        this.noticias = new ArrayList<>();
    }
    
    public void criarNoticia(String foto, String texto, String titulo, Usuario usuario){
        if(usuario.getNivelAcesso() != NivelAcesso.ADMIN){
            throw new IllegalAccessError("Erro: o usuario " + usuario.getNome() + " não tem permissao para criar uma noticia");
        }else{
            Noticia noticia = new Noticia(foto, texto, titulo);
            noticias.add(noticia);
            System.out.println("Noticia criada com sucesso por: " + usuario.getNome());
        }
    }

    public void visualizarNoticia(Usuario usuario){
        System.out.println("O usuario " + usuario.getNome() + " esta visualizando as noticias");
    }

    public List<Noticia> getNoticias() {
        return noticias;
    }

    public void setNoticias(List<Noticia> noticias) {
        this.noticias = noticias;
    }
}
