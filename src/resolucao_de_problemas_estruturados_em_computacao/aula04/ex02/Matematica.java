package resolucao_de_problemas_estruturados_em_computacao.aula04.ex02;

import java.util.ArrayList;
import java.util.List;

public class Matematica {

    public double calcularMedia (int[] array) {

        double somatorio = 0;
        for (int j : array) {
            somatorio += j;
        }return somatorio / array.length;
    }

    public List<Integer> calcularModa(int[] array) {
        List<Integer> moda = new ArrayList<>();
        int maxCount = 2;
        for(int i=0; i<array.length; i++) {
            int count = 1;
            for(int j = i + 1; j<array.length; j++)
                if(array[i] == array[j]) count++;
            if(count >= maxCount) {
                if(count > maxCount) {
                    moda.clear();
                    maxCount = count;
                }moda.add(array[i]);
            }
        }return moda;
    }
}
