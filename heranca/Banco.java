package heranca;

import java.util.ArrayList;
import java.util.Scanner;

import heranca.entities.ContaBancaria;
import heranca.entities.ContaEspecial;
import heranca.entities.ContaPoupanca;

public class Banco {

	public static void main(String[] args) {
		ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();
		Banco banco = new Banco();
		Scanner sc = new Scanner(System.in);
		String act = null;

		do {
			System.out.println("\n" + "1 Incluir dados relativos a conta de um cliente (Limitado a 5 contas);\r\n"
					+ "2 Sacar um determinado valor de uma conta (Procure pelo número da conta);\r\n"
					+ "3 Depositar um determinado valor na sua conta (Procure pelo número da conta);\r\n"
					+ "4 Mostrar o novo saldo do cliente, a partir da taxa de rendimento, daqueles que\r\n"
					+ "possuem conta poupança;\r\n" + "5 Mostrar os dados de todas as contas cadastradas."
					+ "\n0 Encerrar programa");
			System.out.println("Digite uma opção:");
			act = sc.next();
			sc.nextLine();

			switch (act) {
			case "1":
				if (contas.size() == 5) {
					System.out.println("Limite de contas atingido!");
					break;
				}
				banco.criarConta(contas, sc);
				break;
			case "2":
				System.out.println("Digite o numero da conta");
				var numConta = sc.nextLine();
				System.out.println("Digite o valor para saque:");
				var saque = sc.nextDouble();
				for (ContaBancaria contaBancaria : contas) {
					if (contaBancaria.getNumConta().equals(numConta)) {
						banco.sacar(contas, numConta, saque);
						break;
					}
				}
				System.out.println("Conta não encontrada");
				break;
			case "3":
				if (contas.size() == 0) {
					System.out.println("Nenhuma conta cadastrada!");
					break;
				}
				System.out.println("Digite o numero da conta do cliente");
				var numConta_d = sc.next();
				System.out.println("Digite o valor que você deseja depositar");
				var deposito = sc.nextDouble();
				banco.depositarValor(contas, numConta_d, deposito);
				break;
			case "4":
				if (contas.size() == 0) {
					System.out.println("Nenhuma conta cadastrada!");
					break;
				}
				banco.renda(contas, sc);
				break;
			case "5":
				if (contas.size() == 0) {
					System.out.println("Nenhuma conta cadastrada!");
					break;
				}
				System.out.println("Contas cadastradas:");
				for (ContaBancaria conta : contas) {
					System.out.println(conta.toString());
				}
				break;
			case "0":
				System.out.println("Encerrando ...");
				break;
			}

		} while (!act.equals("0"));
		sc.close();
	}

	public void criarConta(ArrayList<ContaBancaria> contas, Scanner sc) {
		ContaBancaria novaConta = null;

		System.out.println("Digite o nome do novo cliente");
		String nomeCliente = sc.nextLine();
		System.out.println("Digite o numero da conta do novo cliente");
		String numCliente = sc.next();
		System.out.println("Digite o saldo inicial do cliente");

		for (ContaBancaria conta : contas) {
			if (conta.getNomeCliente().equals(nomeCliente) || conta.getNumConta().equals(numCliente)) {
				System.out.println("Conta já existente!");
				return;
			}
		}

		double saldo = sc.nextDouble();
		sc.nextLine();

		boolean entradaValida = false;

		do {
			System.out.println("Digite o tipo de conta que deseja" + "\n1. para criar uma conta Poupanca"
					+ "\n2. para conta Especial");
			String tipo = sc.nextLine();

			switch (tipo) {
			case "1":
				System.out.println("Digite a quantidade de dias de rendimento");
				int diasRendimento = sc.nextInt();

				novaConta = new ContaPoupanca(nomeCliente, numCliente, saldo, diasRendimento);
				entradaValida = true;
				break;
			case "2":
				System.out.println("Digite o valor absoluto do limite da sua conta");
				double limite = sc.nextDouble();

				novaConta = new ContaEspecial(nomeCliente, numCliente, saldo, limite);
				entradaValida = true;
				break;
			default:
				System.out.println("Opção inválida!\n");
				break;
			}
		} while (entradaValida == false);
		System.out.println("Nova conta criada!\n");
		contas.add(novaConta);
		return;
	}

	public void sacar(ArrayList<ContaBancaria> contas, String numConta, double valor) {

		for (ContaBancaria conta : contas) {
			if (conta.getNumConta().equals(numConta)) {
				if (conta instanceof ContaEspecial) {
					((ContaEspecial) conta).sacar(valor);;
					return;
				}

				if (conta instanceof ContaPoupanca) {
					((ContaPoupanca) conta).sacar(valor);;
					return;
				}
			}
		}
		System.out.println("Conta não cadastrada!");
		return;
	}

	public void depositarValor(ArrayList<ContaBancaria> contas, String numConta, double valor) {

		for (ContaBancaria conta : contas) {
			if (conta.getNumConta().equals(numConta)) {
				conta.depositar(valor);
				return;
			}
		}
		System.out.println("Conta não cadastrada!");
	}

	public void renda(ArrayList<ContaBancaria> contas, Scanner sc) {
		System.out.println("Digite o numero da conta:");
		String numConta = sc.nextLine();

		for (ContaBancaria conta : contas) {
			if (conta instanceof ContaPoupanca && conta.getNumConta().equals(numConta)) {
				System.out.println("Digite a taxa de rendimento da conta: ");
				((ContaPoupanca) conta).calcularNovoSaldo(sc.nextDouble());
				return;
			}
		}
		System.out.println("Conta inexistente ou do tipo Especial");
		return;
	}
}
