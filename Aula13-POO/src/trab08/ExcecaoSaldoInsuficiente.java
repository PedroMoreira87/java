package trab08;

public class ExcecaoSaldoInsuficiente extends Exception{

    String mensagem;

    public ExcecaoSaldoInsuficiente(String msg) {
        mensagem = msg;
    }
}
