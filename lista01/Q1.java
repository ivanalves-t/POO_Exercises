package lista01;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		int ANO = 2024;
		Scanner sc = new Scanner(System.in);
		int nasc = sc.nextInt();
		
		System.out.print("Voce tem "+(ANO - nasc)+" Anos");
		sc.close();
	}

}
