package classeAbstrataInterface.application;

import classeAbstrataInterface.entities.Aluno;
import classeAbstrataInterface.entities.Disciplina;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a capacidade da turma:");
        int capacidade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        Disciplina disciplina = new Disciplina(capacidade);

        System.out.println("Informe os alunos (nome e nota). Digite 'sair' para finalizar:");

        while (true) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Nota: ");
            double nota = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha

            Aluno aluno = new Aluno(nome, nota);
            disciplina.addAluno(aluno);
        }

        scanner.close();

        System.out.println("\nAlunos antes da ordenação:");
        disciplina.mostraAlunos();

        disciplina.ordena();

        System.out.println("Alunos após a ordenação:");
        disciplina.mostraAlunos();
    }
}
