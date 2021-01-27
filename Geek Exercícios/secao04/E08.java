package secao04;

public class E08 {
    public static void main(String[] args){
        double nota1 = 7.5;
        double nota2 = 3.0;

        if ((nota1 >= 0 && nota1 <= 10) && (nota2 >= 0 && nota2 <= 10)){
            System.out.printf("A sua média é: %.2f", (nota1 + nota2) / 2);
        }else{
            System.out.println("Valores das notas incorretos");
        }
    }
}
