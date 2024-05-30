package lista04;
import java.util.ArrayList;
import java.util.Scanner;

public class Q2_notasMedia {
	public static void main(String[] args) {
		ArrayList<String> reprovados = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String[] alunos = new String[4];
		double[] notas = new double[4];
		
		String resultado = calcularMedia(alunos, notas, reprovados, sc);
		
		System.out.println(resultado);
		sc.close();
	}

	public static String calcularMedia(String[] alunos, double[] notas, ArrayList<String> reprovados, Scanner sc) {
		for (int i = 0; i < 4; i++) {
			System.out.printf("\nDigite o nome do %dº aluno: ", (i + 1));
			alunos[i] = sc.nextLine();
			System.out.printf("\nDigite a primeira nota do(a) estudante %s: ", (alunos[i]));
			notas[i] = sc.nextDouble();
			System.out.printf("\nDigite a segunda nota do(a) estudante %s: ", (alunos[i]));
			notas[i] += sc.nextDouble();
			sc.nextLine();
		}
		for (int j = 0; j < 4; j++) {
			notas[j] = notas[j] / 2;
			if (notas[j] < 7) {
				reprovados.add(alunos[j]);
			}
		}
		if (reprovados.size() != 0) {
			return String.format("\nAlunos reprovados " + reprovados);
		}else 
			return "\nTodos foram aprovados!";

	}
}
