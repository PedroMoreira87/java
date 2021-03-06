package resolucao_de_problemas_estruturados_em_computacao.aula07_lista_encadeada;

public class Node {

    private Integer data;
    private Node next;

    public Node() {
        this.data = null;
        this.next = null;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
