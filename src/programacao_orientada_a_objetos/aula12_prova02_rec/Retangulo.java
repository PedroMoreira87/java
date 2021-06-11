package programacao_orientada_a_objetos.aula12_prova02_rec;

public class Retangulo extends FormaGeometrica{

    private double altura;
    private double largura;

    public Retangulo(int cor, double larg, double alt) throws ExcecaoMedidaIncorreta {
        super(cor);
        this.largura = larg;
        this.altura = alt;

        if (alt < 0.1){
            throw new ExcecaoMedidaIncorreta("Erro: Altura do retangulo deve ser positiva.\n");

        }else if(larg < 0.1){
            throw new ExcecaoMedidaIncorreta("Erro: Largura do retangulo deve ser positiva.\n");
        }
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    @Override
    public double area() {
        return largura * altura;
    }

    @Override
    public double perimetro() {
        return 2 * (largura + altura);
    }

    @Override
    public void imprime() {
        System.out.println("[Retangulo]");
        System.out.println("Cor = " + nomeCor());
        System.out.printf("Altura = %.2f cm\n", getAltura());
        System.out.printf("Largura = %.2f cm\n", getLargura());
        System.out.printf("Area = %.2f cm²\n", area());
        System.out.printf("Perimetro = %.2f cm\n", perimetro());
        System.out.println("---------------------");
    }
}
