package estudo;

public class ExcecaoPianoInvalido extends Exception{
    public ExcecaoPianoInvalido(){

    }

    public ExcecaoPianoInvalido(String msg) {
        super(msg);
    }
}