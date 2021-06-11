package secao04;

import java.util.Scanner;

public class E05 {
    public static void main(String[] args){

        Scanner valores = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = valores.nextInt();

        if (num % 2 == 0){
            System.out.printf("O número %d é par", num);
        }else{
            System.out.printf("O número %d é impar", num);
        }
    }
}
