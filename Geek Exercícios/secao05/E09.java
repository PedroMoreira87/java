package secao05;

import java.util.ArrayList;
import java.util.Scanner;

public class E09 {

    public static void main(String[] Args){

        ArrayList<Integer> arrayList = new ArrayList<>();
        int num;
        int maxNum;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o máximo de números: ");
        maxNum = scan.nextInt();

        for (int i = 0; i < maxNum; i ++){

            System.out.println("Digite um número: ");
            num = scan.nextInt();

            if(num % 2 != 0){
                arrayList.add(num);
            }
        }
        System.out.println(arrayList);
    }
}
