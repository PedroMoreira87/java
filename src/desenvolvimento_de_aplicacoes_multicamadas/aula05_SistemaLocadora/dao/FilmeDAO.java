package desenvolvimento_de_aplicacoes_multicamadas.aula05_SistemaLocadora.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import desenvolvimento_de_aplicacoes_multicamadas.aula05_SistemaLocadora.model.Filme;
import java.sql.ResultSet;

public class FilmeDAO {
    
    private Conexao con;
    private String query;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public FilmeDAO(){
        con = new Conexao();
    }
    
    public void insere(Filme f){
        
        try{
            
            query =  "INSERT INTO filme (titulo, id_locadora) VALUES (?, ?)";
            ps = con.getConexao().prepareStatement(query);
            
            ps.setString(1, f.getTitulo());
            ps.setInt(2, f.getId_locadora());
            
            ps.executeUpdate();
            
            ps.close();
            
        }
        catch(SQLException ex) {}
  
    } 
    
    
    public ResultSet listar(){
        
        try{
            query = "SELECT * FROM filme";
            ps = con.getConexao().prepareStatement(query);
            
            rs = ps.executeQuery();
            
            return rs;
        }
        catch(SQLException ex) {}
        
        return null;
        
    }
    
    
    public void editar(Filme f){
        
        try{
            query = "UPDATE filme SET titulo ='" + f.getTitulo() + "' WHERE id = " + f.getId();
            ps = con.getConexao().prepareStatement(query);
            ps.executeUpdate();
        }
        catch(SQLException ex){
            
        }
    }
    
    public void deletar(Filme f){
        
        try{
            query = "DELETE FROM filme WHERE id = " + f.getId();
            ps = con.getConexao().prepareStatement(query);
            ps.executeUpdate();
        }
        catch(SQLException ex){
            
        }
    }
    
    
}
