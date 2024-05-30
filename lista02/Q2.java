package lista02;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double vect[] = new double[10], avg = 0.0, current;

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite o " + (i + 1) + "° numero: ");
			vect[i] = sc.nextDouble();
			avg += vect[i];
		}
		for (int i = 0; i < vect.length; i++) {
			for (int j = i+1; j < vect.length; j++) {
				if (vect[i] > vect[j]) {
					current = vect[i];
					vect[i] = vect[j];
					vect[j] = current;
				}
			}
		}
		avg /= vect.length;
		System.out.println();
		System.out.println("Menor valor digitado: " + vect[0]);
		System.out.println("Maior valor digitado: " + vect[vect.length-1]);
		System.out.println("Média dos valores digitados: " + avg);
		sc.close();
	}

}
