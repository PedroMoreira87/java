package desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.view;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarPizzasView {

    public void telaListarPizzas(ResultSet rs){

        System.out.println("Id | Sabor");

        try{
            while(rs.next()){
                System.out.print(" " + rs.getInt("id") + " | ");
                System.out.println(rs.getString("sabor"));
            }
        }
        catch(SQLException ex) {}
    }
}
