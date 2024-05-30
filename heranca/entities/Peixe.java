package heranca.entities;

public class Peixe extends Animal {
	
	private String feature;
	private int nBarbatanas;
	private String tamanhoCauda;
	
	public Peixe (String name, String length, double speed, int nBarbatanas, String tamanhoCauda) {
		super(name, length, 0, "grey", "sea", speed);
		this.nBarbatanas = nBarbatanas;
		this.tamanhoCauda = tamanhoCauda;
		this.feature = "tem barbatana e cauda";
	}

	public String toString() {
		return "\nPeixe [caracteristica=" + feature + ", nBarbatanas=" + nBarbatanas + ", tamanhoCauda="+ tamanhoCauda + ", name=" + name + ", length=" + length + ", paws=" + paws + ", color="
				+ color + ", habitat=" + habitat + ", speed=" + speed +"]";
	}


}
