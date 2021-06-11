package desenvolvimento_de_aplicacoes_multicamadas.aula05_SistemaLocadora.view;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarFilmeView {
    
    
    
    public void telaListarFilme(ResultSet rs){
        
        System.out.println("Id | Titulo | Id Locadora");
        
        try{
            while(rs.next()){
            
                System.out.print(" " + rs.getInt("id") + " | ");
                System.out.print(rs.getString("titulo") + " | ");
                System.out.println(rs.getInt("id_locadora"));

            }
            
            //sout
        }
        catch(SQLException ex) {}
       
            
        
         
        
    }
}
