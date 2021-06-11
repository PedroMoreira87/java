package secao05;

public class E02_ex_for_while_do {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        for (int i = 0; i < 100; i++){

            num1 += 1;
            System.out.println(num1);
        }

        System.out.println("==============================");

        while (num2 < 100){

            num2 += 1;
            System.out.println(num2);
        }

        System.out.println("==============================");

        do {

            num3 += 1;
            System.out.println(num3);
        }while( num3 < 100);

    }
}
