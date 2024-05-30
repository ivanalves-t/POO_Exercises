package lista07;

import java.util.ArrayList;
import java.util.Scanner;

import lista07.entities.Produto;

public class Livraria {
	ArrayList<Produto> produtos = new ArrayList<>(); // os métodos nao precisarem sempre pedir a lista
	Produto produtoBase = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Livraria livraria = new Livraria(); // instanciação da propria classe para usar os metodos privados
		Integer act = null;

		do {
			System.out.println("\n1. Cadastrar produto");
			System.out.println("2. Buscar Produto (procurar produto pelo nome) ");
			System.out.println("3. Listar todos os produtos");
			System.out.println("4. Efetuar venda de produto");
			System.out.println("0. Sair");
			System.out.println("Digite uma opção:");
			act = sc.nextInt();
			sc.nextLine();

			switch (act) {
			case 1:
				livraria.cadastrarProduto(sc);
				break;
			case 2:
				System.out.println(livraria.buscarProduto(sc));
				break;
			case 3:
				livraria.todosOsProdutos();
				break;
			case 4:
				livraria.venderProduto(sc);
				break;
			case 0:
				System.out.println("Encerrando ...");
				break;
			}

		} while (act != 0);
		sc.close();
	}

	public void cadastrarProduto(Scanner cadastro) {

		System.out.println("Digite o nome do produto");
		String nome = cadastro.nextLine();
		System.out.println("Digite o codigo do produto");
		String codigo = cadastro.nextLine();
		System.out.println("Digite o preco do produto");
		double preco = cadastro.nextDouble();
		System.out.println("Digite a quantidade do produto");
		int quantidade = cadastro.nextInt();

		Produto novoProduto = new Produto(nome, codigo, preco, quantidade);

		if (novoProduto.getQuantidade() != 0)
			produtos.add(novoProduto);

		produtoBase = novoProduto;
	}

	public Produto buscarProduto(Scanner busca) {
		System.out.println("Digite o nome do produto para busca");
		String buscaProduto = busca.nextLine();
		for (Produto produto : produtos) {
			if (produto.getNome().equals(buscaProduto)) {
				produtoBase = produto;
				return produto;
			} else {
				System.out.println("Produto nao encontrado!");
			}
		}
		return null;
	}

	public void todosOsProdutos() {
		if (produtos.size() == 0) {
			System.out.println("Nenhum produto a venda, cadastre um!");
			return;
		}
		System.out.printf("Lista dos produtos cadastrados: %s", this.produtos);
	}

	public void venderProduto(Scanner venda) {
		if (produtoBase == null) {
			System.out.println("Selecione um produto para vender apertando '2' ou cadastre um novo produto apertando '1'.");
			return;
		}
		System.out.println(produtoBase.toString() + '\n');
		System.out.println("Quantas unidades do produto voce deseja vender?");
		int qtdDesejada = venda.nextInt();
		if (qtdDesejada > produtoBase.getQuantidade()) {
			System.out.println("Quantidade de produtos insuficiente");
			return;
		}
		int retirada = (int) produtoBase.getQuantidade() - qtdDesejada;
		produtoBase.setQuantidade(retirada);
		
		double precoVenda = produtoBase.getPreco() * qtdDesejada;
		System.out.printf("Total: R$ %s\n", precoVenda);
		if (produtoBase.getQuantidade() == 0) {
			produtos.remove(produtoBase);
		}
	}
}
