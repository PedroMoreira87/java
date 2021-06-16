package resolucao_de_problemas_estruturados_em_computacao.aula15_tabela_hash;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashTable hashTable = new HashTable(10);

        hashTable.insert(26252512);
        hashTable.print();

        Scanner scan = new Scanner(System.in);
        int key = 0;
        try{
            while (key != -1) {
                System.out.print("\nDigite a chave: ");
                key = scan.nextInt();

                if (hashTable.search(key))
                    System.out.println("A chave foi encontrada");
                else
                    System.out.println("Chave não encontrada");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Obrigado!");
        }
    }
}