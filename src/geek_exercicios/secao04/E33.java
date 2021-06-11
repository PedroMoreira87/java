package secao04;

public class E33 {
    private static double produto = 150;
    private static double precoNovo = 0;

    public static void produto(){
        if (produto < 50){
            System.out.printf("O produto vai custar: R$%.2f\n", precoNovo += produto * 1.05);
            precoNovo();
        }else if(produto >= 50 && produto <= 100){
            System.out.printf("O produto vai custar: R$%.2f\n", precoNovo += produto * 1.10);
            precoNovo();
        }else if(produto > 100){
            System.out.printf("O produto vai custar: R$%.2f\n", precoNovo += produto * 1.15);
            precoNovo();
        }
    }

    public static void precoNovo(){
        if (precoNovo < 80){
            System.out.println("Barato");
        }else if (precoNovo >= 80 && precoNovo <= 120){
            System.out.println("Normal");
        }else if (precoNovo > 120 && precoNovo <= 200){
            System.out.println("Caro");
        }else if (precoNovo > 200){
            System.out.println("Muito caro");
        }
    }

    public static void main(String[] args){
        produto();
    }
}