package desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.dao;

import desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.model.Pedido;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PedidoDAO {

//    private Conexao con;
    private String query;
    private PreparedStatement ps;
    private ResultSet rs;

    Conexao conexao = Conexao.getInstance();

//    public PedidoDAO(){
//        con = new Conexao();
//    }

    public void insere(Pedido p){

        try{
            query =  "INSERT INTO pedido (entrega, qtde, tamanho, id_pizza, id_cliente) VALUES (?, ?, ?, ?, ?)";
            ps = conexao.getConexao().prepareStatement(query);

            ps.setInt(1, p.getEntrega());
            ps.setInt(2, p.getQtde());
            ps.setInt(3, p.getTamanho());
            ps.setInt(4, p.getId_pizza());
            ps.setInt(5, p.getId_cliente());

            ps.executeUpdate();

            ps.close();

        }
        catch(SQLException ex) {}

    }


    public ResultSet listar(){

        try{
            query = "SELECT * FROM pedido";
            ps = conexao.getConexao().prepareStatement(query);

            rs = ps.executeQuery();

            return rs;
        }
        catch(SQLException ex) {}

        return null;
    }
}
