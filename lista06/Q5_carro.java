package lista06;

import java.util.Scanner;

import lista06.entities.Carro;

public class Q5_carro {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int act = 0;

		System.out.println("Olá");
		System.out.println("Voce precisa abastecer seu novo carro!");
		System.out.println("Digite a quantidade de combustivel inicial");
		double gasQtd = scanner.nextDouble();
		System.out.println("Digite a eficiência do carro (quantos km's ele faz por litro)");
		double eficiencia = scanner.nextDouble();
		System.out.println();

		Carro car = new Carro(gasQtd, eficiencia);

		do {
			System.out.println("\n1. Andar");
			System.out.println("2. Reabastecer");
			System.out.println("3. Verificar a quantidade de combustível restante");
			System.out.println("4. Encerrar a viagem");
			System.out.println("Escolha uma opção:");
			act = scanner.nextInt();
			scanner.nextLine();
			
			switch (act) {
			case 1:
				System.out.println("Digite a distancia (em km) que você deseja percorrer");
				car.andar(scanner.nextDouble());
				scanner.nextLine();
				break;
			case 2:
				System.out.println("Quantos litros voce deseja reabastecer?");
				car.reabastecer(scanner.nextDouble());
				scanner.nextLine();
				break;
			case 3:
				double gasQtdResto = car.getFuel();
				System.out.printf("Combustivel restante: %.1f litro(s)\n\n", gasQtdResto);
				break;
			case 4:
				System.out.println("Encerrando viagem ...");
				break;
			default:
				System.out.println("Digite um codigo válido\n");
				break;
			}

		} while (act != 4);

		scanner.close();
	}

}
