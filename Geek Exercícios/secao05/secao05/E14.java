package secao05;

import java.util.Scanner;

public class E14 {
    public static void main(String[] Args){

        int num;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo par: ");
        num = scan.nextInt();

        if(num > 0 & num % 2 == 0){
            for(int i = num; i >= 0; i--){
                if(i % 2 == 0 & i > 0){
                    System.out.print(i + ", ");
                }if(i == 0){
                    System.out.print(i);
                }
            }
        }else{
            System.out.println("Favor digitar um número inteiro positivo par");
        }
    }
}
