package trab08;

public class ExcecaoContaInvalida extends ExcecaoAutenticacao{
    String mensagem;
    public ExcecaoContaInvalida(String msg) {
        mensagem = msg;
    }
}
