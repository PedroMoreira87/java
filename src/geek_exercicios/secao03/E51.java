package geek_exercicios.secao03;

public class E51 {
    public static void main(String[] args) {
        double Xa = 2;
        double Ya = -3;
        double Xb = 4;
        double Yb = 5;

        double calculo = Math.sqrt(Math.pow(Xb - Xa, 2) + Math.pow(Yb - Ya, 2));

        System.out.printf("A sua distância da origem (0,0) é: %.2f", calculo);

    }
}
