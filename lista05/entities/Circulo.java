package lista05.entities;

public class Circulo {
private double raio;

public Circulo(double raio) {
	super();
	this.raio = raio;
}

public double getRaio() {
	return raio;
}

public void setRaio(double raio) {
	this.raio = raio;
}

public double calcularAreaCir() {
	return (Math.PI * this.raio * this.raio);
}

public double calcularPerimetroCir() {
	return (2 * Math.PI * this.raio);
}

}
