package secao03;

import java.util.Scanner;

public class E44_ex_printf {

	public static void main(String[] args) {

		float alturaDegrau;
		float alturaDesejo;
		
		Scanner valores = new Scanner(System.in);
		
		System.out.println("Digite a altura do degrau: ");
		alturaDegrau = valores.nextFloat();
		System.out.println("Digite a altura que deseja alcançar subindo a escada: ");
		alturaDesejo = valores.nextFloat();
		
		float objetivo = alturaDesejo / alturaDegrau;
		
		System.out.printf("O usuário deverá subir %.0f degraus para atingir o seu objetivo", objetivo);
		
		valores.close();
	}

}
