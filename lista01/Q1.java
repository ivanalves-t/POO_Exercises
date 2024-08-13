package lista01;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

import lista01.entities.AnoInvalidoException;
import lista01.entities.FutureTravelException;

public class Q1 {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        int ano = dataAtual.getYear();
        Scanner sc = new Scanner(System.in);
        
        int nasc = 0;
        boolean isValid = false;
        
        System.out.print("Digite o ano do seu nascimento: ");
        
        while (!isValid) {
            try {
                nasc = sc.nextInt();    
                validarAno(nasc);
                validarAnoFuturo(nasc, ano);
                isValid = true;
            }
            catch(InputMismatchException e) {
                System.out.println("Digite um formato válido de data");
                sc.next(); // Limpa o buffer do scanner
            }
            catch(AnoInvalidoException e) {
                System.out.println(e.getMessage());
            }
            catch(FutureTravelException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Você tem ou fará " + (ano - nasc) + " anos nesse ano.");
        sc.close();
    }
    
    private static void validarAno(int nasc) throws AnoInvalidoException {
        if (String.valueOf(nasc).length() != 4 || nasc <= 0) {
            throw new AnoInvalidoException("O ano deve ter 4 dígitos e ser maior que 0.");
        }
    }
    
    private static void validarAnoFuturo(int nasc, int ano) throws FutureTravelException {
        if (nasc >= ano) {
            throw new FutureTravelException("Digite um ano válido, menor que " + ano);
        }
    }
}
//package lista01;
//
//import java.time.LocalDate;
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//import lista01.entities.AnoInvalidoException;
//import lista01.entities.FutureTravelException;
//import lista01.util.Validador; // Importação da classe Validador
//
//public class Q1 {
//    public static void main(String[] args) {
//        LocalDate dataAtual = LocalDate.now();
//        int anoAtual = dataAtual.getYear();
//        Scanner sc = new Scanner(System.in);
//        
//        int anoNascimento = 0;
//        boolean isValid = false;
//        
//        System.out.print("Digite o ano do seu nascimento: ");
//        
//        while (!isValid) {
//            try {
//                anoNascimento = sc.nextInt();    
//                Validador.validarAno(anoNascimento);            // Chamada ao Validador
//                Validador.validarAnoFuturo(anoNascimento, anoAtual); // Chamada ao Validador
//                isValid = true;
//            }
//            catch(InputMismatchException e) {
//                System.out.println("Digite um formato válido de data");
//                sc.next(); // Limpa o buffer do scanner
//            }
//            catch(AnoInvalidoException e) {
//                System.out.println(e.getMessage());
//            }
//            catch(FutureTravelException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//
//        System.out.print("Você tem ou fará " + (anoAtual - anoNascimento) + " anos nesse ano.");
//        sc.close();
//    }
//}