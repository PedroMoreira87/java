package resolucao_de_problemas_estruturados_em_computacao.aula15_tabela_hash;

public class NodeTable {

    private int head;
    private LinkedList list;

    public NodeTable() {
        this.head = -1;
        this.list = null;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public LinkedList getList() {
        return list;
    }

    public void setList(LinkedList list) {
        this.list = list;
    }
}
