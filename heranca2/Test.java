package heranca2;

import java.util.Scanner;

import heranca2.entities.Animal;
import heranca2.entities.Assistente;
import heranca2.entities.AssistenteTecnico;
import heranca2.entities.Cachorro;
import heranca2.entities.CamaroteInferior;
import heranca2.entities.CamaroteSuperior;
import heranca2.entities.Funcionario;
import heranca2.entities.Gato;
import heranca2.entities.Imovel;
import heranca2.entities.ImovelNovo;
import heranca2.entities.ImovelVelho;
import heranca2.entities.Ingresso;
import heranca2.entities.IngressoNormal;
import heranca2.entities.Miseravel;
import heranca2.entities.Pobre;
import heranca2.entities.Rica;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario assistente = new Assistente("123A", "Joao");
		Funcionario assistenteTec = new AssistenteTecnico("1313", "José", 1500.00);

		System.out.println(
				"Matricula assistente 1: " + assistente.getMatricula() + ". Nome assistente1: " + assistente.getNome());
		System.out.println(
				"Matricula tecnico1: " + assistenteTec.getMatricula() + ". Nome tecnico1: " + assistenteTec.getNome());

		Animal animal1 = new Cachorro("Joaozin", "Hotwiller");
		Animal animal2 = new Gato("Garfield", "Pedres");

		System.out.println("\n" + animal1.somAnimal() + ". " + animal1.caminha());
		System.out.println(animal2.somAnimal() + ". " + animal2.caminha());

		Rica pessoa1 = new Rica();
		pessoa1.setNome("Maria");
		pessoa1.setIdade(47);
		Pobre pessoa2 = new Pobre();
		pessoa2.setNome("Joao");
		pessoa2.setIdade(32);
		Miseravel pessoa3 = new Miseravel();
		pessoa3.setNome("Zefa");
		pessoa3.setIdade(59);
		pessoa2.trabalha();
		pessoa3.mendiga();
		pessoa1.fazCompras();

		System.out.println("=-=-=-==-=-=-=-==-=-=-=-=-=PARTE INTERATIVA-=-=-=-=-=-=-=-=-=-=");
		System.out.print("\nNormal ou VIP (1/2)? ");
		int n = sc.nextInt();

		switch (n) {
		case 1:
			Ingresso normal = new IngressoNormal(500.00);
			System.out.println("Você pegou um ingresso normal\n" + normal.imprimeValor());
			break;
		case 2:
			System.out.print("Camarote superior ou camarote inferior (1/2)? ");
			int n2 = sc.nextInt();
			if (n2 == 1 || n2 == 2) {
				if (n2 == 1) {
					Ingresso camaroteSup = new CamaroteSuperior(500.00, 400.00);
					System.out
							.println("\nVocê pegou um ingresso com Camarote superior.\n" + camaroteSup.imprimeValor());
					break;
				}
				if (n2 == 2) {
					Ingresso camaroteInf = new CamaroteInferior(500.00, "Bloco A1");
					System.out
							.println("\nVocê pagou um ingresso com Camarote inferior.\n" + camaroteInf.imprimeValor());
				}
			} else {
				System.out.println("Digite 1 ou 2 apenas");
			}
			break;
		default:
			System.out.println("Digite apenas 1 ou 2");
		}
		
		System.out.println("\n=-=-=-=-=-==-=-=-=PARTE INTERATIVA-=-=-=-===-=-==-==-");
		System.out.print("Digite 1 para criar um imovel novo e 2 para criar um imovel velho ");
		int num = sc.nextInt();
		
		if (num == 1) {
			Imovel imovel1 = new ImovelNovo("Rua dos bobos, n0");
			System.out.println("Valor do imóvel: R$" + imovel1.valor());
		}
		if (num == 2) {
			Imovel imovel2 = new ImovelVelho("Rua dos bobos, n0");
			System.out.println("Valor do imóvel: R$" + imovel2.valor());
		}
		sc.close();
	}
}
