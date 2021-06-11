package desenvolvimento_de_aplicacoes_multicamadas.aula05_SistemaLocadora.controller;

import desenvolvimento_de_aplicacoes_multicamadas.aula05_SistemaLocadora.dao.FilmeDAO;
import desenvolvimento_de_aplicacoes_multicamadas.aula05_SistemaLocadora.model.Filme;
import desenvolvimento_de_aplicacoes_multicamadas.aula05_SistemaLocadora.view.CadastrarFilmeView;

public class CadastrarFilmeController {
    
    private CadastrarFilmeView cfv;
    private Filme f;
    private FilmeDAO lDAO;
    
    public CadastrarFilmeController(){
     
        cfv = new CadastrarFilmeView();
        f = cfv.telaDeCadastro(f);
        
        lDAO = new FilmeDAO();
        lDAO.insere(f); 
        
        
    }
}

