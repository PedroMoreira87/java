package aula06_fila;

public class Merge {

    private int i = 0, j = 0, k = 0;
    private int contador = 0;

    public Merge() {
     }

    public void filaMerge(int[] filaA, int[] filaB, int s1, int s2, int[] filaC){
        // s1 é o tamanho do array 1 e s2 é o tamanho do array 2
        while (i < s1 && j < s2){
            if (filaA[i] < filaB[j]){
                filaC[k++] = filaA[i++];
            }else if (filaA[i] == filaB[j]){
                filaC[k++] = filaA[i++];
                j++;
            }else{
                filaC[k++] = filaB[j++];
            }
    }
        while (i < s1){
            filaC[k++] = filaA[i++];
        }
        while (j < s2){
            filaC[k++] = filaB[j++];
        }
    }

    // percorre os 2 arrays contando números repetidos para depois diminuir do tamanho do 3 array
    public int igual(int[] filaA, int[] filaB, int s1, int s2){
        for (int i = 0; i < s1;i++){
            for (int j = 0; j < s2;j++){
                if (filaA[i] == filaB[j]){
                    contador++;
                }
            }
        }return contador;
    }
}
