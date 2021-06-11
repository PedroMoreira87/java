package secao05;

import java.util.Scanner;

public class E28 {
    public static void main(String[] Args){

        int n;
        double e = 0;
        double fact = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro e positivo: ");
        n = scan.nextInt();

        if (n > 0){
            for (int i = 1; i <= n; i++){
                fact *= i;
                e += 1/fact;
            }
        }
        else{
            System.out.println("Digite um número inteiro e positivo");
        }
        System.out.printf("%.2f", e);
    }
}
