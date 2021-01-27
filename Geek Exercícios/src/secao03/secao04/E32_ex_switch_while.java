package secao04;

import java.util.Scanner;

public class E32_ex_switch_while {

    public static void menu() {
        double total = 0;

        while (true) {
            try{
                Scanner scan = new Scanner(System.in);
                System.out.println("Digite o seu pedido: ");
                System.out.println("000 - Para sair");
                System.out.println("100 - Cachorro quente: R$1,20");
                System.out.println("101 - Bauru simples: R$1,30");
                System.out.println("102 - Bauru com Ovo: R$1,50");
                System.out.println("103 - Hamburguer: R$1,20");
                System.out.println("104 - Cheeseburger: R$1,70");
                System.out.println("105 - Suco: R$2,20");
                System.out.println("106 - Refrigerante: R$1,00");
                int pedido = scan.nextInt();

                if (pedido == 000) {
                    System.out.println("Obrigado e volte sempre");
                    break;
                }else if(pedido != 100 && pedido != 101 && pedido != 102 && pedido != 103 && pedido != 104 && pedido != 105 && pedido != 106){
                    System.out.println("Valor incorreto");
                    System.out.println("==============================");
                    menu();
                }

                System.out.println("Digite a quantidade: ");
                int quantidade = scan.nextInt();

                switch (pedido) {
                    case 100:
                    case 103:
                        total += quantidade * 1.20;
                        System.out.printf("Total de: R$%.2f\n", total);
                        System.out.println("Mais alguma coisa?");
                        break;
                    case 101:
                        total += quantidade * 1.30;
                        System.out.printf("Total de: R$%.2f\n", total);
                        System.out.println("Mais alguma coisa?");
                        break;
                    case 102:
                        total += quantidade * 1.50;
                        System.out.printf("Total de: R$%.2f\n", total);
                        System.out.println("Mais alguma coisa?");
                        break;
                    case 104:
                        total += quantidade * 1.70;
                        System.out.printf("Total de: R$%.2f\n", total);
                        System.out.println("Mais alguma coisa?");
                        break;
                    case 105:
                        total += quantidade * 2.20;
                        System.out.printf("Total de: R$%.2f\n", total);
                        System.out.println("Mais alguma coisa?");
                        break;
                    case 106:
                        total += quantidade * 1.00;
                        System.out.printf("Total de: R$%.2f\n", total);
                        System.out.println("Mais alguma coisa?");
                        break;
                    default:
                        System.out.println("Valor incorreto");
                        menu();
                        break;
                }
                System.out.println("==============================");
            }catch (Exception e){
                System.out.println("Valor incorreto");
                System.out.println("==============================");
            }
            }
        }

    public static void main(String[] args){

        menu();
    }
}
