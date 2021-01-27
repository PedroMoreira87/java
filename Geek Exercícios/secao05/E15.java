package secao05;

import java.util.Scanner;

public class E15 {
    public static void main(String[] Args){

        int num;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo ímpar: ");
        num = scan.nextInt();

        if (num > 0 && num % 2 != 0){
            for (int i = 1; i <= num; i++){
                if (i % 2 != 0 & i < num){
                    System.out.print(i + ", ");
                }if (i == num){
                    System.out.print(i);
                }
            }
        }else{
            System.out.println("Favor digitar um número inteiro positivo ímpar");
        }
    }
}
