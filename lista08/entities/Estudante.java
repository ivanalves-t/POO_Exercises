package lista08.entities;

public class Estudante {
	private String matricula;
	private String nome;
	private double[] notas = new double[4];

	public Estudante(String matricula, String nome, double[] notas) {
		this.matricula = matricula;
		this.nome = nome;
		this.notas = notas;
	}

	public String toString() {
		return "Estudante = [ matricula = " + matricula + ", nome = " + nome + ", notas =" + notas[0] + ", " + notas[1]
				+ ", " + notas[2] + ", " + notas[3] + ".\n";
	}

	public double[] getNotas() {
		return notas;
	}

	public String getMatricula() {
		return matricula;
	}

	public Double mediaCalc() {
		double media = 0;

		media += notas[0];
		media += notas[1];
		media += notas[2];
		media += notas[3];

		media /= 4;

		return media;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
}
