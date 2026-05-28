package com.example;
import java.util.Scanner;

public class SistemaNotas {

    Scanner scan = new Scanner(System.in);
    
    public void cadastrarNotas(Turma turma, Professor professor){
        if(!turma.getCurso().toUpperCase().equals(professor.getCurso().toUpperCase())){
            throw new IllegalArgumentException("Erro: Professor só pode cadastrar as notas dos alunos do curso de: " + professor.getCurso());
        }else{
            for (Aluno aluno : turma.getAlunos()) {
                System.out.println("Digite a nota do aluno: " + aluno.getNome());
                int nota = scan.nextInt();
                aluno.setNota(nota);
            }
        }
    }
}
