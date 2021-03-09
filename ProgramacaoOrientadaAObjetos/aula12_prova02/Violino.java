package aula12_prova02;

public class Violino extends InstrumentoMusical{
    private int cordas;
    private String tamanho;

    public Violino(int cor, double preco ,int cordas, String tamanho) throws ExcecaoViolinoInvalido{
        super(cor, preco);
        this.cordas = cordas;
        this.tamanho = tamanho;

        if(!tamanho.equals("4/4") && !tamanho.equals("1/2") && !tamanho.equals("1/4")){
            System.out.println("Tamanho de violino [" + tamanho + "] inexistente.");
            System.out.println("------------------------------");
        }
    }

    @Override
    public void imprime() {
        System.out.println("[Violino]");
        System.out.println("Cor = " + super.nomeColoracao());
        System.out.println("Cordas = " + this.cordas);
        System.out.println("Preço = " + super.getPreco());
        System.out.println("Tamanho = " + this.tamanho);
        System.out.println("------------------------------");
    }
}
