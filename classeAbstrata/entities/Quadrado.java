package classeAbstrata.entities;

public class Quadrado extends Retangulo{
	
	private float lado;
	
	public Quadrado (float lado) {
		this.lado = lado;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}
	
	@Override
	public float calcularArea() {
		return lado * lado;
	}
	@Override
	public float calcularPerimetro() {
		return 4 * lado;
	}
	
}
