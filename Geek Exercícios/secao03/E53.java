package secao03;

public class E53 {
    public static void main(String[] args) {
        double comprimento = 25;
        double largura = 30;
        double precoTela = 8.60;

        double area = comprimento * largura;
        double custo = precoTela * area;

        System.out.printf("Area do terreno: %.2fm2%n", area);
        System.out.printf("O preço será: R$%.2f", custo);
    }
}
