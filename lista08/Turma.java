package lista08;

import java.util.ArrayList;

import lista08.entities.Estudante;

public class Turma {
	private String codigo;
	private ArrayList<Estudante> estudantes = new ArrayList<>();

	public Turma(String codigo,ArrayList<Estudante> estudantes) {
		this.codigo = codigo;
		this.estudantes = estudantes;
	}

	public Turma(String codigo) {
		this.codigo = codigo;
	}

	public void mediaTurma() {
		System.out.println("Media de todos os estudantes da turma " + codigo);
		for (Estudante estudante : estudantes) {
			double mediaAtual = 0;

			mediaAtual += estudante.getNotas()[0];
			mediaAtual += estudante.getNotas()[1];
			mediaAtual += estudante.getNotas()[2];
			mediaAtual += estudante.getNotas()[3];

			mediaAtual /= 4;
			System.out.println(mediaAtual);
		}
		System.out.println();
	}

	public String getCodigo() {
		return codigo;
	}
	
	public ArrayList <Estudante> getEstudante (){
		return estudantes;
	}

	public void adicionar(Estudante novoEstudante) {
		for (Estudante estudantesAtuais : estudantes) {
			if(estudantesAtuais.getMatricula().equals(novoEstudante.getMatricula())) {
				System.out.println("Estudante já cadastrado!");
				return;
			}
		}
		estudantes.add(novoEstudante);
	}
}
