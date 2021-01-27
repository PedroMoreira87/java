package secao04;

public class E12 {
    static public void main(String[] args){
        int num = 8;

        if (num < 0){
            System.out.println("Numero Invalido");
        }else{
            System.out.printf("%.2f", Math.log(num));
        }
    }
}
