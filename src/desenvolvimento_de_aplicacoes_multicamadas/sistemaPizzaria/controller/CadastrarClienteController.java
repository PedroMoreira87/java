package desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.controller;

import desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.dao.ClienteDAO;
import desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.model.Cliente;
import desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.view.CadastrarClienteView;

public class CadastrarClienteController {

    private CadastrarClienteView ccv;
    private Cliente c;
    private ClienteDAO cDAO;

    public CadastrarClienteController(){

        ccv = new CadastrarClienteView();
        c = ccv.telaDeCadastro(c);

        cDAO = new ClienteDAO();
        cDAO.insere(c);

    }
}
