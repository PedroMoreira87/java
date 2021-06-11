package desenvolvimento_de_aplicacoes_multicamadas.aula04.dao;

import desenvolvimento_de_aplicacoes_multicamadas.aula04.model.Pessoa;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PessoaDAO {

    private Conexao conexao;
    private String query;
    private PreparedStatement ps;

    public PessoaDAO() {
        conexao = new Conexao();
    }

    public void inserePessoa(Pessoa p){

        try {
            query = "INSERT INTO pessoa (nome, sobrenome) VALUES (?,?)";

            ps = conexao.getConexao().prepareStatement(query);

            ps.setString(1, p.getNome());
            ps.setString(2, p.getSobrenome());

            ps.executeUpdate();

            ps.close();
        }
        catch (SQLException ex){}
    }
}
