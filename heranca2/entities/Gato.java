package heranca2.entities;

public class Gato extends Animal{

	public Gato (String nome, String raca) {
		super(nome, raca);
	}
	
	@Override
	public String caminha() {
		return getNome() + " está caminhando";
	}

	@Override
	public String somAnimal() {
		return getNome() + " está miando";
	}
}
