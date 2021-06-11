package desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.dao;

import desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.model.Pizza;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PizzaDAO {

//    private Conexao con;
    private String query;
    private PreparedStatement ps;
    private ResultSet rs;

    Conexao conexao = Conexao.getInstance();

//    public PizzaDAO(){
//        conexao = new Conexao();
//    }

    public void insere(Pizza pi){

        try{
            query =  "INSERT INTO pizza (sabor) VALUES (?)";
            ps = conexao.getConexao().prepareStatement(query);

            ps.setString(1, pi.getSabor());

            ps.executeUpdate();

            ps.close();

        }
        catch(SQLException ex) {}

    }


    public ResultSet listar(){

        try{
            query = "SELECT * FROM pizza";
            ps = conexao.getConexao().prepareStatement(query);

            rs = ps.executeQuery();

            return rs;
        }
        catch(SQLException ex) {}

        return null;
    }
}
