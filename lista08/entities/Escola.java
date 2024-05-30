package lista08.entities;

import java.util.ArrayList;
import java.util.Scanner;

import lista08.Turma;

public class Escola {
	public static void main(String[] args) {
		ArrayList<Turma> turmas = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		String act = null;

		do {
			System.out.println("\n1. Cadastrar turma (O sistema deve permitir armazenar 10 turmas)\r\n"
					+ "2. Cadastrar estudante (É necessário buscar uma turma pelo código Antes de\r\n"
					+ "adicionar um estudante)\r\n" + "3. Listar turmas (Exibir todas as turmas cadastradas)\r\n"
					+ "4. Listar estudantes por turma (Buscar turma pelo código)\r\n"
					+ "5. Consultar média de um estudante (Buscar pelo código da turma e número\r\n"
					+ "de matrícula do estudante)\r\n"
					+ "6. Alterar notas de um estudante (Buscar pelo código da turma e número de\r\n"
					+ "matrícula do estudante)\r\n"
					+ "7. Exibir média dos estudantes de uma turma (Buscar pelo código da turma e\r\n"
					+ "exibir a média dos estudantes da referida turma)\r\n" + "0. Sair");
			System.out.println("Digite uma opção:\n");
			act = sc.next();
			sc.nextLine();

			switch (act) {
			case "1":
				if (turmas.size() == 10) {
					System.out.println("Limite de turmas atingido!");
					break;
				}
				System.out.println("Digite o código da nova turma");
				var codigo = sc.nextLine();
				for (Turma turma : turmas) {
					if (turma.getCodigo().equals(codigo)) {
						System.out.println("Turma já cadastrada!");
						break;
					}
				}
				Turma novaTurma = new Turma(codigo);
				turmas.add(novaTurma);
				break;
			case"2":
				cadastrarEstudante(turmas, sc);
				break;
			case "3":
				if (turmas.size() != 0) {
					System.out.println("Código das turmas cadastradas:");
					for (Turma turma : turmas) {
						System.out.println("'" + turma.getCodigo() + "'");
					}
					break;
				}
				System.out.println("Sem turmas no sistema, cadastre pelo menos uma turma!");
				break;
			case "4":
				System.out.println("Digite o código da turma");
				String cod = sc.nextLine();
				String estudantes = estudantesDaTurma(turmas, cod);
				if (estudantes.length() != 0) {
				System.out.println(estudantes);
				break;
				}
				System.out.println("Turma vazia!");
				break;
			case "5":
				System.out.println("Digite o código da turma do estudante");
				var codTurma = sc.nextLine();
				System.out.println("Digite a matricula do estudante");
				var matricula = sc.nextLine();
				Double media = calcularMediaIndividual(turmas, codTurma, matricula);
				if (media.equals(Double.NaN)) {
					System.out.println("Estudante não cadastrado!");
					break;
				}
				System.out.println("Media do aluno: " + media);
				break;
			case "6":
				System.out.println("Digite o codigo da turma");
				String codTurma1 = sc.nextLine();
				System.out.println("Digite a matricula do aluno");
				String matN = sc.nextLine();
				alterarNotasEstudante(turmas, codTurma1, matN, sc);
				break;
			case "7":
				System.out.println("Digite o codigo da turma para exibir a lista das medias dos estudantes");
				String codd = sc.nextLine();
				String medias = exibirMediaEstudantes(turmas, codd);
				if (medias.length() == 0) {
					System.out.println("Turma inexistente");
					break;
				}
				System.out.println('['+medias+']');
				break;
			default :
					System.out.println("Digite um código válido!\n\n");
					break;
			case "0":
				System.out.println("Encerrando ...");
				break;
			}

		} while (!act.equals("0"));
		sc.close();

	}

	public static void cadastrarEstudante(ArrayList<Turma> turmas, Scanner sc) {
		System.out.println("Digite o codigo da turma do novo estudante");
		String cod = sc.nextLine();
		for (Turma turma : turmas) {
			if (turma.getCodigo().equals(cod)) {
				double[] notas = new double[4];
				System.out.println("Digite a matricula do estudante");
				var matricula = sc.nextLine();
				System.out.println("Digite o nome do estudante");
				var nome = sc.nextLine();

				for (int i = 0; i < 4; i++) {
					System.out.printf("Digite a %dª nota do aluno\n", (i + 1));
					notas[i] = sc.nextDouble();
				}

				Estudante novoEstudante = new Estudante(matricula, nome, notas);

				turma.adicionar(novoEstudante);
				return;

			}
		}
		System.out.println("Turma inexistente!");
		return;
	}

	public static String estudantesDaTurma(ArrayList<Turma> turmas, String codigo) {
		String matriculasStr = null;
		ArrayList<String> matriculas = new ArrayList<>();
		for (Turma turma : turmas) {
			if (turma.getCodigo().equals(codigo)) {
				for (Estudante estudante : turma.getEstudante()) {
					matriculas.add(estudante.getMatricula());
				}
			}
		}
		matriculasStr = String.join(", ", matriculas);

		return matriculasStr;
	}

	public static Double calcularMediaIndividual(ArrayList<Turma> turmas, String cod, String matricula) {
		Double media = Double.NaN;
		for (Turma turma : turmas) {
			if (turma.getCodigo().equals(cod)) {
				for (Estudante estudante : turma.getEstudante()) {
					if (estudante.getMatricula().equals(matricula)) {
						media = (Double) estudante.mediaCalc();
						return media;
					}
				}
			}
		}
		return media;
	}

	public static void alterarNotasEstudante(ArrayList<Turma> turmas, String cod, String matricula, Scanner sc) {
		for (Turma turma : turmas) {
			if (turma.getCodigo().equals(cod)) {
				for (Estudante estudante : turma.getEstudante()) {
					if (estudante.getMatricula().equals(matricula)) {
						double[] novasNotas = new double[4];

						for (int i = 0; i < 4; i++) {
							System.out.printf("Digite a nova %dª nota do estudante", (i + 1));
							novasNotas[i] = sc.nextDouble();
						}
						estudante.setNotas(novasNotas);
						return;
					}
				}
			}
		}
		System.out.println("Aluno não cadastrado!");
	}

	public static String exibirMediaEstudantes(ArrayList<Turma> turmas, String codigo) {
		ArrayList<String> notas = new ArrayList<String>();
		String notasStr = null;
		for (Turma turma : turmas) {
			if (turma.getCodigo().equals(codigo)) {
				for (Estudante estudante : turma.getEstudante()) {
					notas.add(Double.toString(estudante.mediaCalc()));
				}
			}
		}

		notasStr = String.join(", ", notas);
		return notasStr;
	}

}
