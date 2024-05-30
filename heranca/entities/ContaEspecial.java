package heranca.entities;

public class ContaEspecial extends ContaBancaria {

	private double limite;

	public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
		super(nomeCliente, numConta, saldo);
		this.limite = (-limite);
	}

	public void sacar(double valor) {
		if (saldo - valor < limite) {
			System.out.println("Limite atingido!");
			return;
		}

		saldo -= valor;
		System.out.println("Você sacou R$ " + valor);
	}

	public String toString() {
		return "\nContaEspecial [limite = " + limite + ", nomeCliente = " + nomeCliente + ", numConta = " + numConta
				+ ", saldo = " + saldo + "]";
	}

}
