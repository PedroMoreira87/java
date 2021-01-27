package secao05;

import java.util.Scanner;

public class E07 {

    public static void main(String[] args) {

        int num;
        double soma = 0;
        int media = 10;

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < media; i++){

            System.out.println("Digite um número: ");
            num = scan.nextInt();

            if(num > 0){
                soma += num;
            }else{
                System.out.println("Somente serão computados valores positivos");
                i += -1;
            }
        }

        System.out.printf("A média é: %.2f", soma/media);;
    }
}
