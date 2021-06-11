package desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.controller;

import desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.dao.ClienteDAO;
import desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.view.ListarClientesView;
import java.sql.ResultSet;

public class ListarClientesController {

    private ClienteDAO cDAO;
    private ResultSet rs;
    private ListarClientesView lcv;


    public ListarClientesController(){

        cDAO = new ClienteDAO();
        rs = cDAO.listar();

        lcv = new ListarClientesView();
        lcv.telaListarClientes(rs);
    }
}
