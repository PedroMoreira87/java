package secao05;

import java.util.Arrays;

public class Ordering_an_array {

    public static void main(String[] args) {

//        int[] array = {45,12,85,32,89,39,69,44,42,1,6,8};
//        int temp;
//        for (int i = 1; i < array.length; i++) {
//            for (int j = i; j > 0; j--) {
//                if (array[j] < array [j - 1]) {
//                    temp = array[j];
//                    array[j] = array[j - 1];
//                    array[j - 1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(array));

        int[] array = {2, 3, 4, 5, 3, 4, 2, 34, 2, 56, 98, 32, 54};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
