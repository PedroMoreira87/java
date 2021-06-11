package desenvolvimento_de_aplicacoes_multicamadas.aula05_SistemaLocadora.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    private final String con_banco;
    private final String usuario_mysql;
    private final String senha_mysql;
    private Connection conn;
    
    public Conexao(){
        
        usuario_mysql = "root";
        senha_mysql = "root";
        
        con_banco = "jdbc:mysql://127.0.0.1/sistema_locadora?useSSL=false";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(con_banco, usuario_mysql, senha_mysql);
        }
        catch(ClassNotFoundException ex) {}
        catch(SQLException ex) {}
        catch(Exception ex) {}

    }
    
    public Connection getConexao(){
        return this.conn;
    }
}
