package secao05;

public class E29 {

    public static void main (String[] Args){

        double s = 0;
        double fact = 1;
        double numerador = 1;

        for (int i = 2; i <= 8; i ++){
            fact *= i;
            s += numerador/fact;
            numerador ++;
        }
        System.out.printf("%.2f", s);
    }
}
