package aula04.ex02;

public class Main {
    public static void main(String[] args) {

        Matematica mat = new Matematica();

        int[] array = {25, 30, 12, 45, 12};
        int[] array1 = {4, 5, 4, 6, 5, 2, 2, 5, 2};

        System.out.println(mat.calcularMedia(array));
        System.out.println(mat.calcularModa(array1));

    }
}
