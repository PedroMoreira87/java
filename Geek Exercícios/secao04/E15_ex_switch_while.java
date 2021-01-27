package secao04;

import java.util.Scanner;

public class E15_ex_switch_while {

    static public void main(String[] args) {

        boolean sair = false;
        while (!sair) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Informe o dia da semana desejado: ");
                System.out.println("- 1 Domingo");
                System.out.println("- 2 Segunda");
                System.out.println("- 3 Terça");
                System.out.println("- 4 Quarta");
                System.out.println("- 5 Quinta");
                System.out.println("- 6 Sexta");
                System.out.println("- 7 Sábado");
                int valor = scan.nextInt();

                switch (valor) {
                    case 1:
                        System.out.println("Domingo");
                        sair = true;
                        break;
                    case 2:
                        System.out.println("Segunda");
                        sair = true;
                        break;
                    case 3:
                        System.out.println("Terça");
                        sair = true;
                        break;
                    case 4:
                        System.out.println("Quarta");
                        sair = true;
                        break;
                    case 5:
                        System.out.println("Quinta");
                        sair = true;
                        break;
                    case 6:
                        System.out.println("Sexta");
                        sair = true;
                        break;
                    case 7:
                        System.out.println("Sábado");
                        sair = true;
                        break;
                    default:
                        System.out.println("Resposta invalida\n");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Resposta invalida\n");
            }
        }
    }
}
