package desenvolvimento_de_aplicacoes_multicamadas.aula11.model;

public class Pessoa {
    
    private String usuario;
    private String senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Pessoa(){}

    public Pessoa(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }
}
