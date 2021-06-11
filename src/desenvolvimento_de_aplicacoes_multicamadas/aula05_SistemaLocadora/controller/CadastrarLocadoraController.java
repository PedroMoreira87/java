package desenvolvimento_de_aplicacoes_multicamadas.aula05_SistemaLocadora.controller;

import desenvolvimento_de_aplicacoes_multicamadas.aula05_SistemaLocadora.dao.LocadoraDAO;
import desenvolvimento_de_aplicacoes_multicamadas.aula05_SistemaLocadora.model.Locadora;
import desenvolvimento_de_aplicacoes_multicamadas.aula05_SistemaLocadora.view.CadastrarLocadoraView;

public class CadastrarLocadoraController{
    
    private CadastrarLocadoraView clv;
    private Locadora l;
    private LocadoraDAO lDAO;
    
    public CadastrarLocadoraController(){
     
        clv = new CadastrarLocadoraView();
        l = clv.telaDeCadastro(l);
        
        lDAO = new LocadoraDAO();
        lDAO.insere(l); 
        
        
    }
}
