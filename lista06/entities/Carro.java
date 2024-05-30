package lista06.entities;

public class Carro {
	
private double efficient;
private double fuel;

public Carro(double fuel, double efficient) {
	super();
	this.fuel = fuel;
	this.efficient = efficient;

}

public double getEfficient() {
	return efficient;
}

public void setEfficient(double efficient) {
	this.efficient = efficient;
}

public double getFuel() {
	return fuel;
}

public void setFuel (double fuel) {
	this.fuel = fuel;
}

public void andar(double distanciaDesejada) {
	double distanciaPossivel = (this.efficient * this.fuel);
	if (distanciaDesejada > distanciaPossivel) {
		System.out.println("Combustível insuficiente, reabasteca!\n");
		return;
	}
	double gasGasta = distanciaDesejada / this.efficient;
	this.fuel = this.fuel - gasGasta; // this.fuel -= gasGasto
	System.out.printf("Seu carro andou %.1f km!\n", distanciaDesejada);
}

public void reabastecer (double gasQtd) {
	double reabastecimento = (this.fuel + gasQtd);
	this.fuel = reabastecimento;
	System.out.print("Você reabasteceu %.1f litro(s)!\n");
}

}
