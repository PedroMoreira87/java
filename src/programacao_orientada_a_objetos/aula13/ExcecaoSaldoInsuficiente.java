package programacao_orientada_a_objetos.aula13;

public class ExcecaoSaldoInsuficiente extends Exception{

    String mensagem;

    public ExcecaoSaldoInsuficiente(String msg) {
        mensagem = msg;
    }
}
