package secao04;

import java.util.Scanner;

public class E36 {

    public static void venda() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o valor da venda? ");
        double venda = scan.nextDouble();

        if (venda >= 100000) {
            System.out.printf("Comissão: R$%.2f", 700 + (0.16 * venda));
        } else if (venda < 100000 && venda >= 80000) {
            System.out.printf("Comissão: R$%.2f", 650 + (0.14 * venda));
        } else if (venda < 80000 && venda >= 60000) {
            System.out.printf("Comissão: R$%.2f", 600 + (0.14 * venda));
        } else if (venda < 60000 && venda >= 40000) {
            System.out.printf("Comissão: R$%.2f", 550 + (0.14 * venda));
        } else if (venda < 40000 && venda >= 20000) {
            System.out.printf("Comissão: R$%.2f", 500 + (0.14 * venda));
        } else if (venda < 20000) {
            System.out.printf("Comissão: R$%.2f", 400 + (0.14 * venda));
        } else {
            System.out.println("Valor incorreto");
        }
    }

    public static void main(String[] args) {

        venda();
    }
}
