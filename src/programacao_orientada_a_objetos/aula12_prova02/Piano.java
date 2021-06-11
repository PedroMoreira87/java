package programacao_orientada_a_objetos.aula12_prova02;

public class Piano extends InstrumentoMusical {
    private int teclas;
    private String tipo;

    public Piano(int coloracao, double preco, int teclas, String tipo) throws ExcecaoPianoInvalido {
        super(coloracao, preco);
        this.teclas = teclas;
        this.tipo = tipo;

        if (!tipo.equals("Acustico de cauda") && !tipo.equals("Acustico vertical") && !tipo.equals("Digital")){
            System.out.println("Erro: Tipo de Piano [" + tipo + "] inexistente.");
            System.out.println("---------------------");
        }
    }


    @Override
    public void imprime() {
        System.out.println("[Piano]");
        System.out.println("Cor = " + nomeColoracao());
        System.out.println("Teclas = " + getTeclas());
        System.out.printf("Preço = R$ %.2f\n", getPreco());
        System.out.println("Tipo = " + getTipo());
        System.out.println("---------------------");
    }

    public int getTeclas() {
        return teclas;
    }

    public String getTipo() {
        return tipo;
    }
}
