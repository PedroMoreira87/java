package pensamento_matematico_na_computacao.aula09;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Problemas prob = new Problemas();

        boolean sair = false;

        while(!sair) {

            int x;

            try {

                Scanner in = new Scanner(System.in);

                System.out.println("\nEscolha o seu problema:");
                System.out.println("1 - Problema no motor");
                System.out.println("2 - Problema no freio");
                System.out.println("3 - Problema na suspensao\n");


                x = in.nextInt();

                switch (x) {
                    case 1:
                        prob.motor();
                        break;
                    case 2:
                        prob.freio();
                        break;
                    case 3:
                        prob.direcao();
                        break;
                    default:
                        System.out.println("Opcao invalida.\n");
                        break;
                }

            } catch(Exception e) {
                System.out.println("Resposta invalida\n");
            }
        }
    }
}
