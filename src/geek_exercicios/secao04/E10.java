package secao04;

import java.util.Scanner;

public class E10 {
    public static void main(String[] args){

        Scanner valores = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = valores.nextDouble();

        String sexo;

        do {
            System.out.println("Digite o seu sexo:\nM para Masculino\nF para Feminino");
            sexo = valores.next();

            double homens = (72.7 * altura) - 58;
            double mulheres = (62.1 * altura) - 44.7;

            if (sexo.equals("M")){
                System.out.printf("Sua peso ideal é: %.2f", homens);
            }else if(sexo.equals("F")){
                System.out.printf("Seu peso ideal é: %.2f", mulheres);
            }else{
                System.out.println("Favor digitar correntamente o seu sexo");
            }
        } while (!sexo.equals("M") && !sexo.equals("F"));
    }
}
