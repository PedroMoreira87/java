package desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.view;

import desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.model.Pedido;

import java.util.Scanner;

public class CadastrarPedidoView {

    public Pedido telaDeCadastro(Pedido p){

        p = new Pedido();
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrega: ");
        p.setEntrega(sc.nextInt());

        System.out.print("Quantidade: ");
        p.setQtde(sc.nextInt());

        System.out.print("Tamanho: ");
        p.setTamanho(sc.nextInt());

        System.out.print("Id pizza: ");
        p.setId_pizza(sc.nextInt());

        System.out.print("Id cliente: ");
        p.setId_cliente(sc.nextInt());

        return p;
    }
}
