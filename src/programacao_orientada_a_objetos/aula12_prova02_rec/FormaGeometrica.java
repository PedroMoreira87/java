package programacao_orientada_a_objetos.aula12_prova02_rec;

public abstract class FormaGeometrica {
    private int cor;

    public abstract double area();
    public abstract double perimetro();
    public abstract void imprime();

    public FormaGeometrica(int cor) throws ExcecaoCorIncorreta{
        this.cor = cor;

        if(cor < 1) {
            throw new ExcecaoCorIncorreta("Erro: A cor deve ter um valor inteiro positivo.\n");
        }
    }

    public String nomeCor(){
        switch (cor){
            case 1:
                return "Azul";
            case 2:
                return "Vermelho";
            case 3:
                return "Amarelo";
            case 4:
                return "Branco";
            default:
                return "Preto";
        }
    }
}
