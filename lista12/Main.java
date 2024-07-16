package lista12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lista12.entities.Circulo;
import lista12.entities.ObjetoGeometrico;
import lista12.entities.Retangulo;

public class Main {
    private static List<ObjetoGeometrico> objetosGeometricos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adicionar um Círculo");
            System.out.println("2. Adicionar um Retângulo");
            System.out.println("3. Calcular média das áreas");
            System.out.println("4. Calcular média dos perímetros");
            System.out.println("0. Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Circulo.menuCirculo();
                    break;
                case 2:
                    Retangulo.menuRetangulo();
                    break;
                case 3:
                    calcularMediaAreas();
                    break;
                case 4:
                    calcularMediaPerimetros();
                    break;
                case 0:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void adicionarCirculo(double raio) {
        Circulo circulo = new Circulo(raio);
        objetosGeometricos.add(circulo);
    }

    private static void adicionarRetangulo(double base, double altura) {
        Retangulo retangulo = new Retangulo(base, altura);
        objetosGeometricos.add(retangulo);
    }

    private static void calcularMediaAreas() {
        if (objetosGeometricos.isEmpty()) {
            System.out.println("Nenhum objeto geométrico adicionado.");
            return;
        }

        double somaAreas = 0;
        for (ObjetoGeometrico objeto : objetosGeometricos) {
            somaAreas += objeto.calcularArea();
        }

        double mediaAreas = somaAreas / objetosGeometricos.size();
        System.out.println("Média das áreas: " + mediaAreas);
    }

    private static void calcularMediaPerimetros() {
        if (objetosGeometricos.isEmpty()) {
            System.out.println("Nenhum objeto geométrico adicionado.");
            return;
        }

        double somaPerimetros = 0;
        for (ObjetoGeometrico objeto : objetosGeometricos) {
            somaPerimetros += objeto.calcularPerimetro();
        }

        double mediaPerimetros = somaPerimetros / objetosGeometricos.size();
        System.out.println("Média dos perímetros: " + mediaPerimetros);
    }
   
}
