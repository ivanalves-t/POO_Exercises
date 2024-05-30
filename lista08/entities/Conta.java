package lista08.entities;

public class Conta {
private String numero;
private String [] banco = new String [2];
private String [] cliente = new String [2];
private double saldo;

public Conta (String numero, String[] banco, String[] cliente, double saldo) {
	this.numero = numero;
	this.banco = banco;
	this.cliente = cliente;
	this.saldo = saldo;
}

public String getNumero () {
	return numero;
}

public double getSaldo() {
	return saldo;
}

public String[] getBanco() {
	return banco;
}

public String[] getCliente() {
	return cliente;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}

public void setBanco (String [] banco) {
	this.banco = banco;
}

}

