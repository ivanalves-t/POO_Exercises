package lista02;

import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma string: ");
		String string = sc.nextLine(), stringR = "";
		System.out.println();
		
		for (int i = string.length() -1; i >= 0; i--) {
			stringR += string.charAt(i);
		}
		System.out.printf("String invertida: %s", stringR);
		
		sc.close();
	}
}
