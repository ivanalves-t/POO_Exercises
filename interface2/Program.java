package interface2;

import java.util.Scanner;

import interface2.entities.Aluno2;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Aluno2 aluno2 = new Aluno2();
		Integer n = null;
		
		do {
			System.out.println("\n\r1- Adicionar uma nota\r\n"
					+ "2- Remover a ultima nota\r\n"
					+ "3- Calcular a média\r\n"
					+ "4- Mostrar a maior nota tirada\n");
			n = sc.nextInt();
			
			switch (n) {
			
			case 1:
				System.out.print("Digite a nova nota do aluno: ");
				aluno2.addNota(sc.nextDouble());
				break;
				
			case 2: 
				System.out.println("Removendo a última nota do aluno: ");
				aluno2.removeNota();
				break;
				
			case 3:
				double media = aluno2.calcularMedia();
				System.out.printf("Média do aluno: %.1f", media);
				break;
				
			case 4:
				double maior = aluno2.mostraNota();
				System.out.printf("Maior nota do aluno: %.1f", maior);
				break;
				
			case 0:
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + n);
			}
		}while(n!=0);
		sc.close();
	}
}
