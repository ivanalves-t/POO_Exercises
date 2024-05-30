package lista03;

import java.util.Scanner;

public class Q4 {

	public static double imposto(double num) {
		double imposto;
		if (num <= 2000) {
			imposto = 0;
		} else {
			if (num <= 3500) {
				imposto = num * 0.15;
			} else {
				if (num <= 5000) {
					imposto = num * 0.22;
				} else {
					imposto = num * 0.30;
				}
			}
		}return imposto;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu salário: ");
		double sal = sc.nextDouble();
		System.out.printf("Você irá pagar R$ %.2f de imposto", imposto(sal));
		sc.close();
	}
}
