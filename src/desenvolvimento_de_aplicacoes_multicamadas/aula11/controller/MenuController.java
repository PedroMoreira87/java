package desenvolvimento_de_aplicacoes_multicamadas.aula11.controller;

import desenvolvimento_de_aplicacoes_multicamadas.aula11.view.MenuView;

public class MenuController {
    
    private MenuView menuView;
    private int opcao;
    
    public MenuController() {
        
        menuView = new MenuView();
        
        opcao = -1;
        
        while(opcao != 9){
            opcao = menuView.telaDeMenu();
            
            if(opcao == 1) {
                CadastroController cadastroController = new CadastroController();
            }
            else if(opcao == 2){
                LoginController loginController = new LoginController();
            }
            else if(opcao == 9){
                System.exit(0);
            }
        }
    }
}
