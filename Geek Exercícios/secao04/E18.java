package secao04;

import java.util.Scanner;

public class E18 {
    static public void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Calculadora Básica: ");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int menu = scan.nextInt();

        System.out.println("Digite o primeiro valor: ");
        double n1 = scan.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double n2 = scan.nextDouble();

        switch (menu){
            case 1:
                System.out.printf("Total: %.2f", (n1+n2));
                break;
            case 2:
                System.out.printf("Total: %.2f", (n1-n2));
                break;
            case 3:
                System.out.printf("Total: %.2f", (n1*n2));
                break;
            case 4:
                System.out.printf("Total: %.2f", (n1/n2));
                break;
            default:
                System.out.println("Valor incorreto");
                break;
        }
    }
}
