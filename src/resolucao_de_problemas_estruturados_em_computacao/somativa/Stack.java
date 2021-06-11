package resolucao_de_problemas_estruturados_em_computacao.somativa;

public class Stack {

    LinkedList head;

    public Stack(){
        head = new LinkedList();
    }

    public void isEmpty(){
        head.isEmpty();
    }

    public void push (int new_data){
        head.insertLast(new_data);
    }

    public void pop(){
        head.removeLast();
    }

    public void peek(){
        head.getLast();
    }

    public void print(){
        head.print();
    }
}
