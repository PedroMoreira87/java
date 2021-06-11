package desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.controller;

import desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.dao.PizzaDAO;
import desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.view.ListarPizzasView;

import java.sql.ResultSet;

public class ListarPizzasController {

    private PizzaDAO piDAO;
    private ResultSet rs;
    private ListarPizzasView lpiv;


    public ListarPizzasController(){

        piDAO = new PizzaDAO();
        rs = piDAO.listar();

        lpiv = new ListarPizzasView();
        lpiv.telaListarPizzas(rs);

    }
}
