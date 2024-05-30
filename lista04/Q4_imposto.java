package lista04;

import java.util.ArrayList;
import java.util.Scanner;

public class Q4_imposto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Funcionario> lista = new ArrayList<>();
		String act = "Start";

		do {
			System.out.println("\n\nOlá, digite um número para:\n\r" + "1. Cadastrar funcionário (nome e salário)\r\n"
					+ "2. Calcular imposto (procurar funcionário pelo nome)\r\n"
					+ "0. Sair");
			act = sc.nextLine();
			switch (act) {
			case "1" -> salarioImposto(lista, sc);
			case "2" -> calcularImposto(lista, sc);
			default -> System.out.println("Digite um número válido");
			}
		}while (!act.equals("0"));
	}

	public static void salarioImposto(ArrayList<Funcionario> lista, Scanner sc) {
		System.out.println("Digite o nome do funcionário: ");
		String nome = sc.nextLine();
		for (Funcionario funcionario : lista) {
			if (funcionario.getName().equals(nome)) {
				System.out.println("Funcionário já registrado!");
				return;
			}
		}
		System.out.printf("Digite o salário do(a) %s: ", nome);
		double salario = sc.nextDouble();

		Funcionario funcionario = new Funcionario(nome, salario);
		sc.nextLine();
		lista.add(funcionario);
	}

	public static void calcularImposto(ArrayList<Funcionario> lista, Scanner sc) {
		System.out.println("Digite o nome do funcionário para cálculo do imposto");
		String nome = sc.nextLine();
		double imposto = 0;

		for (Funcionario funcionario : lista) {
		    if (!nome.equals(funcionario.getName())) {
		        System.out.println("Funcionário não cadastrado\n");
		        return;
		    }
		
			if (funcionario.getWage() <= 2000)
				imposto = 0;
			else {
				if (funcionario.getWage() < 3500) {
					imposto = (funcionario.getWage() - 2000) * 0.15;
				} else {
					if (funcionario.getWage() < 5000) {
						imposto = 1500 * 0.15 + (funcionario.getWage() - 3500) * 0.22;
					} else {
						imposto = 1500 * 0.15 + 1500 * 0.22 + (funcionario.getWage() - 5000) * 0.30;
					}
				}
			}
		} System.out.printf("Imposto de renda do funcionário(a) %s: R$ %.2f", nome, imposto);
	}
}