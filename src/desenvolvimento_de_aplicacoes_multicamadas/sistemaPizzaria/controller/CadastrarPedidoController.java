package desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.controller;

import desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.dao.PedidoDAO;
import desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.model.Pedido;
import desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.view.CadastrarPedidoView;

public class CadastrarPedidoController {

    private CadastrarPedidoView cpv;
    private Pedido p;
    private PedidoDAO pDAO;

    public CadastrarPedidoController(){

        cpv = new CadastrarPedidoView();
        p = cpv.telaDeCadastro(p);

        pDAO = new PedidoDAO();
        pDAO.insere(p);
    }
}
