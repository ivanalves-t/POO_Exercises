package heranca.entities;

public class Mamifero extends Animal {


	private String feature;
	private String favoriteFood;
		
	public Mamifero(String name, String length, int paws, String color, double speed, String favoriteFood) {
		super(name, length, paws, color, "land", speed);
		this.favoriteFood = favoriteFood;
		this.feature = "tem alimento favorito";
	}

	public String toString() {
		return "\nMamifero [caracteristica=" + feature + ", favoriteFood="+ favoriteFood + ", name=" + name + ", length=" + length + ", paws=" + paws + ", color="
				+ color + ", habitat=" + habitat + ", speed=" + speed + "]";
	}

}
