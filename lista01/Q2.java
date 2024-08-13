package lista01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double media = 0;
		boolean valid = false;

		while (!valid) {
			try {
				double x = sc.nextDouble();
				double y = sc.nextDouble();
				double z = sc.nextDouble();
				double a = sc.nextDouble();
				double b = sc.nextDouble();
				media = (x + y + z + a + b) / 5;
			} catch (InputMismatchException ime) {
				System.out.println("Digite um valor numérico válido!");
			}
		}
		System.out.printf("A média das alturas vale %.2f", media);
		sc.close();
	}
}
