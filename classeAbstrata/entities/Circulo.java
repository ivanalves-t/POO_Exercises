package classeAbstrata.entities;

public class Circulo extends Quadrilatero{

	private float raio;
	
	public Circulo (float raio) {
		this.raio = raio;
	}

	@Override
	public float calcularArea() {
		return (float) (Math.PI * raio * raio);
	}

	@Override
	public float calcularPerimetro() {
		return (float) (Math.PI * raio * 2);
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}
	
	
}
