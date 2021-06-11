package desenvolvimento_de_aplicacoes_multicamadas.aula11.controller;

import desenvolvimento_de_aplicacoes_multicamadas.aula11.model.Pessoa;
import desenvolvimento_de_aplicacoes_multicamadas.aula11.model.SingletonPessoasCadastradas;
import desenvolvimento_de_aplicacoes_multicamadas.aula11.view.LoginView;

import java.util.ArrayList;

public class LoginController {
    
    private LoginView loginView;
    private Pessoa p;
    private ArrayList<Pessoa> lista;
    
    public LoginController(){
        loginView = new LoginView();
        p = loginView.telaDeLogin();
        
        if(checkAutenticacao() == true){
            // DashboardController dashboardController = new DashboardController();
        }
  
    }
    
    public boolean checkAutenticacao(){
        
        lista = SingletonPessoasCadastradas.getInstance().getPessoa();
        
        for(int i = 0; i < lista.size(); i++){
            
            if(lista.get(i).getUsuario().equals(p.getUsuario()) &&
               lista.get(i).getSenha().equals(p.getSenha()))
            {
                return true;
            }
        }
        
        return false;
    }

}
