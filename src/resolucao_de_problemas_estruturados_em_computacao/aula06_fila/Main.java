package aula06_fila;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Fila f = new Fila(5);

        f.Insere(5);
        f.Imprime();
        f.Insere(10);
        f.Imprime();
        f.Insere(2);
        f.Imprime();
        f.Insere(9);
        f.Imprime();
        f.Insere(3);
        f.Imprime();
        f.Insere(78);
        f.Imprime();

        System.out.println(f.getPrimeiro());
        System.out.println(f.getUltimo());
        System.out.println("O primeiro elemento da fila é: " + f.retornaPrimeiroElemento());

        System.out.println("A fila está cheia? " + f.isFull());
        System.out.println("A fila está vazia? " + f.isEmpty());

        f.Remove();
        f.Imprime();
        f.Insere(89);
        f.Imprime();
        f.Remove();
        f.Imprime();
        f.Remove();
        f.Imprime();
        f.Insere(27);
        f.Imprime();
        f.Remove();
        f.Imprime();
        f.Remove();
        f.Imprime();
        f.Remove();
        f.Imprime();
        f.Remove();
        f.Imprime();

        System.out.println("A fila está cheia? " + f.isFull());
        System.out.println("A fila está vazia? " + f.isEmpty());

        Merge merge = new Merge();

        int[] filaA = {5, 35, 52, 64};
        int s1 = filaA.length;
        int[] filaB = {5, 15, 35, 55, 75};
        int s2 = filaB.length;
        int[] filaC = new int[s1+s2-merge.igual(filaA, filaB, s1, s2)];

        merge.filaMerge(filaA, filaB, s1, s2, filaC);
        System.out.println(Arrays.toString(filaA));
        System.out.println(Arrays.toString(filaB));
        System.out.println(Arrays.toString(filaC));
    }
}
