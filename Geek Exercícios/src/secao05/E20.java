package secao05;

import java.util.Scanner;

public class E20 {

    public static void main(String[] Args){

        int qtd;
        int ordem = 0;
        int num;
        int par = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de números desejada: ");
        qtd = scan.nextInt();

        for (int i = 0; i < qtd; i++){
            System.out.printf("Digite o %dº número: ", ++ ordem);
            num = scan.nextInt();

            if (num % 2 == 0){
                par ++;
            }
            if (num == 1000){
                break;
            }
        }
        System.out.println("Número de dados lidos: " + ordem);
        System.out.println("Números de valores pares: " + par);
    }
}
