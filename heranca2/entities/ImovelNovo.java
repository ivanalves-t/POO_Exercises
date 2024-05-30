package heranca2.entities;

public class ImovelNovo extends Imovel{

	public ImovelNovo(String endereco) {
		super(endereco);
		setPreco(700000.00);
	}

	@Override
	public Double valor() {
		return getPreco() + 300000.00;
	}
	
}
