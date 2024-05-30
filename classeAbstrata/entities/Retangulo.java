package classeAbstrata.entities;

public class Retangulo extends Quadrilatero{

	private float base;
	private float altura;
	
	public Retangulo (float base, float altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public Retangulo() {
		
	}
	
	@Override
	public float calcularArea() {
		return base * altura;
	}
	@Override
	public float calcularPerimetro() {
		return (2 * base) + (2 * altura);
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
}
