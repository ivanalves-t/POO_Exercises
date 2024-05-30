package heranca2.entities;

public abstract class Imovel {
	
	private String endereco;
	private Double preco;
	
	public Imovel (String endereco) {
		this.endereco = endereco;
		preco = 700000.00;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public abstract Double valor();
	
}
