package desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.view;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarPedidosView {

    public void telaListarPedidos(ResultSet rs){

        System.out.println("Id | Entrega | Quantidade | Tamanho | Id_Pizza | Id_Cliente");

        try{
            while(rs.next()){
                System.out.print(" " + rs.getInt("id") + " | ");
                System.out.print(rs.getString("entrega") + "       | ");
                System.out.print(rs.getString("qtde") + "          | ");
                System.out.print(rs.getString("tamanho") + "       | ");
                System.out.print(rs.getString("id_pizza") + "        | ");
                System.out.println(rs.getInt("id_cliente"));
            }
        }
        catch(SQLException ex) {}
    }
}
