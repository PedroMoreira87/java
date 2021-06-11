package secao05;

import java.util.Scanner;

public class E27 {
    public static void main (String[] Args){

        int n;
        double h = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro e positivo: ");
        n = scan.nextInt();

        if (n > 0){
            for (double i = 1; i <= n; i++){
                h += 1/i;
            }
        }
        else{
            System.out.println("Digite um número inteiro e positivo");
        }
        System.out.printf("%.2f", h);
    }
}
