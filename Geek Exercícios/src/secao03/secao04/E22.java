package secao04;

import java.util.Scanner;

public class E22 {
     public static void main(String[] args){

         Scanner scan = new Scanner(System.in);

         System.out.println("Favor digitar a sua idade: ");
         int idade = scan.nextInt();
         System.out.println("Favor digitar o tempo de serviço: ");
         int servico = scan.nextInt();

         if(idade >= 65 || servico >= 30 || (idade >= 60 && servico >= 25)){
             System.out.println("Pode se aposentar");
         }else
             System.out.println("Não pode se aposentar");
    }
}
