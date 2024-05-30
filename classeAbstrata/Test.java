package classeAbstrata;

import java.util.Scanner;

import classeAbstrata.entities.Circulo;
import classeAbstrata.entities.Quadrado;
import classeAbstrata.entities.Quadrilatero;
import classeAbstrata.entities.Retangulo;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Quadrilatero[] lista = new Quadrilatero[10];
		int l = 0;
		int n = 6;

		do {
			if (lista[9]!= null)
				System.out.println("\n-=-=-=-=-=-=Lista cheia-=-=-=-=-=-\n");
			System.out.println("\n1. Cadastrar Retângulo\r\n" + "2. Cadastrar Circulo\r\n" + "3. Cadastrar Quadrado\r\n"
					+ "4. Mostrar o valor de todas as área\r\n" + "5. Mostrar o valor de todas os perímetros"
					+ "\n0. Encerrar programa");
			n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.print("\nDigite o valor da base: ");
				float base = sc.nextFloat();
				System.out.print("\nDigite o valor da altura: ");
				float altura = sc.nextFloat();
				if (l <= 9) {
					lista[l] = new Retangulo(base, altura);
					l++;
				}
				break;

			case 2:
				System.out.print("\nDigite o valor do raio: ");
				float raio = sc.nextFloat();
				if (l <= 9) {
					lista[l] = new Circulo(raio);
					l++;
				}
				break;

			case 3:
				System.out.print("\nDigite o valor do lado do quadrado: ");
				float lado = sc.nextFloat();
				if (l <= 9) {
					lista[l] = new Quadrado(lado);
					l++;
				}
				break;

			case 4:
				System.out.println("\nVALOR DE TODAS AS ÁREAS");

				for (Quadrilatero q : lista) {
					if (q != null) {
						System.out.printf("'%s', valor: %.2f\n", q.getClass().getSimpleName(), q.calcularArea());
					}
				}
				break;

			case 5:
				System.out.println("\nVALOR DE TODAS OS PERÍMETROS");

				for (Quadrilatero q : lista) {
					if (q != null) {
						System.out.printf("'%s', valor: %.2f\n", q.getClass().getSimpleName(), q.calcularPerimetro());
					}
				}
				break;

			}
		} while (n != 0);
		sc.close();
	}
}
