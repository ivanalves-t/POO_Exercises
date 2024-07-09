package interface2.entities;

public class Aluno1 implements Aluno{
	
	private Double[]notas = new Double[4];
	
	public Aluno1 () {
	}
	
	@Override
	public double calcularMedia() {
		double median = 0;
		if (notas.length>=1) {
		for (double n : notas) {
			median += n;
		}
		return median/notas.length;
		}
		else {
			return median;			
		}
	}

	@Override
	public void addNota(double nota) {
		
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] == null) {
				notas[i] = nota;
				return;
			}
		}
	}

	@Override
	public void removeNota() {
	    for (int i = notas.length - 1; i >= 0; i--) {
	        if (notas[i] != null) {
	            notas[i] = 0.0;
	            return;
	        }
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
