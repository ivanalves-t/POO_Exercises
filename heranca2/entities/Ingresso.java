package heranca2.entities;

public class Ingresso {
	
	private Double valor;
	
	public Ingresso (Double valor) {
		this.valor = valor;
	}
	
	public String imprimeValor() {
		return String.format("Valor: R$ %.2f", valor);
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
}
