package lista06;

import java.util.ArrayList;
import java.util.Scanner;

import lista06.entities.Estudante;

public class Q2_Escola {
	private ArrayList<Estudante> listaEstudantes = new ArrayList<>();
	private Estudante estudanteBase = null;

	public static void main(String[] args) {
		Q2_Escola escola = new Q2_Escola ();
		Scanner scanner = new Scanner(System.in);
		String opcao;

		do {
			System.out.println("\n\n1. Cadastrar um estudante");
			System.out.println("2. Obter o nome do estudante (procurar pela matricula)");
			System.out.println("3. Calcular a média (informar se o estudante foi aprovado ou não)");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.next();
			scanner.nextLine();

			switch (opcao) {
			case "1":
				escola.cadastroEstudante(scanner);
				break;
			case "2":
				escola.nomeEstudanteCadastrado(scanner);
				break;
			case "3":
				Double media = escola.calcularMedia();
				if (!Double.isNaN(media)) {
					System.out.println("Media:" + media);
					if (media <=7 ) {
						System.out.println("REPROVADO!");
						break;
					}System.out.println("APROVADO!");
					break;
				}
				System.out.println("CADASTRE UM ESTUDANTE ANTES!");
				break;
			case "0":
				System.out.println("Encerrando ...");
				break;
			}
		} while (!opcao.equals("0"));
		scanner.close();
	}

	public void cadastroEstudante(Scanner cadastro) {
		System.out.println("Digite o nome do estudante ");
		String nome = cadastro.nextLine();
		System.out.println("Digite a matricula do estudante ");
		String matricula = cadastro.nextLine();
		for (Estudante estudanteBusca : listaEstudantes) {
			if (estudanteBusca.getNome().equals(nome) && estudanteBusca.getMatricula().equals(matricula))
				System.out.println("Estudante já cadastrado!");
				return;
		}
		double notas[] = new double[2];
		for (int i = 0; i < 2; i++) {
			System.out.printf("Digite a %dª nota do estudante ", (i + 1));
			notas[i] = cadastro.nextDouble();
		}
		Estudante novoEstudante = new Estudante(nome, matricula, notas);
		estudanteBase = novoEstudante;
		listaEstudantes.add(novoEstudante);
	}

	public void nomeEstudanteCadastrado(Scanner consulta) {
		System.out.println("Digite o número da matrícula para consulta");
		String matricula = consulta.nextLine();
		for (Estudante estudanteBusca : listaEstudantes) {
			if (!estudanteBusca.getMatricula().equals(matricula)) {
				System.out.println("Matricula nao cadastrada!");
				return;
			}
			System.out.printf("O estudante portador da matrícula '%s' se chama '%s'", matricula,
					estudanteBusca.getNome());
		}
	}

	public double calcularMedia() {
		Double media = Double.NaN;
		if (this.estudanteBase == null) {
			return media;
		} else {
			for (double nota : estudanteBase.getNotas()) {
				media += nota;
			}media /= 2;
			return media;
		}

	}
}

