package heranca2.entities;

public class VIP extends Ingresso{

	
	public VIP (Double valor) {
		super(valor + 200.00);
	}
	
	@Override
	public String imprimeValor() {
		return String.format("Valor com adicional VIP: R$%.2f", getValor());
	}
}
