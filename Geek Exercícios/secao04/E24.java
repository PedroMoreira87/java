package secao04;

import java.util.Scanner;

public class E24 {

    public static void teste(){
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Escolha a opção: ");
            System.out.println("1 - MG - 7%");
            System.out.println("2 - SP - 12%");
            System.out.println("3 - RJ - 15%");
            System.out.println("4 - MS - 8%");

            int estado = scan.nextInt();

            System.out.println("Digite o valor do produto: ");
            double prod = scan.nextDouble();

            switch(estado){
                case 1:
                    System.out.printf("O produto custará: %.2f", prod * 1.7);
                    break;
                case 2:
                    System.out.printf("O produto custará: %.2f", prod * 1.12);
                    break;
                case 3:
                    System.out.printf("O produto custará: %.2f", prod * 1.15);
                    break;
                case 4:
                    System.out.printf("O produto custará: %.2f", prod * 1.08);
                    break;
                default:
                    System.out.println("===============================");
                    System.out.println("Valor digitado incorreto");
                    System.out.println("===============================");
                    teste();
                    break;
            }
        }catch (Exception e){
            System.out.println("===============================");
            System.out.println("Valor incorreto");
            System.out.println("===============================");
            teste();
        }
    }

    public static void main(String[] args) {

        teste();

    }
}
