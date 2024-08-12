package lista01;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

import lista01.entities.AnoInvalidoException;

public class Q1 {
	public static void main(String[] args) {
		LocalDate dataAtual = LocalDate.now();
		long ano = dataAtual.getYear();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o ano do seu nascimento: ");
		// Try catch feature enabled
		while (true) {
			try {
				int nasc = sc.nextInt();	
				validarAno(nasc);
				System.out.print("Voce tem ou terá "+(ano - nasc)+" anos nesse ano.");
				return;
			}
			catch(InputMismatchException e) {
				System.out.println("Digite um formato válido de data");
				sc.next();
			}
			catch(AnoInvalidoException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
    private static void validarAno(int nasc) throws AnoInvalidoException {
        if (String.valueOf(nasc).length() != 4) {
            throw new AnoInvalidoException("O ano deve ter 4 dígitos.");
        }
    }

}

