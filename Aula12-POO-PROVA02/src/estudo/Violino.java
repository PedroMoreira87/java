package estudo;

import prova02.ExcecaoViolinoInvalido;

public class Violino extends InstrumentoMusical{
    private int cordas;
    private String tamanho;


    public Violino(int cor, double preco, String tamanho, int cordas) throws ExcecaoViolinoInvalido {
        super(cor, preco);
        this.tamanho = tamanho;
        this.cordas = cordas;

        if (!tamanho.equals("4/4") & !tamanho.equals("1/2") & !tamanho.equals("1/4")){
            System.out.println("Erro: Tamanho de violino [" + tamanho + "] inexistente.");
            System.out.println("---------------------");
        }
    }

    @Override
    public void imprime() {
        System.out.println("[Violino]");
        System.out.println("Cor = " + nomeColocacao());
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
