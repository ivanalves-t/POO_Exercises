package heranca.entities;

public class Animal {
	
	protected String name;
	protected String length;
	protected int paws = 4;
	protected String color;
	protected String habitat;
	protected double speed;
	
	public Animal (String name, String length, int paws, String color, String habitat, double speed) {
		this.name = name;
		this.length = length;
		this.paws = paws;
		this.color = color;
		this.habitat = habitat;
		this.speed = speed;
	}
}
