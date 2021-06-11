package desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.controller;

import desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.dao.PedidoDAO;
import desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.view.ListarPedidosView;

import java.sql.ResultSet;

public class ListarPedidosController {

    private PedidoDAO pDAO;
    private ResultSet rs;
    private ListarPedidosView lpv;


    public ListarPedidosController(){

        pDAO = new PedidoDAO();
        rs = pDAO.listar();

        lpv = new ListarPedidosView();
        lpv.telaListarPedidos(rs);
    }
}
