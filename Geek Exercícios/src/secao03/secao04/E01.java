package secao04;

import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner valores = new Scanner(System.in);

        System.out.println("Informe 2 números: ");
        double num1 = valores.nextDouble();
        double num2 = valores.nextDouble();

        if (num1 > num2){
            System.out.printf("O maior número é: %.2f", num1);
        }else {
            System.out.printf("O maior número é: %.2f", num2);
        }
    }
}
