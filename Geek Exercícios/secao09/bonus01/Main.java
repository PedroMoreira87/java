package secao09.bonus01;

// jubileu conta poupança e quer depositar 300 reais
// creuza conta corrente e quer depositar 500 reais
// creuza saca 100 reais

import java.util.Scanner;

public class Main {

    ContaBanco pessoa1 = new ContaBanco(12345, null, "Jubileu", 0, false);
    ContaBanco pessoa2 = new ContaBanco(54321, null, "Creuza", 0, false);

    public void menu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Olá, favor se identificar: \n" +
                "1 - Jubileu\n" +
                "2 - Creuza\n" +
                "3 - Sair");
        int identifica = scan.nextInt();

        switch (identifica){
            case 1:
                System.out.println("Favor digitar a opção desejada: \n" +
                        "1 - Abrir Conta\n" +
                        "2 - Fechar Conta\n" +
                        "3 - Depositar\n" +
                        "4 - Sacar\n" +
                        "5 - Pagar Mensalidade\n" +
                        "6 - Sair");
                int menu = scan.nextInt();

                switch (menu){
                    case 1:
                        pessoa1.abrirConta();
                        menu();
                        break;
                    case 2:
                        pessoa1.fecharConta();
                        menu();
                        break;
                    case 3:
                        pessoa1.depositar();
                        menu();
                        break;
                    case 4:
                        pessoa1.sacar();
                        menu();
                        break;
                    case 5:
                        pessoa1.pagarMensal();
                        menu();
                    case 6:
                        break;
                    default:
                        System.out.println("Valor incorreto");
                        menu();
                        break;
                }
                break;
            case 2:
                System.out.println("Favor digitar a opção desejada: \n" +
                        "1 - Abrir Conta\n" +
                        "2 - Fechar Conta\n" +
                        "3 - Depositar\n" +
                        "4 - Sacar\n" +
                        "5 - Pagar Mensalidade\n" +
                        "6 - Sair");
                int menu1 = scan.nextInt();

                switch (menu1){
                    case 1:
                        pessoa2.abrirConta();
                        menu();
                        break;
                    case 2:
                        pessoa2.fecharConta();
                        menu();
                        break;
                    case 3:
                        pessoa2.depositar();
                        menu();
                        break;
                    case 4:
                        pessoa2.sacar();
                        menu();
                        break;
                    case 5:
                        pessoa2.pagarMensal();
                        menu();
                    case 6:
                        break;
                    default:
                        System.out.println("Valor incorreto");
                        menu();
                        break;
                }
                break;
            case 3:
                break;
            default:
                System.out.println("Valor incorreto");
                menu();
                break;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        main.menu();

        main.pessoa1.imprimirContaBanco();

        main.pessoa2.imprimirContaBanco();
    }
}
