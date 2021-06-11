package desenvolvimento_de_aplicacoes_multicamadas.aula05_SistemaLocadora.controller;

import desenvolvimento_de_aplicacoes_multicamadas.aula05_SistemaLocadora.view.MenuView;

public class MenuController {
    
    private MenuView menuView;
    private CadastrarLocadoraController clc;
    private CadastrarFilmeController cfc;
    private ListarFilmeController lfc;
    
    public MenuController(){
        
        menuView = new MenuView();
           
        int opcao = 0;
        
        while(opcao != 9){
            
            opcao = menuView.telaDeMenu();
            
            switch(opcao){
                
                case 1:
                    clc = new CadastrarLocadoraController(); 
                    break;
                case 2:
                    cfc = new CadastrarFilmeController();
                    break;
                case 3:
                    lfc = new ListarFilmeController();
                    break;
                case 9:
                    System.exit(0);
                    break;
                    
                default:
                    menuView.telaOpcaoInvalida();
                
            }

        }
    }
}
