package secao04;

import java.util.Scanner;

public class E28 {
    public static void main(String[] args){
        int nota1 = 10;
        int nota2 = 8;
        int nota3 = 3;

        double geo = Math.cbrt(nota1 * nota2 * nota3);
        double pond = ((double) nota1 + 2 * (double) nota2 + 3 * (double) nota3) / 6;
        double harm = (1 / ((1 / (double) nota1) + (1 / (double) nota2) + (1 / (double)nota3)));
        double arit = ((double) nota1 + (double) nota2 + (double) nota3) / 3;

        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha uma das opções: ");
        System.out.println("1 - Geométrica");
        System.out.println("2 - Ponderada");
        System.out.println("3 - Harmônica");
        System.out.println("4 - Aritmética");

        int media = scan.nextInt();
        switch(media){
            case 1:
                System.out.printf("%.2f", geo);
                break;
            case 2:
                System.out.printf("%.2f", pond);
                break;
            case 3:
                System.out.printf("%.2f", harm);
                break;
            case 4:
                System.out.printf("%.2f", arit);
                break;
            default:
                System.out.println("Valor incorreto");
                break;
        }
    }
}
