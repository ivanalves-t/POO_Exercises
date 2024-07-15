package classeAbstrataInterface.entities;

import java.util.Arrays;

public class Disciplina {

    private Aluno[] alunos;
    private int quantidadeAlunos;

    public Disciplina(int capacidade) {
        this.alunos = new Aluno[capacidade];
        this.quantidadeAlunos = 0;
    }

    public void addAluno(Aluno aluno) {
        if (quantidadeAlunos < alunos.length) {
            alunos[quantidadeAlunos++] = aluno;
        } else {
            System.out.println("A turma está cheia!");
        }
    }

    public void removeAluno(String nomeAluno) {
        for (int i = 0; i < quantidadeAlunos; i++) {
            if (alunos[i].getNome().equals(nomeAluno)) {
                alunos[i] = alunos[--quantidadeAlunos]; // Substitui o aluno removido pelo último aluno
                alunos[quantidadeAlunos] = null; // Remove a referência ao último aluno
                break;
            }
        }
    }

    public void mostraAlunos() {
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println(alunos[i]);
        }
        System.out.println();
    }

    public void ordena() {
        Arrays.sort(alunos, 0, quantidadeAlunos); // Ordena apenas os elementos não nulos
    }
}
