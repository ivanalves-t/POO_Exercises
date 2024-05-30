package lista02;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double n[] = new double[10], soma = 0;

		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextDouble();
		}
		for (int i = 0; i < n.length; i++) {
			soma += n[i];
		}
		System.out.println("SOMA = " + soma);
		sc.close();
	}

}
