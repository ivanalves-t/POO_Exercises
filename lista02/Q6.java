package lista02;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String v1[] = new String[5];
		String v2[] = new String[5];

		System.out.println("Pirmeiro vetor: ");
		System.out.println();
		for (int i = 0; i < v1.length; i++) {
			System.out.println("Digite o " + (i + 1) + " elemento: ");
			v1[i] = sc.nextLine();
		}
		System.out.println("Segundo vetor: ");
		System.out.println();
		for (int i = 0; i < v1.length; i++) {
			System.out.println("Digite o " + (i + 1) + " elemento: ");
			v2[i] = sc.nextLine();
		}
		if (Arrays.equals(v1, v2)) {
			System.out.println("Os vetores são iguais");
		} else {
			System.out.println("Os vetores não são iguais!");
		}

		sc.close();
	}
}
