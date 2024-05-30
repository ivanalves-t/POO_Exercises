package lista08;

import java.util.ArrayList;
import java.util.Scanner;

import lista08.entities.Conta;

public class SistemaBancario {
	public static void main(String[] args) {
		ArrayList<Conta> contas = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Integer act = null;

		do {
			System.out.println("\n1. Cadastrar Conta\r\n" + "2. Realizar depósito (Buscar pelo CPF do cliente)\r\n"
					+ "3. Realizar saque (Buscar pelo CPF do cliente)\r\n"
					+ "4. Verificar saldo (Buscar pelo CPF do cliente)\r\n"
					+ "5. Consultar número e nome da agência (Mostrar nome e o CPF do cliente)\r\n"
					+ "6. Alterar o número e nome da agência (Buscar pelo nome do cliente)\r\n" + "0. Sair");
			System.out.println("Digite uma opção:");
			act = sc.nextInt();
			sc.nextLine();

			switch (act) {
			case 1:
				if (contas.size() == 10) {
					System.out.println("Limite de contas atingido!");
					break;
				}
				cadastrarConta(contas, sc);
				break;
			case 2:
				realizarDeposito(contas, sc);
				break;
			case 3:
				saque(contas, sc);
				break;
			case 4:
				Double valor = saldo(contas, sc);
				if (valor == Double.NaN) {
					System.out.println("Conta não cadastrada!");
					break;
				}
				System.out.printf("Saldo= R$ %.2f", valor);
				break;
			case 5:
				String[] busca = new String[2];
				busca = consulta(contas, sc);
				if (busca[0].equals(null) || busca[1].equals(null)) {
					System.out.println("Cliente não cadastrado");
					break;
				}
				System.out.printf("Numero '%s', agencia '%s' ", busca[0], busca[1]);
				break;
			case 6:
				alterarDados(contas, sc);
			case 0:
				System.out.println("Encerrando ...");
				break;
			}

		} while (act != 0);
		sc.close();
	}

	public static void cadastrarConta(ArrayList<Conta> contas, Scanner sc) {
		System.out.println("Dados do Banco:");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Numero da agencia do Banco");
		var numero = sc.nextLine();
		System.out.println("Nome da agencia do Banco");
		var nomeBanco = sc.nextLine();
		System.out.println("\nDados do Cliente");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Nome do Cliente");
		var nome = sc.nextLine();
		System.out.println("CPF do Cliente");
		var CPF = sc.nextLine();
		System.out.println("Saldo");
		var saldo = sc.nextDouble();
		String[] banco = { numero, nomeBanco };
		String[] cliente = { nome, CPF };

		for (Conta conta : contas) {
			if (conta.getCliente()[0].equals(nome) && conta.getCliente()[1].equals(CPF)) {
				System.out.println("Cliente já cadastrado!");
				return;
			}
		}
		Conta novaConta = new Conta(numero, banco, cliente, saldo);
		contas.add(novaConta);
	}

	public static void realizarDeposito(ArrayList<Conta> contas, Scanner sc) {
		System.out.println("Digite o cpf do cliente que voce deseja realizar depósito");
		String cpf = sc.nextLine();
		for (Conta conta : contas) {
			String[] busca = conta.getCliente();

			if (cpf.equals(busca[1])) {
				System.out.println("Digite quando você deseja depositar na conta");
				double deposito = sc.nextDouble();
				conta.setSaldo(conta.getSaldo() + deposito);
				System.out.printf("Você depositou R$ %.2f", deposito);
				return;
			}
		}
		System.out.println("CPF não cadastrado no sistema!");
		return;
	}

	public static void saque(ArrayList<Conta> contas, Scanner sc) {
		System.out.println("Digite o cpf do cliente que voce deseja realizar o saque");
		String cpf = sc.nextLine();
		for (Conta conta : contas) {

			if (!cpf.equals(conta.getCliente()[1])) {
				System.out.println("CPF não cadastrado no sistema!");
				return;
			}
			System.out.println("Digite a quantia para saque");
			var saque = sc.nextDouble();
			conta.setSaldo(conta.getSaldo() - saque);
			System.out.println("Você sacou R$ " + saque);
		}
	}

	public static Double saldo(ArrayList<Conta> contas, Scanner sc) {
		Double valor = Double.NaN;
		System.out.println("Digite o cpf do cliente que voce deseja realizar o saque");
		var cpf = sc.nextLine();
		for (Conta conta : contas) {

			if (!cpf.equals(conta.getCliente()[1])) {
				System.out.println("CPF não cadastrado no sistema!");
				return valor;
			}
			valor = conta.getSaldo();
		}
		return valor;
	}

	public static String[] consulta(ArrayList<Conta> contas, Scanner sc) {
		String[] dados = new String[2];
		System.out.println("Digite o nome do cliente");
		var nome = sc.nextLine();
		System.out.println("Digite o CPF do cliente");
		var cpf = sc.nextLine();

		for (Conta conta : contas) {
			if (conta.getCliente()[0].equals(nome) && conta.getCliente()[1].equals(cpf)) {
				dados = conta.getBanco();
				return dados;
			}
		}
		System.out.println("Cliente não cadastrado!");
		return dados;
	}

	public static void alterarDados(ArrayList<Conta> contas, Scanner sc) {
		System.out.println("Digite o nome do cliente para alteração de dados");
		String alterar[] = new String[2];
		String nome = sc.nextLine();
		for (Conta conta : contas) {
			if (nome.equals(conta.getCliente()[0])) {
				System.out.println("Digite o novo numero da conta");
				alterar[0] = sc.nextLine();
				System.out.println("Digite o novo nome da agencia");
				alterar[1] = sc.nextLine();

				conta.setBanco(alterar);
				return;
			}
		}
		System.out.println("Cliente não cadastrado!");
	}
}
