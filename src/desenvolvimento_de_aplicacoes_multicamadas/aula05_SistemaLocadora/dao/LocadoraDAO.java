package desenvolvimento_de_aplicacoes_multicamadas.aula05_SistemaLocadora.dao;

import desenvolvimento_de_aplicacoes_multicamadas.aula05_SistemaLocadora.model.Locadora;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LocadoraDAO {
    
    private Conexao con;
    private String query;
    private PreparedStatement ps;
    
    public LocadoraDAO(){
        con = new Conexao();
    }
    
    public void insere(Locadora l){
        
        try{
            
            query =  "INSERT INTO locadora (nome, endereco) VALUES (?, ?)";
            ps = con.getConexao().prepareStatement(query);
            
            ps.setString(1, l.getNome());
            ps.setString(2, l.getEndereco());
            
            ps.executeUpdate();
            
            ps.close();
            
        }
        catch(SQLException ex) {}
  
    } 
}
