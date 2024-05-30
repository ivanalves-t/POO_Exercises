package lista03;

import java.util.Scanner;

public class Q6 {
	public static double f_to_c (double tempF) {
		return (tempF - 32)/1.8;
	}
	public static double k_to_c (double tempK) {
		return tempK - 273;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("OPÇÕES PARA O USUÁRIO:\r\n"
				+ "1. Transformar de Fahrenheit para Celsius\r\n"
				+ "2. Transformar de Kelvin para Celsius");
		int act = sc.nextInt();
		System.out.println();
		System.out.print("Agora digite o valor da temperatura: ");
		double temp = sc.nextDouble();
		
		switch (act) {
		case 1 -> temp = f_to_c(temp);
		case 2 -> temp = k_to_c(temp);
		}
		System.out.println();
		System.out.printf("Temperatura convertida: %.2f", temp);
		
		sc.close();
	}

}
