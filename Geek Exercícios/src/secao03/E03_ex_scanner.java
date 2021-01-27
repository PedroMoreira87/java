package secao03;

import java.util.Scanner;

public class E03_ex_scanner {

	public static void main(String[] args) {

		int num1;
		int num2;
		int num3;


		Scanner scan = new Scanner(System.in);

		System.out.println("Informe 3 valores inteiros: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		int num4 = num1 + num2 + num3;

		System.out.println("A soma dos valores é: " + num4);

		scan.close();
	}

}
