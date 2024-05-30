package lista06;

import java.util.ArrayList;
import java.util.Scanner;

import lista06.entities.Pessoa;

public class Q3_testeIMC {
	private ArrayList<Pessoa> listaPessoas = new ArrayList<>();

	public static void main(String[] args) {
		Q3_testeIMC IMC = new Q3_testeIMC();
		Scanner scanner = new Scanner(System.in);
		String opcao;

		do {
			System.out.println("\n\n1. Cadastrar uma pessoa");
			System.out.println("2. Mostrar as pessoas que estão abaixo do peso (IMC < 18,5)");
			System.out.println("3. Mostrar as pessoas que estão dentro do peso ideal (IMC > 18,5 e IMC <25)");
			System.out.println("4. Mostrar as pessoas que estão acima do peso (IMC > = 25)");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.next();
			scanner.nextLine();

			switch (opcao) {
			case "1":
				IMC.cadastrarPessoa(scanner);
				break;
			case "2":
				IMC.abaixoDoPeso();
				break;
			case "3":
				IMC.pesoIdeal();
				break;
			case "4":
				IMC.sobrePeso();
				break;
			case "0":
				System.out.println("Encerrando ...");
				break;
			default:
				System.out.println("Erro, digite uma opção válida");
				break;
			}
		} while (!opcao.equals("0"));
		scanner.close();
	}

	public void cadastrarPessoa(Scanner sc) {
		System.out.println("Digite o nome da pessoa");
		String nome = sc.nextLine();
		System.out.printf("Digite o peso de %s\n", nome);
		double peso = sc.nextDouble();
		System.out.printf("Digite a altura de %s\n", nome);
		double altura = sc.nextDouble();
		Pessoa pessoaCadastrada = new Pessoa(nome, peso, altura);
		listaPessoas.add(pessoaCadastrada);
	}

	public void abaixoDoPeso() {
		if (listaPessoas.size() == 0) {
			System.out.println("Cadastre alguma pessoa!");
			return;
		}
		ArrayList<String> magros = new ArrayList<>();
		for (Pessoa pessoa : listaPessoas) {
			if (pessoa.getIMC() < 18.5)
				magros.add(pessoa.getNome());
		}
		System.out.println("Pessoas abaixo do peso:");
		System.out.println(magros);
	}

	public void pesoIdeal() {
		if (listaPessoas.size() == 0) {
			System.out.println("Cadastre alguma pessoa!");
			return;
		}
		ArrayList<String> pesoIdeal = new ArrayList<>();
		for (Pessoa pessoa : listaPessoas) {
			if (pessoa.getIMC() > 18.5 && pessoa.getIMC() < 25)
				pesoIdeal.add(pessoa.getNome());
		}
		System.out.println("Pessoas com peso ideal:");
		System.out.println(pesoIdeal);

	}

	public void sobrePeso() {
		if (listaPessoas.size() == 0) {
			System.out.println("Cadastre alguma pessoa!");
			return;
		}
		ArrayList<String> gordos = new ArrayList<>();
		for (Pessoa pessoa : listaPessoas) {
			if (pessoa.getIMC() >= 25)
				gordos.add(pessoa.getNome());
		}
		System.out.println("Pessoas gordas:");
		System.out.println(gordos);

	}
}
