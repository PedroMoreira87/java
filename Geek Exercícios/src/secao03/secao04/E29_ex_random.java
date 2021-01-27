package secao04;

import java.util.Random;
import java.util.Scanner;

public class E29_ex_random {
    public static void main(String[] args){

        int a;
        int b;
        int c;
        int contador = 0;

        for (int i = 0; i < 5; i++){
            Random gerador = new Random();
            //random.nextInt(max - min + 1) + min
            a = gerador.nextInt(100 - 1 + 1) + 1;
            b = gerador.nextInt(100 - 1 + 1) + 1;
            c = a + b;
            System.out.printf("O valor de A é: %d\n", a);
            System.out.printf("O valor de B é: %d\n", b);

            Scanner scan = new Scanner(System.in);
            System.out.println("Qual é a soma de A + B? ");
            int valor = scan.nextInt();
            if(a + b == valor){
                System.out.println("Você acertou!");
                contador ++;
            }else{
                System.out.printf("Você errou!\nA resposta é: %d\n", c);
            }
            System.out.println("==============================");
        }
        System.out.printf("Número de acertos: %d\n", contador);
        System.out.println("==============================");
    }
}
