package desenvolvimento_de_aplicacoes_multicamadas.aula04.view;

import desenvolvimento_de_aplicacoes_multicamadas.aula04.model.Pessoa;

import java.util.Scanner;

public class CadastrarPessoaView {

    private Pessoa p;

    public Pessoa telaCadastroPessoa() {

        p = new Pessoa();
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        p.setNome(in.next());

        System.out.print("Digite o sobrenome: ");
        p.setSobrenome(in.next());

        return p;
    }
}
