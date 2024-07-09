package interface2.entities;

import java.util.ArrayList;
import java.util.List;

public class Aluno2 implements Aluno{
	
	List <Double> notas = new ArrayList<>();
	
	public Aluno2 () {
		
	}
	
	@Override
	public double calcularMedia() {
		double median = 0;
		if (notas.size()>=1) {
		for (double n : notas) {
			median += n;
		}
		return median/notas.size();
		}
		else {
			return median;			
		}
	}

	@Override
	public void addNota(double nota) {
		this.notas.add(nota);
	}

	@Override
	public void removeNota() {
		if (notas.size()!=0) {
			notas.remove(notas.size()-1);
			return;
		}
	}

	@Override
	public double mostraNota() {
		double maior = 0;
		for (Double n : notas) {
			if (n > maior)
				maior = n;
		}
		return maior;
	}

}
