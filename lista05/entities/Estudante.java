package lista05.entities;

import java.util.Scanner;

public class Estudante {
	private String nome;
	private String matricula;
	private String endereco;
	private double[] notas;

	public Estudante () {
		
	}
	
	public Estudante(String nome, String matricula, String endereco, double[] notas) {
		this.nome = nome;
		this.matricula = matricula;
		this.endereco = endereco;
		this.notas = notas;
	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double[] getNotas() {
		return notas;
	}

	public static void criarEstudante(Estudante estudante, Scanner sc) {
		double [] notaS = new double [4];
		System.out.print("Digite o nome do(a) estudante: ");
		estudante.setNome(sc.nextLine()); 
		System.out.printf("Digite o numero da matricula do(a) estudante '%s': ", estudante.getNome());
		estudante.setMatricula(sc.nextLine()); 
		System.out.printf("Digite o endereco do(a) estudante '%s': ", estudante.getNome());
		estudante.setEndereco(sc.nextLine()); 
		for (int i = 0; i < 4; i++) {
			System.out.printf("Digite a %dª nota do(a) estudante '%s': ", (i + 1), estudante.getNome());
			notaS[i] = sc.nextDouble();
		}
		sc.nextLine();
		estudante.setNotas(notaS);
	}
	
	public void calcularMedia() {
		double media = 0;
		double [] notas = this.notas;
		for (double nota : notas) {
			media += nota;
		}
		media /= notas.length;
		if (media >= 7)
			System.out.println("APROVADO!");
	}

}
