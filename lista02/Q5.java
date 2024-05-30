package lista02;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos nomes você deseja inserir no array? ");
		int N = sc.nextInt();

		String names[] = new String[N];
		sc.nextLine();
		for (int i = 0; i < names.length; i++) {
			System.out.println("Digite o nome do " + (i + 1) + "º elemento: ");
			names[i] = sc.nextLine();
		}
		System.out.println("Qual nome você deseja consultar? ");
		String ver = sc.nextLine();
		System.out.println();
		if (Arrays.asList(names).contains(ver)) {
			System.out.printf("O nome '%s' está contido no array!", ver);
		} else {
			System.out.printf("O nome '%s' não está contido no array!", ver);
		}

		sc.close();
	}

}
