package lista02;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int list[] = new int[10], current;

		for (int i = 0; i < list.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º numero");
			list[i] = sc.nextInt();
		}
		for (int i = 0; i < list.length; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (list[i] < list[j]) {
					current = list[i];
					list[i] = list[j];
					list[j] = current;
				}
			}
		}System.out.println(Arrays.toString(list));

		sc.close();
	}
}
