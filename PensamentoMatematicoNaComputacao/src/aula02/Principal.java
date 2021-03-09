package aula02;

import java.util.Scanner;

public class Principal {
	static Scanner sc = new Scanner(System.in);
	static boolean a;
	static boolean b;

	//core
	public static void main(String[] args) {

		TabelaVerdade tabelaVerdade = new TabelaVerdade();// instanciei a classe TabelaVerdade e criei um objeto chamado tabelaVerdade
		int opcao;
		
		do {
			System.out.println("Escolha a operação:\n1-e\n2-ou\n3-implicação\n4-bicondicional");
			opcao = sc.nextInt();// sc.nextInt() = faz leitura do teclado; int opcao = armazena a leitura do teclado

			switch(opcao) {		
			case 1:
				leituraTeclado();
				tabelaVerdade.operacaoE(a, b);
				break;
			case 2:
				leituraTeclado();
				tabelaVerdade.operacaoOU(a, b);
				break;
			case 3:
				leituraTeclado();
				tabelaVerdade.operacaoImplicacao(a, b);
				break;
			case 4:
				leituraTeclado();
				tabelaVerdade.operacaoBicondicional(a, b);
				break;
			default:
				System.out.println("Valor incorreto");
				break;
			}

			System.out.println("Deseja realizar outra operação? 1-sim; 2-não");
			opcao = sc.nextInt();
		}while(opcao==1);
	}

	public static void leituraTeclado() {
		System.out.println("Digite true ou false para A:");
		a = sc.nextBoolean();

		System.out.println("Digite true ou false para B:");
		b = sc.nextBoolean();
	}
}