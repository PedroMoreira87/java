package secao04;

import java.util.Scanner;

public class E30_ex_array {
    public static void main(String[] args){

        int n1, n2, n3;
        int[] numeros;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        n1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = scan.nextInt();
        System.out.println("Digite o terceiro número: ");
        n3 = scan.nextInt();

        numeros = new int[]{n1, n2, n3};

        System.out.println("Ordem digitada: ");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        int temp;
        for(int i = 0; i < numeros.length; i++){
            for (int j = i; j < numeros.length; j++){
                if(numeros[i] > numeros[j]){
                    temp = numeros[i];
                    numeros[i] = numeros [j];
                    numeros[j] = temp;
                }
            }
        }

        System.out.println("Lista crescente de inteiros: ");
        for(int a: numeros){
            System.out.println(a);
        }
    }
}
