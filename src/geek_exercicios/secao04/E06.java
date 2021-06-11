package secao04;

public class E06 {
    public static void main(String[] args){
        int num1 = 25;
        int num2 = 20;

        if (num1 > num2){
            System.out.printf("O maior número é: %d%nSua diferença é: %d", num1, num1 - num2);
        }else if (num1 == num2){
            System.out.println("Os números são iguais");
        }else{
            System.out.printf("O maior número é: %d%nSua diferença é: %d", num2, num2 - num1);
        }
    }
}
