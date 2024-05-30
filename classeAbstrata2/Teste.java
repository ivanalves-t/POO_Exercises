package classeAbstrata2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classeAbstrata2.entities.Homem;
import classeAbstrata2.entities.Mulher;
import classeAbstrata2.entities.PessoaIMC;

public class Teste {

	public static void main(String[] args) {
		List<PessoaIMC> pessoas = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		Integer n = null;
		do {
			System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=" + "\n1. Cadastra Homem\r\n"
					+ "2. Cadastrar Mulher\r\n" + "3. Consultar IMC (Busca pelo nome)\r\n" + "4. Listar Homens\r\n"
					+ "5. Listar Mulheres\r\n" + "6. Listar todos os IMCs dos Homens\r\n"
					+ "7. Listas todos os IMCs\r\n" + "0. Sair\n" + "-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=\n");
			n = sc.nextInt();

			switch (n) {
			case 1:
				sc.nextLine();
				System.out.print("Digite o nome do homem: ");
				String nome = sc.nextLine();
				System.out.printf("Digite a data de nascimento de %s: ", nome);
				LocalDate dNascimento = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				System.out.printf("Digite o peso de %s: ", nome);
				double peso = sc.nextDouble();
				System.out.printf("Digite a altura de %s: ", nome);
				double altura = sc.nextDouble();

				pessoas.add(new Homem(nome, dNascimento, peso, altura));
				break;

			case 2:
				sc.nextLine();
				System.out.print("\nDigite o nome da mulher: ");
				String nome1 = sc.nextLine();
				System.out.printf("Digite a data de nascimento de %s: ", nome1);
				LocalDate dNascimento1 = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				System.out.printf("Digite o peso de %s: ", nome1);
				double peso1 = sc.nextDouble();
				System.out.printf("Digite a altura de %s: ", nome1);
				double altura1 = sc.nextDouble();

				pessoas.add(new Mulher(nome1, dNascimento1, peso1, altura1));
				break;

			case 3:
				sc.nextLine();
				System.out.print("\nDigite o nome da pessoa para consulta de IMC: ");
				String nomeC = sc.nextLine();

				for (PessoaIMC p : pessoas) {
					if (p.getName().equals(nomeC))
						System.out.printf("%s\nIMC: %.1f %s\n", p, p.calcularIMC(), p.resultIMC());
				}
				break;

			case 4:
				System.out.println("Homens: ");
				for (PessoaIMC p : pessoas) {
					if (p instanceof Homem) {
						System.out.println(p + "\n");
					}
				}
				break;
			case 5:
				System.out.println("Mulheres: ");
				for (PessoaIMC p : pessoas) {
					if (p instanceof Mulher) {
						System.out.println(p + "\n");
					}
				}
				break;

			case 6:
				System.out.println("IMC's dos homens: ");
				for (PessoaIMC p : pessoas) {
					if (p instanceof Homem) {
						System.out.printf("%s\nIMC: %.1f %s\n", p, p.calcularIMC(), p.resultIMC());
					}
				}
				break;
			case 7:
				System.out.println("Todos os IMC's: ");
				for (PessoaIMC p : pessoas) {
					System.out.printf("%s\nIMC: %.1f %s\n", p, p.calcularIMC(), p.resultIMC());
				}
				break;
			}
		} while (n != 0);

		sc.close();
	}
}
