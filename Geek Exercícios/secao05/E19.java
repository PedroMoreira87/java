package secao05;

import java.util.Scanner;

public class E19 {

    public static void main(String[] Args){

        int num;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro entre 100 e 999: ");
        num = scan.nextInt();

        if (num > 100 & num < 999){
            for (int i = 0; i < 3; i++){
                System.out.println(num % 10);
                num = num / 10;
            }
        }else{
            System.out.println("Favor digitar um número inteiro entre 100 e 999");
        }
    }
}
