package secao04;

public class E07 {
    public static void main(String[] args){
        int num1 = 30;
        int num2 = 30;

        if (num1 > num2){
            System.out.printf("O número %d é maior", num1);
        }else if (num2 > num1){
            System.out.printf("O número %d é maior", num2);
        }else{
            System.out.printf("Os números %d e %d são iguais", num1, num2);
        }
    }
}
