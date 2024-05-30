package lista05;

import java.util.Scanner;

import lista05.entities.Retangulo;

public class Q2_retangulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = null;
		String act = "Inicio";

		while (!act.equals("0")) {

			switch (act) {
			case "1":
				retangulo = criarRetangulo(sc);
				break;
			case "2":
				double area = retangulo.calcularArea();
				System.out.println("\n" + area);
				break;
			case "3":
				double perimetro = retangulo.calcularPerimetro();
				System.out.println("\n" + perimetro);
				break;
			}
			System.out.println("\nOlá, você está sendo monitorado. Digite um número:\n\r"
					+ "1. Criar um retângulo (Digitar valor de B e H)\r\n"
					+ "2. Calcular Área\r\n"
					+ "3. Calcular Perímetro\r\n"
					+ "0. Sair");

			act = sc.nextLine();
		}
	}

	public static Retangulo criarRetangulo(Scanner sc) {
		System.out.println("Digite o valor da base: ");
		double base = sc.nextDouble();
		System.out.println("Digite o valor da altuar: ");
		double height = sc.nextDouble();
		Retangulo Novoretangulo = new Retangulo(base, height);
		sc.nextLine();
		return Novoretangulo;
	}
}
