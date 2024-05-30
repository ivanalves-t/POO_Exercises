package lista01;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma idade: ");
		double num = sc.nextInt(), cont = 0, res = 0;
		
		while (num != 0) {
			res += num;
			cont ++;
			System.out.print("Digite outra idade: ");
			num = sc.nextInt();
		}
		System.out.print("Média das idades = "+(res/cont));
		sc.close();
	}

}
