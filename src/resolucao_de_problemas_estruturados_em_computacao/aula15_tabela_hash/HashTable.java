package resolucao_de_problemas_estruturados_em_computacao.aula15_tabela_hash;

import java.util.Random;

public class HashTable {

    private int collision;
    private NodeTable[] table;

    public HashTable (int size) {
        collision = 0;
        table = new NodeTable[size];
        fillTable();
        random();
    }

    public NodeTable[] getTable() {
        return table;
    }

    public void setTable(NodeTable[] table) {
        this.table = table;
    }

    public void insert(int key) {
        int hash = key % table.length;
        if (table[hash].getInfo() == -1)
            table[hash].setInfo(key);
        else {
            if (table[hash].getList() == null)
                table[hash].setList(new LinkedList());
            collision += 1;
            table[hash].getList().insertOrdered(key);
        }
    }

    public void fillTable() {
        for (int i = 0; i < table.length; i++) {
            table[i] = new NodeTable();
        }
    }

    public void random() {
        Random random = new Random();
        for (int i = 0; i < table.length * 0.9; i++) {
            insert(random.nextInt(1000001 - 0));
        }
    }

    public void print() {
        for (int i = 0; i < table.length; i++) {
            System.out.print(i + ": ");
            if (table[i].getList() == null)
                System.out.println(table[i].getInfo());
            else {
                System.out.print(table[i].getInfo() + ", ");
                table[i].getList().print();
            }
        }
    }

    public boolean search(int key) {
        int hash = key % table.length;
        if (table[hash].getInfo() == key)
            return true;
        else if (table[hash].getList() != null)
            return table[hash].getList().getNode(key) != null;
        return false;
    }
}
