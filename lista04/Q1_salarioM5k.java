package lista04;
import java.util.Scanner;

public class Q1_salarioM5k {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de funcionários");
		int qtd = sc.nextInt();

		double[] listaSalario = new double[qtd];
		String[] listaFuncionario = new String[qtd];

		salariosM5K(listaSalario, listaFuncionario, sc);

	}

	public static void salariosM5K(double[] listaSalario, String[] listaFuncionario, Scanner sc) {
		int len = listaFuncionario.length;
		for (int i = 0; i < len; i++) {
			System.out.printf("Digite o nome do %dº funcionário:\n", (i + 1));
			sc.nextLine();
			listaFuncionario[i] = sc.nextLine();
			System.out.printf("Digite o salário do  %dº funcionário:\n", (i + 1));
			listaSalario[i] = sc.nextDouble();
		}
		for (int j = 0; j < len; j++) {
			if (listaSalario[j] > 5000)
				System.out.println('\n'+listaFuncionario[j]);
		}
	}
}
