package desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.view;

import desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.model.Cliente;
import java.util.Scanner;

public class CadastrarClienteView {

    public Cliente telaDeCadastro(Cliente c){

        c = new Cliente();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        c.setNome(sc.next());

        System.out.print("Telefone: ");
        c.setTelefone(sc.next());

        return c;

    }
}
