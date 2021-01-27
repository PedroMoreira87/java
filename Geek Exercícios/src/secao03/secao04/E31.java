package secao04;

import java.util.Scanner;

public class E31 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a sua altura? ");
        double altura = scan.nextDouble();
        System.out.println("Qual o seu peso? ");
        double peso = scan.nextDouble();

        if (altura < 1.20 && peso <= 60) {
            System.out.println("Classificação A");
        } else if (altura < 1.20 && peso > 60 && peso <= 90) {
            System.out.println("Classificação D");
        } else if (altura < 1.20 && peso > 90) {
            System.out.println("Classificação G");
        } else if (altura >= 1.20 && altura <= 1.70 && peso <= 60) {
            System.out.println("Classificação B");
        } else if (altura >= 1.20 && altura <= 1.70 && peso > 60 && peso <= 90) {
            System.out.println("Classificação E");
        } else if (altura >= 1.20 && altura <= 1.70 && peso > 90) {
            System.out.println("Classificação H");
        } else if (altura > 1.70 && peso <= 60) {
            System.out.println("Classificação C");
        } else if (altura > 1.70 && peso > 60 && peso <= 90) {
            System.out.println("Classificação F");
        } else if (altura > 1.70 && peso > 90) {
            System.out.println("Classificação I");
        } else {
            System.out.println("Valor incorreto");
        }
    }
}
