package heranca.entities;

public class ContaPoupanca extends ContaBancaria {
	private double diasRendimento;

	public ContaPoupanca(String nomeCliente, String numConta, double saldo,
			int diasRendimento) {
		super(nomeCliente, numConta, saldo);
		this.diasRendimento = diasRendimento;
	}
	
	public void calcularNovoSaldo (double taxaAnual) {
		double rendimento = saldo * (taxaAnual/365) * diasRendimento;
		saldo += rendimento;
		System.out.printf("Novo saldo = R$ %.2f\n", saldo);
	}

	public String toString() {
		return "ContaPoupanca [diasRendimento = " + diasRendimento + ", nomeCliente = " + nomeCliente + ", numConta = "
				+ numConta + ", saldo = " + saldo + "]";
	}
	

}
