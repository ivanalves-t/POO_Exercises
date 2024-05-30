package lista03;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma string");
		String str = sc.nextLine().toLowerCase();
		vogals_count(str);
		sc.close();
	}

	public static void vogals_count(String x) {
		ArrayList<Character>vogals = new ArrayList<>(Arrays.asList('à','á','ê','õ','í','é','ã','a','e','i','o','u'));

		Integer n = 0;
		
		for (int i = 0; i < x.length();i++)
			if (vogals.contains(x.charAt(i))){
				n ++;
			}
		System.out.println("A string contém " + n + " vogais.");
		
	}
}
