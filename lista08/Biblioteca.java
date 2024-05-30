package lista08;

import java.util.ArrayList;
import java.util.Scanner;

import lista08.entities.Livro;

public class Biblioteca {

	public static void main(String[] args) {
		ArrayList<Livro> biblioteca = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Integer act = null;

		do {
			System.out.println("\n1. Cadastrar livro\r\n"
					+ "2. Buscar livro por titulo (Buscar livro pelo titulo)\r\n"
					+ "3. Listar livros por autor (Mostrar os livros buscando pelo nome do autor)\r\n"
					+ "4. Listar todos os livros (Mostrar todos os livros cadastrados)\r\n"
					+ "0. Sair");
			System.out.println("Digite uma opção:");
			act = sc.nextInt();
			sc.nextLine();

			switch (act) {
			case 1:
				biblioteca.add(cadastrarLivro(biblioteca, sc));
				break;
			case 2:
				System.out.println("Digite o nome do titulo do livro");
				var titulo = sc.nextLine();
				System.out.println(buscarLivroPorTitulo(biblioteca, titulo));
				break;
			case 3:
				System.out.println("Digite o nome do autor");
				var autor = sc.nextLine();
				listarLivrosPorAutor(biblioteca, autor);
				break;
			case 4:
			if(biblioteca.size() == 0) {
				System.out.println("Cadastre pelo menos um livro!");
				break;
			}
			for (Livro livro : biblioteca) {
				System.out.println(livro);
			}
				break;
			case 0:
				System.out.println("Encerrando ...");
				break;
			}

		} while (act != 0);
		sc.close();
	}

	public static Livro cadastrarLivro(ArrayList<Livro> biblioteca, Scanner sc) {
		System.out.println("CPF do autor");
		var CPF = sc.nextLine();
		System.out.println("Nome do autor");
		var nomeAutor = sc.nextLine();
		System.out.println("Endereco do autor");
		var enderecoAutor = sc.nextLine();
		System.out.println("CNPJ da editora");
		// parte da editora
		var CNPJ = sc.nextLine();
		System.out.println("Nome da editora");
		var nomeEditora = sc.nextLine();
		System.out.println("Endereco da editora");
		var enderecoEditora = sc.nextLine();
		System.out.println("Telefone da editora");
		var telefone = sc.nextLine();
		System.out.println("ISBN do livro");
		var ISBN = sc.nextLine();
		System.out.println("Nome do titulo do livro");
		var titulo = sc.nextLine();
		System.out.println("Ano de edicao do livro");
		var anoEdicao = sc.nextLine();

		for (Livro livro : biblioteca) {
			if (livro.getISBN().equals(ISBN))
				System.out.println("LIVRO JÁ CADASTRADO!");
			return null;
		}
		String autor[] = { CPF, nomeAutor, enderecoAutor };
		String editora[] = { CNPJ, nomeEditora, enderecoEditora, telefone };

		Livro novoLivro = new Livro(autor, editora, ISBN, titulo, anoEdicao);
		return novoLivro;
	}

	public static Livro buscarLivroPorTitulo(ArrayList<Livro> biblioteca, String tituloBusca) {
		for (Livro livroBusca : biblioteca) {
			if (livroBusca.getTitulo().equals(tituloBusca)) {
				return livroBusca;
			}
		}
		System.out.println("Livro não cadastrado no sistema");
		return null;
	}

	public static ArrayList<Livro> listarLivrosPorAutor(ArrayList<Livro> biblioteca, String autorBusca) {
		ArrayList<Livro> comumAutor = new ArrayList<>();
		for (Livro livroBusca : biblioteca) {
			String[] autor = livroBusca.getAutor();
			if (autor[1].equals(autorBusca)) {
				comumAutor.add(livroBusca);
			}
		}
		if (comumAutor.size() == 0)
			System.out.println("O autor nao possui livros\n");
		return comumAutor;
	}

}
