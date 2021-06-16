package resolucao_de_problemas_estruturados_em_computacao.aula15_tabela_hash;

public class NodeTable {

    private int info;
    private LinkedList list;

    public NodeTable() {
        this.info = -1;
        this.list = null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public LinkedList getList() {
        return list;
    }

    public void setList(LinkedList list) {
        this.list = list;
    }
}
