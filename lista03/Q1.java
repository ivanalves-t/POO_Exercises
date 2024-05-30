package lista03;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num = sc.nextInt();
		sc.close();
		System.out.println(evenOrOdd(num));
		}
	public static String evenOrOdd (int num) {
		if (num %2 == 0) {
			return "É PAR!"; 
		}else {
			return "É ÍMPAR";
		}
	}
}
