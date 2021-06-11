package desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.view;

import java.util.Scanner;

public class MenuView {

    public int telaDeMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n(1) Cadastrar Cliente");
        System.out.println("(2) Listar Clientes\n");
        System.out.println("(3) Cadastrar Pizza");
        System.out.println("(4) Listar Pizzas\n");
        System.out.println("(5) Cadastrar Pedido");
        System.out.println("(6) Listar Pedidos\n");
        System.out.println("(9) Sair\n");
        System.out.print(" Opção: ");
        return sc.nextInt();
    }

    public void telaOpcaoInvalida(){
        System.out.println(" *** Opção Inválida *** ");
    }
}

