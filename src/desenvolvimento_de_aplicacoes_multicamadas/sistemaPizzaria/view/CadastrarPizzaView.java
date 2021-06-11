package desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.view;

import desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.model.Pizza;

import java.util.Scanner;

public class CadastrarPizzaView {

    public Pizza telaDeCadastro(Pizza pi){

        pi = new Pizza();
        Scanner sc = new Scanner(System.in);
        System.out.print("Sabor: ");
        pi.setSabor(sc.next());

        return pi;

    }
}
