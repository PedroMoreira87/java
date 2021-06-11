package secao05;

public class E31 {

    public static void main(String[] Args){

        int s = 0;
        int numerador = 0;
        int denominador = 0;

        for (int i = 0; i < 50; i ++){
            numerador += 2;
            denominador += 1;
            if (denominador == 50){
                denominador -= 1;
            }
        }
        System.out.println(numerador);
        System.out.println(denominador);
        s += numerador/denominador;
        System.out.println(s);
    }
}
