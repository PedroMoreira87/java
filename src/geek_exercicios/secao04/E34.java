package secao04;

import java.util.Scanner;

public class E34 {

    public static void conceito() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Qual foi a sua nota? ");
        double nota = scan.nextDouble();
        System.out.println("Quantas faltas você teve? ");
        int faltas = scan.nextInt();

        if (nota >= 9 && nota <= 10) {
            if (faltas <= 20) {
                System.out.println("Conceito A");
            }else{
                System.out.println("Conceito B");
            }
        } else if (nota >= 7.5 && nota <= 8.9) {
            if (faltas <= 20) {
                System.out.println("Conceito B");
            }else{
                System.out.println("Conceito C");
            }
        } else if (nota >= 5 && nota <= 7.4) {
            if (faltas <= 20) {
                System.out.println("Conceito C");
            }else{
                System.out.println("Conceito D");
            }
        } else if (nota >= 4 && nota <= 4.9) {
            if (faltas <= 20) {
                System.out.println("Conceito D");
            }else{
                System.out.println("Conceito E");
            }
        } else if (nota >= 0 && nota <= 3.9) {
            if (faltas <= 20) {
                System.out.println("Conceito E");
            }else{
                System.out.println("Conceito E");
            }
        }else{
            System.out.println("Valor invalido");
        }
    }

    public static void main(String[] args){

        conceito();
    }
}
