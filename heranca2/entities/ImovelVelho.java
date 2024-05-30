package heranca2.entities;

public class ImovelVelho extends Imovel{

	
	public ImovelVelho(String endereco) {
		super(endereco);
	}
	
	@Override
	public Double valor() {
		return getPreco() - 300000.00;
	}
	
}
