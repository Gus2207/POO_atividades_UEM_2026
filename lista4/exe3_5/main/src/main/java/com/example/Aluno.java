package com.example;

public class Aluno {
    private String nome;
    private int registroMatricula;
    private StatusAluno status;
    private String curso;
    private int nota;

    public Aluno(String curso, String nome, int registroMatricula, StatusAluno status) {
        this.curso = curso;
        this.nome = nome;
        this.registroMatricula = registroMatricula;
        this.status = status;
        this.nota = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRegistroMatricula() {
        return registroMatricula;
    }

    public void setRegistroMatricula(int registroMatricula) {
        this.registroMatricula = registroMatricula;
    }

    public StatusAluno getStatus() {
        return status;
    }

    public void setStatus(StatusAluno status) {
        this.status = status;
    } 

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
