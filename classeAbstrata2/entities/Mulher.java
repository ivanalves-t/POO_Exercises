package classeAbstrata2.entities;

import java.time.LocalDate;

public class Mulher extends PessoaIMC{

	public Mulher(String name, LocalDate dataNascimento, double peso, double altura) {
		super(name, dataNascimento, peso, altura);
	}

	@Override
	public String resultIMC() {
		if (calcularIMC() < 19) {
			return "\nAbaixo do peso ideal";
		} else {
			if (calcularIMC() < 25.8) {
				return "\nPeso ideal";
			} else {
				return "\nAcima do peso ideal";
			}
		}
	}

	
}
