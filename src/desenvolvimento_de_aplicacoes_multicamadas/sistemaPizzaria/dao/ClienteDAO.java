package desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.dao;

import desenvolvimento_de_aplicacoes_multicamadas.sistemaPizzaria.model.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO {

//    private Conexao con;
    private String query;
    private PreparedStatement ps;
    private ResultSet rs;

    Conexao conexao = Conexao.getInstance();

//    public ClienteDAO(){
//        con = new Conexao();
//    }

    public void insere(Cliente c){

        try{
            query =  "INSERT INTO cliente (nome, telefone) VALUES (?, ?)";
            ps = conexao.getConexao().prepareStatement(query);

            ps.setString(1, c.getNome());
            ps.setString(2, c.getTelefone());

            ps.executeUpdate();

            ps.close();

        }
        catch(SQLException ex) {}

    }


    public ResultSet listar(){

        try{
            query = "SELECT * FROM cliente";
            ps = conexao.getConexao().prepareStatement(query);

            rs = ps.executeQuery();

            return rs;
        }
        catch(SQLException ex) {}

        return null;
    }
}
