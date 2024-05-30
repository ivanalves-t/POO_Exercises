package heranca;

import java.util.ArrayList;
import java.util.Scanner;

import heranca.entities.Animal;
import heranca.entities.Mamifero;
import heranca.entities.Peixe;

public class Zoo {

	public static void main(String[] args) {

		ArrayList<Animal> animals = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Integer act = null;

		do {
			System.out.println("\n1 Incluir dados relativo a um peixe;\r\n"
					+ "2 Incluir dados relativo a um mamífero;\r\n"
					+ "3 Listar todos os animais cadastrados;\r\n"
					+ "4 Lista todos os peixes cadastrados");
			System.out.println("Digite uma opção:");
			act = sc.nextInt();
			sc.nextLine();

			switch (act) {
			case 1:
				animals.add(criarPeixe(animals, sc)); // adding directly to animals list
				break;
			case 2:
				animals.add(criarMamifero(animals, sc)); // adding directly to animals list
				break;
			case 3:
				var allAnimals = getAll(animals); // adding all concatenated toString methods of Animal objects
				if (allAnimals.equals("List:")) {
					System.out.println("Nenhum animal cadastrado!");
					break; // first break meaning else
				}
				System.out.println(allAnimals);
				break;
			case 4:
				var allFish = getFish(animals); // adding all concatenated toString methods of only Fish objects
				if (allFish.equals("List:")) {
					System.out.println("Nenhum Peixe cadastrado!");
					break; // first break meaning else
				}
				System.out.println(allFish);
				break;
			case 0:
				System.out.println("Encerrando ...");
				break;
			}

		} while (act != 0);
		sc.close();

	}

	public static Animal criarPeixe(ArrayList<Animal> animals, Scanner sc) {
		System.out.println("Digite o nome do peixe");
		var name = sc.nextLine();
		System.out.println("Digite o comprimento do peixe");
		var length = sc.nextLine();
		System.out.println("Digite o numero de barbatanas do peixe");
		var nBarbatanas = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o comprimento da cauda do peixe");
		var tamanhoCauda = sc.nextLine();
		System.out.println("Digite a velocidade em m/s do peixe");
		var speed = sc.nextDouble();

		Animal novoPeixe = new Peixe(name, length, speed, nBarbatanas, tamanhoCauda);
		System.out.println("Novo peixe cadastrado!\n");
		return novoPeixe;
	}

	public static Animal criarMamifero(ArrayList<Animal> animals, Scanner sc) {
		System.out.println("Digite o nome do animal");
		var name = sc.nextLine();
		System.out.println("Digite o tamanho do animal");
		var length = sc.nextLine();
		System.out.println("Digite a quantidade de patas do animal");
		var paws = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite a cor do animal");
		var color = sc.nextLine();
		System.out.println("Digite a velocidade em m/s do animal");
		var speed = sc.nextDouble();
		System.out.println("Digite a comida favorita do animal");
		var favFood = sc.nextLine();

		Animal novoMamifero = new Mamifero(name, length, paws, color, speed, favFood);
		System.out.println("Novo amifero cadastrado!");
		return novoMamifero;
	}

	public static String getAll(ArrayList<Animal> animals) {

		String allAnimals = "List:";
		for (Animal animal : animals) {
			allAnimals += animal.toString();
		}
		return allAnimals;
	}

	public static String getFish(ArrayList<Animal> animals) {
		String allFish = "List:";
		for (Animal animal : animals) {
			if (animal instanceof Peixe) {
				allFish += animal.toString();
			}
		}
		return allFish;
	}
}
