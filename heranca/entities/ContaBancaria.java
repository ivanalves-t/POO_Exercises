package heranca.entities;

public class ContaBancaria {

	protected String nomeCliente;
	protected String numConta;
	protected double saldo;

	public ContaBancaria(String nomeCliente, String numConta, double saldo) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public void sacar(double valor) {
		if (saldo - valor <= 0) {
			System.out.println("Saldo insuficiente!");
			return;
		}
		saldo -= valor;
		System.out.println("Você sacou R$ " + valor);
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

}
