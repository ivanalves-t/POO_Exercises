package lista07;

import java.util.ArrayList;
import java.util.Scanner;

import lista07.entities.Livro;

public class Biblioteca {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Livro> biblioteca = new ArrayList<>();
		Integer act = null;

		do {
			System.out.println("1. Cadastrar livro");
			System.out.println("2. Buscar livro por titulo");
			System.out.println("3. Listar livros por autor (mostrar os livros de um autor)");
			System.out.println("4. Listar todos os livros");
			System.out.println("0. Sair");
			System.out.println("Digite uma opção:");
			act = sc.nextInt();
			sc.nextLine();

			switch (act) {
			case 1:
				cadastrarLivro(biblioteca, sc);
				break;
			case 2:
				buscarLivroPorTitulo(biblioteca, sc);
				break;
			case 3:
				ArrayList<String> buscaAutor = (listaLivrosPorAutor(biblioteca, sc));
				if (buscaAutor.size() == 0) {
					System.out.println("Nenhum livro registrado com esse autor\n");
					break;
				}
				System.out.println(buscaAutor);
				break;
			case 4:
				if (biblioteca.size() != 0) {
				System.out.println(biblioteca);
				break;
				}
				System.out.println("Cadastre um livro antes!\n");
				break;
			case 0:
				System.out.println("Encerrando ...");
				break;
			}

		} while (act != 0);
	}

	public static void cadastrarLivro(ArrayList<Livro> biblioteca, Scanner cadastro) {
		System.out.println("Digite o autor do livro");
		String autor = cadastro.nextLine();
		System.out.println("Digite a editora do livro");
		String editora = cadastro.nextLine();
		System.out.println("Digite o ISBN do livro");
		String ISBN = cadastro.nextLine();
		System.out.println("Digite o titulo do livro");
		String titulo = cadastro.nextLine();
		System.out.println("Digite o Ano de Edicao do livro");
		String anoEdicao = cadastro.nextLine();
		for (Livro livroCadastrado : biblioteca) {
			if (livroCadastrado.getISBN().equals(ISBN)) {
				System.out.println("Livro já cadastrado! ");
				return;
			}
		}
		Livro novoLivro = new Livro(autor, editora, ISBN, titulo, anoEdicao);
		biblioteca.add(novoLivro);
	}

	public static Livro buscarLivroPorTitulo(ArrayList<Livro> biblioteca, Scanner busca) {
		System.out.println("Digite o titulo do livro desejado");
		String buscaTitulo = busca.nextLine();
		for (Livro livroCadastrado : biblioteca) {
			if (livroCadastrado.getTitulo().equals(buscaTitulo)) {
				return livroCadastrado;
			}
		}
		System.out.println("Livro nao cadastrado!\n");
		return null;
	}

	public static ArrayList<String> listaLivrosPorAutor(ArrayList<Livro> biblioteca, Scanner busca) {
		ArrayList<String> buscaAutor = new ArrayList<>();
		System.out.println("Digite o nome do autor");
		String autorBusca = busca.nextLine();

		for (Livro livroCadastrado : biblioteca) {
			if (livroCadastrado.getAutor().equals(autorBusca)) {
				buscaAutor.add(livroCadastrado.toString());
			}
		}
		return buscaAutor;
	}

}
