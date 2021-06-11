package desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.view;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarClientesView {

    public void telaListarClientes(ResultSet rs){

        System.out.println("Id | Nome | Telefone");

        try{
            while(rs.next()){
                System.out.print(" " + rs.getInt("id") + " | ");
                System.out.print(rs.getString("nome") + " | ");
                System.out.println(rs.getString("telefone"));
            }
        }
        catch(SQLException ex) {}
    }
}
