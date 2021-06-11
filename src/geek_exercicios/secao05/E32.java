package secao05;

import java.util.Random;
import java.util.Scanner;

public class E32 {
    public static void main(String[] Args){

        int d1 = 0;
        int d2 = 0;
        int n;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantas vezes serão lançados os dados: ");
        n = scan.nextInt();

        Random rand = new Random(); //instance of random class
        int max = 101; //generate random values from 0-100

        int contador = 0;
        for (int i = 0; i < n; i++){
            d1 = rand.nextInt(max);
            d2 = rand.nextInt(max);
            contador += 1;
            if (d1 < d2){
                System.out.printf("Lançamento %d:\n D1: %d < D2: %d\n",contador, d1, d2);
            }else if (d1 > d2){
                System.out.printf("Lançamento %d:\n D1: %d > D2: %d\n",contador, d1, d2);
            }else{
                System.out.printf("Lançamento %d:\n D1: %d = D2: %d\n",contador, d1, d2);
            }
        }
    }
}
