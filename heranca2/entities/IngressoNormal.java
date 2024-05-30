package heranca2.entities;

public class IngressoNormal extends Ingresso{
	
	public IngressoNormal (Double valor) {
		super(valor);
	}
	
	@Override
	public String imprimeValor() {
		return "Ingresso Normal " + super.imprimeValor();
	}
}
