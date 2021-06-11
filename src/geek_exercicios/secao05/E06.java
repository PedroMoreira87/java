package secao05;

import java.util.Scanner;

public class E06 {

    public static void main(String[] Args){

        int num;
        double soma = 0;
        int media = 10;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < media; i++){

            System.out.println("Digite um número: ");
            num = scan.nextInt();

            soma += num;
        }

        System.out.printf("A média é: %.2f", soma/media);
    }
}
