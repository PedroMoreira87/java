package secao05;

import java.util.Scanner;

public class E23 {

    public static void main(String[] Args){

        int num;
        int divisores;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num =  scan.nextInt();

        if (num > 0){
            for (int i = 1; i <= num; i ++){
                if (num % i == 0){
                    divisores = i;
                    if (i == num){
                        System.out.println(divisores);
                    }else{
                        System.out.print(divisores + ", ");
                    }
                }
            }
        }else{
            System.out.println("Favor digitar um número inteiro positivo");
        }
    }
}
