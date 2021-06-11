package desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.controller;

import desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.dao.PizzaDAO;
import desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.model.Pizza;
import desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.view.CadastrarPizzaView;

public class CadastrarPizzaController {

    private CadastrarPizzaView cpiv;
    private Pizza pi;
    private PizzaDAO piDAO;

    public CadastrarPizzaController(){

        cpiv = new CadastrarPizzaView();
        pi = cpiv.telaDeCadastro(pi);

        piDAO = new PizzaDAO();
        piDAO.insere(pi);

    }
}
