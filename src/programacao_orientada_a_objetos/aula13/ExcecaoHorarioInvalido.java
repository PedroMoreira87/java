package aula13;

public class ExcecaoHorarioInvalido extends ExcecaoSeguranca{
    String mensagem;

    public ExcecaoHorarioInvalido(String msg) {
        mensagem = msg;
    }
}
