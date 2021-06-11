package secao05;

import java.util.Scanner;

public class E26 {
    public static void main (String[] Args){

        int num;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num = scan.nextInt();

        for (int i = num; i < 100; i++){
            if (i % 11 == 0 | i % 13 == 0 | i % 17 == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
