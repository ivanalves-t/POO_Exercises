package lista04;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Q3_IMC {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		calcularIMC(sc);
	}

	public static void calcularIMC(Scanner sc) {
		System.out.println("Digite a quantidade de pessoas a calcular o IMC");
		int qtd = sc.nextInt();

		ArrayList<String> pessoasGordas = new ArrayList<>();
		int magros = 0, gordinhos = 0, ideais = 0;
		String[] pessoas = new String[qtd];
		double[] imcS = new double[qtd];

		for (int i = 0; i < qtd; i++) {
			System.out.printf("\nDigite o nome da %dº pessoa: ", (i + 1));
			sc.nextLine();
			pessoas[i] = sc.nextLine();
			System.out.printf("\nDigite o peso do(a) %s: ", pessoas[i]);
			double peso = sc.nextDouble();
			System.out.printf("\nDigite a altura do(a) %s: ", pessoas[i]);
			double altura = sc.nextDouble();

			double imc = peso / (altura * altura);
			imcS[i] = imc;
		}
		for (int k = 0; k < qtd; k++) {
			if (imcS[k] >= 25) {
				pessoasGordas.add(pessoas[k]);
				gordinhos++;
			}
			if (imcS[k] > 18.5 && imcS[k] < 25)
				ideais++;
			if (imcS[k] < 18.5)
				magros++;
		}
		if (pessoasGordas.size() != 0)
			System.out.printf("Nomes das pessoas acima do peso: %s", pessoasGordas);
		System.out.printf("\nNúmero de pessoas que estão abaixo do peso (IMC < 18,5): %d\r\n"
				+ "O Número de pessoas que estão dentro do peso ideal (IMC > 18,5 e IMC < 25): %d\r\n"
				+ "O Número de pessoas que estão acima do peso (IMC > = 25): %d", magros, ideais, gordinhos);
	}
}
