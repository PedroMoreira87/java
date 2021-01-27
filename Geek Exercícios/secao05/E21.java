package secao05;

import java.util.Scanner;

public class E21 {

    public static void main(String[] Args){

        int num1;
        int num2;
        int soma = 0;
        int mult = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        num1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = scan.nextInt();

        for (int i = num1; i <= num2; i++){
            if (i % 2 == 0){
                soma += i;
            }if (i % 2 != 0){
                mult *= i;
            }
        }
        System.out.println(soma);
        System.out.println(mult);
    }
}
