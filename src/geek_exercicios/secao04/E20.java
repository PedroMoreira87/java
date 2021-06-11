package secao04;

public class E20 {
    static public void main(String[] args){
        double a = 20;
        double b = 21;
        double c = 23;

        if (a < b+c && b < a+c && c < a+b){
            if (a == b && a == c && b == c){
                System.out.println("É um triângulo equilátero");
            }else if (a == b || a == c || b == c){
                    System.out.println("É um triângulo isósceles");
            }else
                System.out.println("É um triângulo escaleno");
        }else
            System.out.println("Não é um triângulo");
    }
}
