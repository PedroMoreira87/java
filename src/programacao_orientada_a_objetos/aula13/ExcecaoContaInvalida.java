package programacao_orientada_a_objetos.aula13;

public class ExcecaoContaInvalida extends ExcecaoAutenticacao{
    String mensagem;
    public ExcecaoContaInvalida(String msg) {
        mensagem = msg;
    }
}
