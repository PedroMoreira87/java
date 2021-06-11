package secao05;

public class E29 {

    public static void main (String[] Args){

        double s = 0;
        int denominador = 2;

        for (int i = 1; i < 5; i ++){

            s += i/fatorial (denominador);
            denominador += 2;
        }
        System.out.printf("%.4f", s);
    }

    public static double fatorial (int n){
        double fact = 1;

        for (int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
}
