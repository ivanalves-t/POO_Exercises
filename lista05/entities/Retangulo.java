package lista05.entities;

public class Retangulo {
private double base;
private double height;

public Retangulo(double base, double height) {
	super();
	this.base = base;
	this.height = height;
}

public double getBase() {
	return base;
}
public void setBase(double base) {
	this.base = base;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}

public double calcularArea () {
	return (this.base * this.height);
}

public double calcularPerimetro () {
	return (this.base * 2 + 2 * this.height);
}

}
