package lista12.entities;

import java.util.Scanner;

public class Circulo implements ObjetoGeometrico {
    private double raio;
    private static final double PI = 3.14159;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * raio;
    }

    public static void menuCirculo() {
        Scanner scanner = new Scanner(System.in);
        Circulo circulo = null;

        while (true) {
            System.out.println("1. Digitar valor do raio");
            System.out.println("2. Calcular Área");
            System.out.println("3. Calcular Perímetro");
            System.out.println("0. Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o raio: ");
                    double raio = scanner.nextDouble();
                    circulo = new Circulo(raio);
                    break;
                case 2:
                    if (circulo != null) {
                        System.out.println("Área: " + circulo.calcularArea());
                    } else {
                        System.out.println("Primeiro defina o círculo.");
                    }
                    break;
                case 3:
                    if (circulo != null) {
                        System.out.println("Perímetro: " + circulo.calcularPerimetro());
                    } else {
                        System.out.println("Primeiro defina o círculo.");
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public static void main(String[] args) {
        menuCirculo();
    }
}
