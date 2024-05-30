package heranca2.entities;

public class CamaroteSuperior extends VIP{

	private Double valorAdicional;
	
	public CamaroteSuperior(Double valor, Double valorAdicional) {
		super(valor);
		setValor(valor + valorAdicional);
	}

	public Double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(Double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	
}
