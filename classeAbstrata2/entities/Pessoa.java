package classeAbstrata2.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {

	private String name;
	private LocalDate dataNascimento;
	
	public Pessoa (String name, LocalDate dataNascimento) {
		this.name = name;
		this.dataNascimento = dataNascimento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String toString() {
//		Poderia usar o codigo abaixo
//		StringBuilder sb = new StringBuilder();
//		sb.append("\nNome: ");
//		sb.append(getName());
//		sb.append("\nData de Nascimento: ");
//		sb.append(getDataNascimento());
//		return sb.toString();
		return "\nNome: " + getName() + "\nData de Nascimento: " + getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
}
