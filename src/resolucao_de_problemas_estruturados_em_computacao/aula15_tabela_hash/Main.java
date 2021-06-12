package resolucao_de_problemas_estruturados_em_computacao.aula15_tabela_hash;

public class Main {
    public static void main(String[] args) {

        HashTable hashTable = new HashTable(10);

        hashTable.random();
        hashTable.insert(20);

        hashTable.print();

        System.out.println(hashTable.search(359910));
    }
}