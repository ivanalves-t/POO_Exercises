package lista01;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double vetor[] = new double[5];
		double peso = 0, altura = 0;
		int abaixo = 0, ideal = 0, acima = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o peso da pessoa " + (i+1));
			peso = sc.nextDouble();
			System.out.println();
			System.out.println("Agora digite a altura da pessoa " + (i+1));
			altura = sc.nextDouble();
			System.out.println();
			vetor[i] = peso / (altura * altura);
		}

		for (int i = 0; i < 5; i++) {
			if (vetor[i] < 18.5) {
				abaixo += vetor[i];
			} else if (vetor[i] >= 18.5 && vetor[i] < 25) {
				ideal += 1;
			} else {
				acima += 1;
			}
		}
		System.out.println("Número de pessoas que estão abaixo do peso (IMC < 18,5): " + abaixo);
		System.out.println("Número de pessoas que estão dentro do peso ideal (IMC >= 18,5 e IMC < 25): " + ideal);
		System.out.println("Número de pessoas que estão acima do peso (IMC < 18,5): " + acima);
		sc.close();
	}
}