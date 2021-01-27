package secao04;

import java.util.Scanner;

public class E23 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Favor digitar um ano: ");

        int ano = scan.nextInt();

        if (ano % 400 == 0 || ano % 4 == 0 && ano % 100 > 0){
            System.out.println("O ano é bissexto");
        }else
            System.out.println("O ano não é bissexto");

    }
}
