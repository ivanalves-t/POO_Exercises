package lista02;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma string: ");
		String string = sc.nextLine();
		int letters = 0;

		for (int i = 0; i < string.length(); i++) {
			char charac = string.charAt(i);
			if (Character.isLetter(charac)) {
				letters++;
			}
		}
		System.out.println();
		System.out.printf("A string tem %d letras", letters);
		sc.close();
	}
}
