package secao04;

import java.util.Scanner;

public class E21 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha a opção: ");
        System.out.println("1 - Soma de 2 números.");
        System.out.println("2 - Diferença entre 2 números.");
        System.out.println("3 - Produto entre 2 números.");
        System.out.println("4 - Divisão entre 2 números.");

        int menu = scan.nextInt();

        System.out.println("Digite o primeiro valor: ");
        double n1 = scan.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double n2 = scan.nextDouble();


        switch(menu){
            case 1:
                System.out.printf("Total: %.2f", n1 + n2);
                break;
            case 2:
                if(n1 < n2){
                    System.out.printf("Total: %.2f", n2 - n1);
                }else
                    System.out.printf("Total: %.2f", n1 - n2);
                break;
            case 3:
                System.out.printf("Total: %.2f", n1 * n2);
                break;
            case 4:
                if(n2 > 0){
                    System.out.printf("Total: %.2f", n1 / n2);
                }else
                    System.out.println("Erro, denominador menor que 0");
                break;
            default:
                System.out.println("Valor incorreto");
                break;
        }
    }
}
