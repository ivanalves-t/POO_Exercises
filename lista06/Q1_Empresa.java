package lista06;

import java.util.ArrayList;
import java.util.Scanner;

import lista06.entities.Funcionario;

public class Q1_Empresa {
	private ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

	public static void main(String[] args) {
		Q1_Empresa empresa = new Q1_Empresa();
		Scanner scanner = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("\n\n1. Cadastrar um funcionário");
			System.out.println("2. Exibir funcionários de alta renda");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				empresa.cadastroFuncionario(scanner);
				break;
			case 2:
				System.out.println("\nFuncionarios de alta renda:");
				for (Funcionario funcionario : empresa.funcionariosDeRendaAlta()) {
					System.out.printf("Nome: '%s', Salário: %.2f ", funcionario.getName(), funcionario.getWage());
				}
				break;
			case 0:
				System.out.println("Encerrando ...");
				break;
			}
		} while (opcao != 0);
		scanner.close();
	}

	public void cadastroFuncionario(Scanner scanner) {
		System.out.print("Nome do funcionário: ");
		String nome = scanner.nextLine();
		System.out.print("Salário do funcionário: ");
		double salario = scanner.nextDouble();
		Funcionario funcionarioContratado = new Funcionario(nome, salario);
		listaFuncionarios.add(funcionarioContratado);
	}

	public ArrayList<Funcionario> funcionariosDeRendaAlta() {
		ArrayList<Funcionario> altaRendaFuncionarios = new ArrayList<>();
		for (Funcionario funcionario : listaFuncionarios) {
			if (funcionario.getWage() > 5000)
				altaRendaFuncionarios.add(funcionario);
		}
		return altaRendaFuncionarios;
	}

}
