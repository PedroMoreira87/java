package secao04;

public class E04 {
    public static void main(String[] args){
        double num = 16;

        if (num > 0){
            System.out.printf("%.2f\n" + "%.2f", Math.pow(num, 2), Math.sqrt(num));
        }else{
            System.out.println("Valor incorreto");
        }
    }
}
