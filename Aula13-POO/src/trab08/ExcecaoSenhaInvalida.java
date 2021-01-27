package trab08;

public class ExcecaoSenhaInvalida extends ExcecaoAutenticacao{
    String mensagem;
    public ExcecaoSenhaInvalida(String msg) {
        mensagem = msg;
    }
}
