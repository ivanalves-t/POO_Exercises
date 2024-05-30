package lista03;

import java.util.Scanner;

public class Q7 {

	public static double media_vect(double vetor[]) {
		double media = 0;

		for (double i : vetor) {
			media += i;
		}
		media /= vetor.length;
		return media;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tamanho do seu vetor: ");
		int len = sc.nextInt();

		double vect[] = new double[len];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("\nDigite o valor do " + (i + 1) + "º elemento: ");
			vect[i] = sc.nextDouble();

		}
		double media = media_vect(vect);
		System.out.println("\nA média dos valores digitados vale: " + media);

		sc.close();
	}

}
