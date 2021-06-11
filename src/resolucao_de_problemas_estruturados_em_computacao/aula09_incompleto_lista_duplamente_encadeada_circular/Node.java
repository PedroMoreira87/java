package resolucao_de_problemas_estruturados_em_computacao.aula09_incompleto_lista_duplamente_encadeada_circular;

public class Node {

    private Integer data;
    private Node next;
    private Node previous;

    public Node() {
        this.data = null;
        this.next = null;
        this.previous = null;
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

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
