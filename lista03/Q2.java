package lista03;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


			System.out.println("Digite o 1º número");
			double n1 = sc.nextDouble();
			System.out.println();

			System.out.println("Digite o 2º número");
			double n2 = sc.nextDouble();
			System.out.println();

			System.out.println("Agora, escolha uma operação aritmética \r\n"
					+ "1. Retornar a soma entre dois números;\r\n" + "2. Retornar a subtração entre dois números;\r\n"
					+ "3. Retornar a multiplicação entre dois números;\r\n"
					+ "4. Retornar a divisão entre dois números;\n");
			int act = sc.nextInt();
			switch (act) {
			case 1:
				soma(n1, n2);
				break;
			case 2:
				subt(n1, n2);
				break;
			case 3:
				multi(n1, n2);
				break;
			case 4:
				div(n1, n2);
				break;
			}sc.close();
		

	}

	public static void soma(double n1, double n2) {
		System.out.println(n1 + n2 + "\n");
	}

	public static void subt(double n1, double n2) {
		System.out.println(n1 - n2 + "\n");
	}

	public static void multi(double n1, double n2) {
		System.out.println(n1 * n2 + "\n");
	}

	public static void div(double n1, double n2) {
		System.out.println(n1 / n2 + "\n");
	}

}
