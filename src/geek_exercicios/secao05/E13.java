package secao05;

import java.util.Scanner;

public class E13 {
    public static void main(String[] Args){

        int num;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo par: ");
        num = scan.nextInt();

        if (num > 0 & num % 2 == 0){
            for(int i = 0; i < num + 1; i++){
                if (i < num & i % 2 == 0){
                    System.out.print(i + ", ");
                }if(i == num & i % 2 == 0){
                    System.out.print(i);
                }
            }
        }else{
            System.out.println("Favor digitar um número inteiro positivo par");
        }
    }
}
