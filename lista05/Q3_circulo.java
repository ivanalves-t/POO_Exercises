package lista05;

import java.util.Scanner;

import lista05.entities.Circulo;

public class Q3_circulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circulo crlo = null;
		String act = "Start";
		
		while (!act.equals("0")) {

			switch (act) {
			case "1":
				crlo = criarCirculo(sc);
				break;
			case "2":
				double area = crlo.calcularAreaCir();
				System.out.printf("\n%.2f",area);
				break;
			case "3":
				double perimetro = crlo.calcularPerimetroCir();
				System.out.printf("\n%.2f",perimetro);
				break;
			}
			System.out.println("\n\nOlá, você está sendo monitorado. Digite um número:\n\r"
					+ "1. Criar um círculo (Digitar valor de r)\r\n"
					+ "2. Calcular Área\r\n"
					+ "3. Calcular Perímetro\r\n"
					+ "0. Sair");

			act = sc.nextLine();
		}
	}
	public static Circulo criarCirculo(Scanner sc) {
		System.out.println("Digite o valor do raio do círculo: ");
		Circulo novoCirculo = new Circulo (sc.nextDouble());
		sc.nextLine();
		return novoCirculo;
	}
}
