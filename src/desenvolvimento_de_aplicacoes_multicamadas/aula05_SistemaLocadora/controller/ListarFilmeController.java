package desenvolvimento_de_aplicacoes_multicamadas.aula05_SistemaLocadora.controller;

import desenvolvimento_de_aplicacoes_multicamadas.aula05_SistemaLocadora.dao.FilmeDAO;
import java.sql.ResultSet;
import desenvolvimento_de_aplicacoes_multicamadas.aula05_SistemaLocadora.view.ListarFilmeView;

public class ListarFilmeController {
    
    private FilmeDAO fDAO;
    private ResultSet rs;
    private ListarFilmeView lfv;
    
    
    public ListarFilmeController(){
        
        fDAO = new FilmeDAO();
        rs = fDAO.listar();
        
        lfv = new ListarFilmeView();
        lfv.telaListarFilme(rs);
        
    }
}
