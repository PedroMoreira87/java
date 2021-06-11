package secao05;

public class E25 {

    public static void main(String[] Args){

        int num = 1000;
        int soma = 0;

        for (int i = 0; i < num; i++){
            if (i % 3 == 0 | i % 5 == 0){
                soma += i;
            }
        }
        System.out.println(soma);
    }
}
