package aula01;

import java.util.ArrayList;

public class Altura {
    public static void main(String[] args) {

        ArrayList<Double> arrList = new ArrayList<>();

        arrList.add(1.71);
        arrList.add(1.60);
        arrList.add(1.45);
        arrList.add(1.90);

        double maxValue = arrList.get(0);
        for (Double i : arrList) {
            if (i > maxValue) {
                maxValue = i;
            }
        }
        System.out.println(maxValue);
    }
}
