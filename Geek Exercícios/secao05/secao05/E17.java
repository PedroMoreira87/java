package secao05;

import java.util.Scanner;

public class E17 {

    public static void main(String[] Args){

        int num;
        int soma = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        num =  scan.nextInt();

        if (num > 0){
            for (int i = 0; i <= num; i++){
                soma += i;
            }
            System.out.println(soma);
        }else{
            System.out.println("Favor digitar um número inteiro positivo");
        }
    }
}
