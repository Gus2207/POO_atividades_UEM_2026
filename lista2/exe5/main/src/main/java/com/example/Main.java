package com.example;

public class Main {

    public static void main(String[] args) {
        ISBN isbn = new ISBN(156, "editora TAL");
        Livro livro = new Livro("Dom Quixote", isbn, "Livro de tal");

        livro.exibeDados();
    }
}
