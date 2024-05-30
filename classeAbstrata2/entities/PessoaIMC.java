package classeAbstrata2.entities;

import java.time.LocalDate;

public abstract class PessoaIMC extends Pessoa{

	private double peso;
	private double altura;
	
	public PessoaIMC(String name, LocalDate dataNascimento, double peso, double altura) {
		super(name, dataNascimento);
		this.peso = peso;
		this.altura = altura;
	}
	
	public double calcularIMC() {
		return peso/(altura*altura);
	}
	
	public abstract String resultIMC();

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("\nPeso: " + String.format("%.1f", getPeso()));
		sb.append("\nAltura: " + String.format("%.2f", getAltura()));
		return sb.toString();
	}
}
