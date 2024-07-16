package lista12.entities;

import java.util.Scanner;

public class Retangulo implements ObjetoGeometrico {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public static void menuRetangulo() {
        Scanner scanner = new Scanner(System.in);
        Retangulo retangulo = null;

        while (true) {
            System.out.println("1. Digitar valor de base e altura");
            System.out.println("2. Calcular Área");
            System.out.println("3. Calcular Perímetro");
            System.out.println("0. Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Digite a altura: ");
                    double altura = scanner.nextDouble();
                    retangulo = new Retangulo(base, altura);
                    break;
                case 2:
                    if (retangulo != null) {
                        System.out.println("Área: " + retangulo.calcularArea());
                    } else {
                        System.out.println("Primeiro defina o retângulo.");
                    }
                    break;
                case 3:
                    if (retangulo != null) {
                        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
                    } else {
                        System.out.println("Primeiro defina o retângulo.");
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
        menuRetangulo();
    }
}
