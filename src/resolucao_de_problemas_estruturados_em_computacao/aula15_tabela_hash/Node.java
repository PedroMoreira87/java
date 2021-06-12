package resolucao_de_problemas_estruturados_em_computacao.aula15_tabela_hash;

public class Node {

    private Integer data;
    private resolucao_de_problemas_estruturados_em_computacao.somativa.Node next;

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

    public resolucao_de_problemas_estruturados_em_computacao.somativa.Node getNext() {
        return next;
    }

    public void setNext(resolucao_de_problemas_estruturados_em_computacao.somativa.Node next) {
        this.next = next;
    }
}
