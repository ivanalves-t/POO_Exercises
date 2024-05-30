package lista01;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		int a = sc.nextInt();
		System.out.print("\nAgora digite o segundo número: ");
		int b = sc.nextInt();
		System.out.println();
		System.out.println("Digite a operação aritmética desejada");
		char c = sc.next().charAt(0);

		switch (c) {
		case '+':
			System.out.print("Resultado = "+ (a + b));
			break;
		case '-':
			System.out.println("Resultado = "+ (a - b));
			break;
		case '*':
			System.out.println("Resultado = "+ (a * b));
			break;
		case '/':
			System.out.println("Resultado = "+ (a / b));
			break;
		default:
			System.out.println("DIGITE UM OPERADOR ARITMETICO VALIDO");
			break;
		}
		sc.close();
	}

}
