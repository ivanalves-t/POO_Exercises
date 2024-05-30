package lista07.entities;

public class Conta {
	private String numero; 
	private String agencia;
	private String nome;
	private double saldo;
	
	public Conta(String numero, String agencia, String nome, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.nome = nome;
		this.saldo = saldo;
	}


	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public String getNome() {
		return nome;
	}
	
	
	public String toString() {
		return "Conta [numero= " + numero + ", agencia= " + agencia + ", nome= " + nome + ", saldo= " + saldo + "]";
	}
}
