package secao03;

import java.util.Scanner;

public class E42 {

	public static void main(String[] args) {
		
		float salarioBase;
		
		Scanner valores = new Scanner(System.in);
		
		System.out.println("Qual o seu salario base? ");
		salarioBase = valores.nextFloat();
		
		float receber = salarioBase * 1.05f - (salarioBase * 0.07f);
		
		System.out.println("Valor a receber: R$" + receber);
		
		valores.close();
	}

}
