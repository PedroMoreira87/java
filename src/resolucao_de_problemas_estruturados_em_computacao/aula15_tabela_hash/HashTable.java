package resolucao_de_problemas_estruturados_em_computacao.aula15_tabela_hash;

public class HashTable {

    private int collision;
    private NodeTable[] table;

    public HashTable (int size) {
        collision = 0;
        table = new NodeTable[size];
        for (int i = 0; i < table.length; i++) {
            table[i] = new NodeTable();
        }
    }

    public NodeTable[] getTable() {
        return table;
    }

    public void setTable(NodeTable[] table) {
        this.table = table;
    }

    public void insert(int key) {
        int hash = key % table.length;
        if (table[hash].getHead() == -1)
            table[hash].setHead(key);
        else {
            if (table[hash].getList() == null)
                table[hash].setList(new LinkedList());
            collision += 1;
            table[hash].getList().insertOrdered(key);
        }
    }

    public void random() {
        for (int i = 0; i < table.length * 0.9; i++) {
            insert((int) Math.floor(Math.random() * (1000000 - 1 + 1) + 1));
        }
    }

    public boolean search(int key) {
        int hash = key % table.length;
        NodeTable nt = table[hash];
        if (nt.getHead() == key)
            return true;
        else
            if (nt.getList() != null)
                return nt.getList().getNode(key) != null;
            return false;
    }

    public void print() {
        for (int i = 0; i < table.length; i++) {
            if (table[i].getHead() != -1)
                System.out.println(table[i].getHead());
            if (table[i].getList() != null)
                table[i].getList().print();
        }
    }
}
