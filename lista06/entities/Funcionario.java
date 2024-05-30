package lista06.entities;

public class Funcionario {
	private String name;
	private double wage;

	public Funcionario(String name, double wage) {
		this.name = name;
		this.wage = wage;
	}

	public String getName() {
		return name;
	}
	
	public double getWage() {
		return wage;
	}

}
