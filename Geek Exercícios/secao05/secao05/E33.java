package secao05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class E33 {
    public static void main(String[] Args){
        int n, i, j, guardador, contador = 0;
        ArrayList<Integer> arrList = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor de n: ");
        n = scan.nextInt();
        System.out.println("Digite o valor de i: ");
        i = scan.nextInt();
        System.out.println("Digite o valor de j: ");
        j = scan.nextInt();

        if (i != 0 && j != 0) {
            for (int x = 0; x < n; x++) {
                if (contador % i == 0 || contador % j == 0){
                        guardador = i;
                        i = contador;
                        arrList.add(i);
                        contador++;
                        i = guardador;
            }else{
                    contador ++;
                    x --;
                }
        }
    }
        Collections.sort(arrList);
        System.out.println(arrList);
    }
}
