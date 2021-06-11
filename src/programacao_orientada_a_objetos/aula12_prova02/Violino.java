package programacao_orientada_a_objetos.aula12_prova02;

public class Violino extends InstrumentoMusical{
    private int cordas;
    private String tamanho;

    public Violino(int cor, double preco, int cordas, String tamanho) throws ExcecaoViolinoInvalido {
        super(cor, preco);
        this.cordas = cordas;
        this.tamanho = tamanho;

        if (!tamanho.equals("4/4") && !tamanho.equals("1/2") && !tamanho.equals("1/4")){
            System.out.println("Erro: Tamanho de violino [" + tamanho + "] inexistente.");
            System.out.println("---------------------");
        }
    }

    @Override
    public void imprime() {
        System.out.println("[Violino]");
        System.out.println("Cor = " + nomeColoracao());
        System.out.println("Cordas = " + getCordas());
        System.out.printf("Preço = R$ %.2f\n", getPreco());
        System.out.println("Tamanho = " + getTamanho());
        System.out.println("---------------------");
    }

    public int getCordas() {
        return cordas;
    }

    public String getTamanho() {
        return tamanho;
    }
}
