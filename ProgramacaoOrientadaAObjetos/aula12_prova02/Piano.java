package aula12_prova02;

public class Piano extends InstrumentoMusical {
    private int teclas;
    private String tipo;

    public Piano(int coloracao, double preco, int teclas, String tipo) throws ExcecaoPianoInvalido {
        super(coloracao, preco);
        this.teclas = teclas;
        this.tipo = tipo;

        if(!tipo.equals("Acustico de cauda") && !tipo.equals("Acustico vertical") && !tipo.equals("Digital")){
            System.out.println("Tipo de Piano [" + tipo + "] inexistente.");
            System.out.println("------------------------------");
        }
    }

    @Override
    public void imprime() {
        System.out.println("[Piano}");
        System.out.println("Cor = " + super.nomeColoracao());
        System.out.println("Teclas = " + this.teclas);
        System.out.println("Preço = " + super.getPreco());
        System.out.println("Tipo = " + this.tipo);
        System.out.println("------------------------------");
    }
}
