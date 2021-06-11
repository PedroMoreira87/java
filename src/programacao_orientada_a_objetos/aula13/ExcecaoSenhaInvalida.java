package programacao_orientada_a_objetos.aula13;

public class ExcecaoSenhaInvalida extends ExcecaoAutenticacao{
    String mensagem;
    public ExcecaoSenhaInvalida(String msg) {
        mensagem = msg;
    }
}
