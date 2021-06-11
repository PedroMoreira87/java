package resolucao_de_problemas_estruturados_em_computacao.somativa;

public class Queue {

    LinkedList head;

    public Queue(){
        head = new LinkedList();
    }

    public void isEmpty(){
        head.isEmpty();
    }

    public void push (int new_data){
        head.insertLast(new_data);
    }

    public void pop(){
        head.removeFirst();
    }

    public void print(){
        head.print();
    }
}
