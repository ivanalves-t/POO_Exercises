package lista02;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double grades[] = new double[10], avgGrade = 0.0, genius = 0.0;

		for (int i = 0; i < grades.length; i++) {
			System.out.println("Digite a nota do " + (i + 1) + "° aluno");
			grades[i] = sc.nextDouble();
			avgGrade += grades[i];
		}
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] > 6) {
				genius ++;
			}
		}
		avgGrade /= 10;
System.out.println("Media das notas: " + avgGrade);
System.out.println("Quantidade de alunos acima da media: "+ genius);
		sc.close();
	}

}
