package secao04;

public class E03 {
    public static void main(String[] args){

        int num = -10;

        if (num > 0){
            System.out.printf("%.2f", Math.sqrt(num));
        }else{
            System.out.printf("%.2f", Math.pow(num, 2));
        }
    }
}
