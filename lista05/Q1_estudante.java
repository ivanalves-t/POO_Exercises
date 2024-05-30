package lista05;

import java.util.Scanner;

import lista05.entities.Estudante;

public class Q1_estudante {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Estudante estudante = new Estudante();

		String act = "Inicio";

		while (!act.equals("0")) {

			switch (act) {
			case "1":
				Estudante.criarEstudante(estudante, sc);
				break;
			case "2":
				estudante.calcularMedia();
				break;
			case "3":
				System.out.printf("Matricula do(a) estudante '%s': %s", estudante.getNome(), estudante.getMatricula());
				break;
			case "4":
				System.out.printf("Endereco do(a) estudante '%s': %s", estudante.getNome(), estudante.getEndereco());
				break;
			}
			System.out.println("\n\nOlá, digite um número:\n\r" + "1. Criar um Estudante\r\n"
					+ "2. Calcular Média (Se o Aluno foi Aprovado, informe ao usuário)\r\n"
					+ "3. Obter número de matricula\r\n" + "4. Obter Endereço\r\n" + "0. Sair\n");

			act = sc.nextLine();
		}
	}

}
