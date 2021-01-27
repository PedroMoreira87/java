package secao04;

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {

        Scanner valores = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num = valores.nextDouble();


        if (num > 0){
            System.out.printf("%.2f", Math.sqrt(num));
        }else{
            System.out.println("Número invalido");
        }
    }
}
