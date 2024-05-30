package lista07;

import java.util.ArrayList;
import java.util.Scanner;

import lista07.entities.Conta;

public class Banco {
static Conta clienteAtual = null;
	public static void main(String[] args) throws InterruptedException {
		ArrayList<Conta> contas = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Integer act = null;

		do {
			System.out.println("\n1. Cadastrar Conta");
			System.out.println("2. Realizar depósito (procurar pelo nome do cliente)");
			System.out.println("3. Realizar saque (procurar pelo nome do cliente)");
			System.out.println("4. Verificar saldo (procurar pelo nome do cliente)");
			System.out.println("5. Consultar Cliente (Mostrar nome e a conta do cliente)");
			System.out.println("0. Sair");
			System.out.println("Digite uma opção:");
			act = sc.nextInt();
			sc.nextLine();

			switch (act) {
			case 1:
				clienteAtual = Banco.cadastrarConta(contas, sc);
				break;
			case 2:
				System.out.println(Banco.realizarDeposito(contas, sc));
				break;
			case 3:
				System.out.println(Banco.realizarSaque(contas, sc));
				break;
			case 4:
				System.out.println(Banco.saldo(contas, sc));
				break;
			case 5:
				System.out.println(Banco.consultarCliente());
				break;
			case 0:
				System.out.println("Encerrado!");
			}

		} while (act != 0);
		sc.close();
	}

	public static Conta cadastrarConta(ArrayList<Conta> contas, Scanner cadastro) {
		System.out.println("Digite o numero da conta do cliente");
		String numero = cadastro.nextLine();
		System.out.println("Digite o nome da agencia do cliente");
		String agencia = cadastro.nextLine();

		for (Conta validacao : contas) {
			if (validacao.getAgencia().equals(agencia) && validacao.getNumero().equals(numero)) {
				System.out.println("Conta já registrada!");
				return null;
			}
		}

		System.out.println("Digite o nome do cliente");
		String nome = cadastro.nextLine();
		System.out.println("Digite o saldo do cliente");
		double saldo = cadastro.nextDouble();

		Conta novoCliente = new Conta(numero, agencia, nome, saldo);
		contas.add(novoCliente);
		clienteAtual = novoCliente;
		return novoCliente;
	}

	public static String realizarDeposito(ArrayList<Conta> contas, Scanner scanner) throws InterruptedException {
		System.out.println("Digite o nome do cliente que voce deseja realizar o deposito");
		String nome = scanner.nextLine();
		for (Conta cliente : contas) {
			if (cliente.getNome().equals(nome)) {
				System.out.printf("Quanto você deseja despositar na conta do cliente '%s'?\n", nome);
				double quantia = scanner.nextDouble();
				Thread.sleep(1000);
				System.out.println("Calculando ");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(".\n");
				Thread.sleep(1000);
				double deposito = quantia + cliente.getSaldo();
				cliente.setSaldo(deposito);
				clienteAtual = cliente;
				return String.format("Voce depositou R$ %.2f\n", quantia);
			}
		}
		return String.format("O cliente '%s' ainda nao foi cadastrado1\n", nome);
	}

	public static String realizarSaque(ArrayList<Conta> contas, Scanner scanner) throws InterruptedException {
		System.out.println("Digite o nome do cliente que voce deseja realizar o saque");
		String nome = scanner.nextLine();

		for (Conta cliente : contas) {
			if (cliente.getNome().equals(nome)) {
				System.out.printf("Quanto você deseja sacar da conta do cliente '%s'?\n", nome);
				double quantia = scanner.nextDouble();
				Thread.sleep(1000);
				System.out.print("Calculando ");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(".\n");
				Thread.sleep(1000);
				double saque = cliente.getSaldo() - quantia;
				cliente.setSaldo(saque);
				clienteAtual = cliente;
				return String.format("Voce sacou R$ %.2f \n", quantia);
			}

		}
		return String.format("O cliente '%s' ainda nao foi cadastrado1\n", nome);
	}

	public static String saldo (ArrayList<Conta> contas, Scanner scanner) throws InterruptedException {
		System.out.println("Digite o nome do cliente que voce deseja visualizar o saque");
		String nome = scanner.nextLine();

		for (Conta cliente : contas) {
			if (cliente.getNome().equals(nome)) {
				clienteAtual = cliente;
				return String.format("Saldo do cliente %s : R$ %.2f\n", cliente.getNome(), cliente.getSaldo());
			}
		}
		return String.format("O cliente '%s' ainda nao foi cadastrado!\n", nome);
	}
	
	public static String consultarCliente() {
		return String.format("Nome = '%s', Numero = %s", clienteAtual.getNome(), clienteAtual.getNumero());
	}

}
