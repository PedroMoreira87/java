package programacao_orientada_a_objetos.aula12_prova02_rec;

public class Circulo extends FormaGeometrica{

    private double raio;

    public Circulo(int cor, double raio) throws ExcecaoMedidaIncorreta{
        super(cor);
        this.raio = raio;

        if(raio < 0.1) {
            throw new ExcecaoMedidaIncorreta("Erro: Raio do circulo deve ser positivo.\n");
        }
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double area() {
        return 3.14 * (raio * raio);
    }

    @Override
    public double perimetro() {
        return (2 * 3.14) * raio;
    }

    @Override
    public void imprime() {
        System.out.println("[Circulo]");
        System.out.println("Cor = " + nomeCor());
        System.out.printf("Raio = %.2f cm\n", getRaio());
        System.out.printf("Area = %.2f cm²\n", area());
        System.out.printf("Perimetro = %.2f cm\n", perimetro());
        System.out.println("---------------------");
    }
}
