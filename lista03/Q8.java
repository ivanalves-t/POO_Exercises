package lista03;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nomes = new String[4];
		int[] idades = new int[4];
		for (int i = 0; i < 4; i++) {
			System.out.printf("Digite a idade da %dª pessoa \n", (i + 1));
			idades[i] = sc.nextInt();
			System.out.printf("Digite o nome da %dª pessoa \n", (i + 1));
			sc.nextLine();
			nomes[i] = sc.nextLine();

		}sc.close();
		older(idades, nomes);
		younger(idades, nomes);
		jovens18(idades);

	}

	public static void older(int[] listaInt, String[] listaStr) {
		int current;
		String[] tempStr = new String[1];
		for (int i = 0; i < listaInt.length; i++) {
			for (int j = i + 1; j < listaInt.length; j++) {
				if (listaInt[i] > listaInt[j]) {
					current = listaInt[i];
					listaInt[i] = listaInt[j];
					listaInt[j] = current;
					tempStr[0] = listaStr[i];
					listaStr[i] = listaStr[j];
					listaStr[j] = tempStr[0];
				}
			}
		}
		System.out.println(listaStr[listaStr.length - 1]);
	}

	public static void younger(int[] listaInt, String[] listaStr) {
		System.out.println(listaStr[0]);
	}

	public static void jovens18(int[] listaInt) {
		int count = 0;
		for (int i = 0; i < listaInt.length; i++) {
			if (listaInt[i] >= 18)
				count++;
		}
		System.out.println(count);
	}

}
