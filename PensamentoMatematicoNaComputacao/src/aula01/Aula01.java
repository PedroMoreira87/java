package aula01;

import java.util.Scanner;

public class Aula01 {

	public static void main(String[] args) {
		try (Scanner leitura = new Scanner (System.in)) {
			System.out.println("Digite o valor verdade de A");
			boolean a = leitura.nextBoolean();
			
			System.out.println("Digite o valor verdade de B");
			boolean b = leitura.nextBoolean();
			
			//tabela verdade do ^
			if ( a == true && b == true) {
				System.out.println("O resultado de A ^ B = verdadeiro");
			} else
				if(a == true && b == false) {
					System.out.println("O resultado de A ^ B = falso");
				}
		}
	}

}
