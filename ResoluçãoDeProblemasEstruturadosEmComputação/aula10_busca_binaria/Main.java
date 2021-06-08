package aula10_busca_binaria;

public class Main {
    public static void main(String[] args) {
//        int[] dados = {10, 12, 14, 15, 22, 37, 45, 48, 49, 52, 56, 58, 62, 68};
        int[] dados = {10, 12, 14, 15, 22};

        BinarySearch binarySearch = new BinarySearch();

        int result = binarySearch.binarySearch(dados, 10);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println(result);
    }
}
