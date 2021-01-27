package secao03;

import java.util.Scanner;

public class E40 {
	
	public static void main(String[] args) {
		
		int diasTrab;
		
		Scanner valores = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de dias trabalhados: ");
		diasTrab = valores.nextInt();
		
		float ir = 0.92f; 
		float salario = diasTrab * 30 * ir;
		
		System.out.println("O salário liquido é: " + salario);
		
		valores.close();
	}
	
}
