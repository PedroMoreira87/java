package desenvolvimento_de_aplicacoes_multicamadas.aula04.controller;

import desenvolvimento_de_aplicacoes_multicamadas.aula04.dao.PessoaDAO;
import desenvolvimento_de_aplicacoes_multicamadas.aula04.model.Pessoa;
import desenvolvimento_de_aplicacoes_multicamadas.aula04.view.CadastrarPessoaView;

public class CadastrarPessoaController {

    private CadastrarPessoaView cpv;
    private Pessoa p;
    private PessoaDAO pDAO;

    public CadastrarPessoaController() {

        p = new Pessoa();

        cpv = new CadastrarPessoaView();
        p = cpv.telaCadastroPessoa();

        pDAO = new PessoaDAO();
        pDAO.inserePessoa(p);
    }
}
