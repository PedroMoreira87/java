package somativa;

public class LinkedList {

    private Node head;

    public LinkedList(){
        this.head = null;
    }

    public Node getNode(int data) {
        Node current = head;
        while (current != null) {
            if (current.getData() == data){
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void insertFirst(int new_data){
        Node new_node = new Node();
        new_node.setData(new_data);
        new_node.setNext(head);
        head = new_node;
    }

    public void insertAfter(Node prev_node, int new_data){
        if (prev_node == null){
            System.out.println("The previous node doesn't exist");
        }else{
            Node new_node = new Node();
            new_node.setData(new_data);
            new_node.setNext(prev_node.getNext());
            prev_node.setNext(new_node);
        }
    }

    public void insertLast(int new_data){
        if (isEmpty()){
            insertFirst(new_data);
        }else{
            Node new_node = new Node();
            new_node.setData(new_data);

            Node last = head;
            while(last.getNext() != null){
                last = last.getNext();
            }new_node.setNext(null);
            last.setNext(new_node);
        }
    }

    public void insertOrdered(int new_data){
        Node new_node = new Node();
        Node current = head;
        new_node.setData(new_data);
        if (isEmpty() || head.getData() >= new_node.getData()) {
            new_node.setNext(head);
            head = new_node;
        }else{
            while (current.getNext() != null && current.getNext().getData() < new_node.getData()) {
                current = current.getNext();
            }if (current.getNext() != null && current.getNext().getData() > new_node.getData()){
                new_node.setNext(current.getNext());
            }else{
                new_node.setNext(null);
            }
            current.setNext(new_node);
        }
    }

    public void print(){
        Node current = head;
        if (head == null) {
            System.out.println("The list is empty");
        }else {
            while (current != null){
                if (current.getNext() == null){
                    System.out.println(current.getData());
                }else{
                    System.out.print(current.getData()+", ");
                }current = current.getNext();
            }
        }
    }

    public Node removeFirst(){
        Node temp = head;
        if (isEmpty()){
            System.out.println("The node is empty");
        }else{
            head = head.getNext();
            temp.setNext(null);
        }
        return temp;
    }

    public Node removeLast(){
        Node second_last = head;
        if (isEmpty()){
            System.out.println("The node is empty");
        }else{
            while (second_last.getNext().getNext() != null) {
                second_last = second_last.getNext();
            }second_last.setNext(null);
        }
        return second_last;
    }

    public Node remove(Node node_remove){
        Node current = head;
        if (node_remove == null) {
            System.out.println("The node_remove doesn't exist");
            return null;
        }
        else if (isEmpty()){
            System.out.println("The node is empty");
        }else{
            if (node_remove == head){
                head = head.getNext();
            }else{
                while (current != null && current.getNext() != node_remove) {
                    current = current.getNext();
                }
                if (current == null){
                    return null;
                }
                current.setNext(node_remove.getNext());
            }
            node_remove.setNext(null);
        }
        return node_remove;
    }

    public Node getLast() {
        Node last = head;
        while (last.getNext() != null) {
            last = last.getNext();
        }
        System.out.println(last.getData());
        return last;
    }
}
