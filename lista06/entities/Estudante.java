package lista06.entities;

public class Estudante {
	private String nome;
	private String matricula;
	private double[] notas;

	public Estudante(String name, String matricula, double[] notas) {
		super();
		this.nome = name;
		this.matricula = matricula;
		this.notas = notas;
	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public double[] getNotas() {
		return notas;
	}

}
