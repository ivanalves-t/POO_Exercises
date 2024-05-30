package lista01;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double media = (x+y+z+a+b)/5;
		System.out.printf("A média das alturas vale %.2f" , media);
		sc.close();
	}
}
