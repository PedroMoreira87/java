package secao05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class E08_ex_array_arraylist {

    public static void main(String[] Args) {

        ArrayList arrayList1 = new ArrayList();
        Array array1 = new Array();

        arrayList1.imprimir();
        array1.imprimir();
    }


//  ==================================================
//  exemplo com ArrayList
    public static class ArrayList {

        public java.util.ArrayList<Integer> arrList = new java.util.ArrayList<>();
        public int num;

        Scanner scan = new Scanner(System.in);

        public void arrayList(){
            for (int i = 0; i < 10; i++) {

                System.out.println("Escreva um número: ");
                num = scan.nextInt();
                arrList.add(num);
            }
            System.out.println(arrList);
        }

        public void imprimir(){
            arrayList();
            System.out.println("O menor valor é: " + Collections.min(arrList));
            System.out.println("O maior valor é: " + Collections.max(arrList));
        }
    }


//  ==================================================
//  exemplo com Array
    public static class Array {
        public int[] array = new int[10];

        Scanner scan1 = new Scanner(System.in);

        public void array(){
            for(int i = 0; i < 10; i++){

                System.out.println("Escreva um número: ");
                array[i] = scan1.nextInt(); // o [i] nesse caso é o indice do array
            }

            System.out.println(Arrays.toString(array));
        }

//      Method for getting the maximum value
        public int getMax(int[] inputArray){
            int maxValue = inputArray[0];
            for(int i=1;i < inputArray.length;i++){
                if(inputArray[i] > maxValue){
                    maxValue = inputArray[i];
                }
            }
            return maxValue;
        }

//      Method for getting the minimum value
        public int getMin(int[] inputArray) {
            int minValue = inputArray[0];
            for (int i = 1; i < inputArray.length; i++) {
                if (inputArray[i] < minValue) {
                    minValue = inputArray[i];
                }
            }
            return minValue;
        }

        public void imprimir(){
            array();
            System.out.println(getMin(array));
            System.out.println(getMax(array));
        }
    }
}
