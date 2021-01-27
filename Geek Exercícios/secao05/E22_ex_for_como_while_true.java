package secao05;

import java.util.Scanner;

public class E22_ex_for_como_while_true {

    public static void main(String[] Args){

        double input;
        int contador = 0;
        double notas = 0;


        Scanner scan = new Scanner(System.in);

        for (;;){
            System.out.println("Digite uma nota: ");
            input = scan.nextDouble();

            if (input >= 10 & input <= 20){
                contador ++;
                notas += input;
            }else{
                System.out.println("Erro: O input deve ser entre 10 e 20");
                break;
            }
        }
        notas /= contador;
        System.out.println("Sua média é: " + notas);
    }
}
