package heranca2.entities;

public class Cachorro extends Animal{

	public Cachorro (String nome, String raca) {
		super(nome, raca);
	}
	
	@Override
	public String caminha() {
		return getNome() + " está caminhando";
	}

	@Override
	public String somAnimal() {
		return getNome() + " está latindo";
	}
}
