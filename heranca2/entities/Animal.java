package heranca2.entities;

public abstract class Animal {
	
	private String nome;
	private String raca;
	
	public Animal () {
		
	}
	
	public Animal (String nome, String raca) {
		this.nome = nome;
		this.raca = raca;
	}
	
	public abstract String somAnimal();
	public abstract String caminha();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
}
