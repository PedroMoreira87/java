package secao05;

import java.util.Scanner;

public class E05 {

    public static void main(String[] Args){

        int num;
        int soma = 0;

       Scanner scan = new Scanner(System.in);

       for (int i = 0; i < 10; i++){

           System.out.println("Digite um valor: ");
           num = scan.nextInt();
           soma += num;

       }
        System.out.printf("A soma é: %d", soma);
    }
}
