package aula13;

public class ExcecaoSenhaInvalida extends ExcecaoAutenticacao{
    String mensagem;
    public ExcecaoSenhaInvalida(String msg) {
        mensagem = msg;
    }
}
