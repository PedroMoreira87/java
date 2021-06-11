package desenvolvimento_de_aplicacoes_multicamadas.aula11.controller;

import desenvolvimento_de_aplicacoes_multicamadas.aula11.model.Pessoa;
import desenvolvimento_de_aplicacoes_multicamadas.aula11.model.SingletonPessoasCadastradas;
import desenvolvimento_de_aplicacoes_multicamadas.aula11.view.CadastroView;

public class CadastroController {
    
    private CadastroView cadastroView;
    private Pessoa p;
    
    public CadastroController(){
        
        cadastroView = new CadastroView();
        p = cadastroView.telaDeCadastro();
        
        SingletonPessoasCadastradas.getInstance().setPessoa(p);
        
        
    }
}
