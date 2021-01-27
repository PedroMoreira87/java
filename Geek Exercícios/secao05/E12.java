package secao05;

import java.util.Scanner;

public class E12 {

    public static void main(String[] Args){

        int num;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        num = scan.nextInt();

        if(num > 0){
            for(int i = 0; i <= num; i++){
                if(i < num){
                    System.out.print((num - i) + ", ");
                }else{
                    System.out.print(num - i);
                }
            }
        }else{
            System.out.println("Favor digitar um número inteiro positivo");
        }
    }
}
