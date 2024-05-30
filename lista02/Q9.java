package lista02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Character>vogals = new ArrayList<>(Arrays.asList('à','á','ê','õ','í','é','ã','a','e','i','o','u'));

		String str = sc.nextLine().toLowerCase();
		Integer n = 0;
		
		for (int i = 0; i < str.length();i++)
			if (vogals.contains(str.charAt(i))){
				n ++;
			}
		System.out.println("A string contém " + n + " vogais.");
		
		sc.close();
	}
}
