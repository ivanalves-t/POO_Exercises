package classeAbstrata2.entities;

import java.time.LocalDate;

public class Homem extends PessoaIMC {

	public Homem(String name, LocalDate dataNascimento, double peso, double altura) {
		super(name, dataNascimento, peso, altura);

	}

	@Override
	public String resultIMC() {
		if (calcularIMC() < 20.7) {
			return "\nAbaixo do peso ideal";
		} else {
			if (calcularIMC() < 26.4) {
				return "\nPeso ideal";
			} else {
				return "\nAcima do peso ideal";
			}
		}
	}

}
