package lista03;

import java.util.Scanner;

public class Q5 {
	public static double retangulo_area(double b, double h) {
		return b * h;
	}

	public static double retangulo_per(double b, double h) {
		return b * 2 + h * 2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da base: ");
		double base = sc.nextDouble();
		System.out.println("Digite o valor da altura: ");
		double heigth = sc.nextDouble();
		System.out.println();
		System.out.println(
				"Digite:\r\n" + "1 : Calcular a área do retângulo\r\n" + "2 : Calcular o perímetro do retângulo");
		int act = sc.nextInt();
		System.out.println();

		switch (act) {
		case 1 -> System.out.println("Área do retângulo " + retangulo_area(base, heigth));
		case 2 -> System.out.println("Perímetro do retângulo " + retangulo_per(base, heigth));
		default -> System.out.println("Você sabe ler?");
		}
		sc.close();
	}
}
