package secao04;

public class E25 {
    public static void main(String[] args){

        double a = 2;
        double b = 4;
        double c = -6;
        double delta = Math.pow(b, 2) - 4 * a * c;

        double r1 = (- b + Math.sqrt(delta)) / (2 * a);
        double r2 = (- b - Math.sqrt(delta)) / (2 * a);

        if (delta < 0){
            System.out.println("Não existem raizes reais");
        }else if (delta == 0){
            System.out.println("Existe apenas uma raiz");
            System.out.printf("%.2f", r1);
        }else
            System.out.printf("%.2f\n", r1);
            System.out.printf("%.2f", r2);
    }
}
