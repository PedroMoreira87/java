package programacao_orientada_a_objetos.aula12_prova02;

public abstract class InstrumentoMusical {
    private int coloracao;
    protected double preco;

    public abstract void imprime();

    public InstrumentoMusical(int coloracao, double preco) {
        this.coloracao = coloracao;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String nomeColoracao(){
        switch (coloracao){
            case 1:
                return "Preto";
            case 2:
                return "Castanho";
            case 3:
                return "Amarelo";
            case 4:
                return "Azul";
            case 5:
                return "Vermelho";
            default:
                return "Branco";
        }
    }
}
