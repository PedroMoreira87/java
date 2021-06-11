package secao05;

import java.util.Scanner;

public class E24 {

    public static void main(String[] Args){

        int num;
        int divisores = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num = scan.nextInt();

        for (int i = 1; i < num; i++){
            if (num % i == 0){
                divisores += i;

            }
        }
        System.out.println(divisores);
    }
}
