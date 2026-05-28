package com.example;

public class Main {

    public static void main(String[] args) {

        LivroBiblioteca livro1 = new LivroBiblioteca();
        livro1.setTitulo("O Senhor dos Anéis");
        livro1.setAutor("J.R.R. Tolkien");
        livro1.setCodigo(1);
        livro1.setdisponivel(false);

        LivroBiblioteca livro2 = new LivroBiblioteca();
        livro2.setTitulo("Dom Casmurro");
        livro2.setAutor("Machado de Assis");
        livro2.setCodigo(2);
        livro2.setdisponivel(false);

        LivroBiblioteca livro3 = new LivroBiblioteca();
        livro3.setTitulo("Clean Code");
        livro3.setAutor("Robert C. Martin");
        livro3.setCodigo(3);
        livro3.setdisponivel(false);

        livro1.emprestar();
        livro2.emprestar();
        livro2.devolverLivro();
        livro3.emprestar();

        livro1.exibirInformacoes();

        livro2.exibirInformacoes();

        livro3.exibirInformacoes();
    }
}
