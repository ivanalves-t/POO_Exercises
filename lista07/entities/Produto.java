package lista07.entities;

public class Produto {
	private String nome;
	private String codigo;
	private double preco;
	private int quantidade;
	
	public Produto(String nome, String codigo, double preco, int quantidade) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getCodigo() {
		return codigo;
	}


	public double getPreco() {
		return preco;
	}
	public double getQuantidade() {
		return quantidade;
	}
	
	public String toString() {
		return "Produto= " + nome + " (codigo= " + codigo + ", preco= " + preco + ", quantidade= " + quantidade + ")";
	}
}
