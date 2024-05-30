package lista06.entities;

public class Pessoa {

	private String nome;
	private double peso;
	private double altura;
	private double IMC;

	public Pessoa(String nome, double peso, double altura) {
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.IMC = (this.peso / (this.altura * this.altura));
	}

	public double getIMC() {
		return IMC;
	}

	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

}
