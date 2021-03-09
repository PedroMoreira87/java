package aula05;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TabelaVerdade tabelaverdade = new TabelaVerdade();

		System.out.println("Digite uma sentença: ");
		String sentenca = scanner.nextLine();

		System.out.println("Tamanho da string: " + sentenca.length());

		if (sentenca.length() == 3) {
			if(sentenca.substring(1,2).equals("^"))
				tabelaverdade.imprimir(5);
			else if(sentenca.substring(1,2).equals("v")) {
				tabelaverdade.imprimir(6);
			}
		}else if(sentenca.length() == 4) {
			tabelaverdade.imprimir(4);
		}else if(sentenca.length() == 5) {
			tabelaverdade.imprimir(7);
		}
	}
}
