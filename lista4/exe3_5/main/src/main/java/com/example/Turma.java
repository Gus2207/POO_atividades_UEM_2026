package com.example;
import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int quantidadeAlunos;
    private String curso;
    private List<Aluno> alunos;


    public Turma(String curso) {
        this.alunos = new ArrayList<>();
        this.curso = curso;
        this.quantidadeAlunos = 0;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void adicionarAlunos(Aluno aluno){
        alunos.add(aluno);
        this.quantidadeAlunos += 1;
    }
}
