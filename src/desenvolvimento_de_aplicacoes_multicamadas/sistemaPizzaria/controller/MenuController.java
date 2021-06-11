package desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.controller;

import desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.view.MenuView;

public class MenuController {

    private MenuView menuView;
    private CadastrarClienteController ccc;
    private ListarClientesController lcc;
    private CadastrarPizzaController cpic;
    private ListarPizzasController lpic;
    private CadastrarPedidoController cpc;
    private ListarPedidosController lpc;

    public MenuController(){

        menuView = new MenuView();
        int opcao = menuView.telaDeMenu();

        switch(opcao){

            case 1:
                ccc = new CadastrarClienteController();
                break;
            case 2:
                lcc = new ListarClientesController();
                break;
            case 3:
                cpic = new CadastrarPizzaController();
                break;
            case 4:
                lpic = new ListarPizzasController();
                break;
            case 5:
                cpc = new CadastrarPedidoController();
                break;
            case 6:
                lpc = new ListarPedidosController();
                break;
            case 9:
                System.exit(0);
                break;

            default:
                menuView.telaOpcaoInvalida();
        }
    }
}
