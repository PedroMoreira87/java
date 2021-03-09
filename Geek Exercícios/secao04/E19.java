package secao04;

public class E19 {
    static public void main(String[] args){
        int num = 10;

        if (num % 3 == 0 || num % 5 == 0){
            if (num % 3 == 0 && num % 5 == 0){
                System.out.println("Incorreto");
            }else
                System.out.println("Correto");
        }else
            System.out.println("Incorreto");


    }
}
