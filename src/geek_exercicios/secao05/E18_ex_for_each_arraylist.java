package secao05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class E18_ex_for_each_arraylist {
    public static void main(String[] Args){

        ArrayList<Integer> arrList = new ArrayList<>();
        int num;
        int quantidade;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de números: ");
        quantidade = scan.nextInt();


        for (int i = 0; i < quantidade; i++){
            System.out.println("Digite um número: ");
            num = scan.nextInt();
            arrList.add(num);
        }

//      exemplo de arrayList avançado
        int maxValue = arrList.get(0);
        for (Integer i : arrList) {
            if (i > maxValue) {
                maxValue = i;
            }
        }

//      exemplo de arrayList normal
//      int maxValue = arrList.get(0);
//      for (int i = 0; i < arrList.size(); i ++){
//          if (arrList.get(i) > maxValue){
//              maxValue = arrList.get(i);
//          }
//      }

        int maxCount = 0;
        for (Integer i : arrList) {
            if (i == maxValue){
                maxCount ++;
            }
        }

        System.out.println(maxValue);
//      System.out.println("O maior valor lido é: " + Collections.max(arrayList));
        System.out.println(maxCount);
    }
}
