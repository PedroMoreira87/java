package aula09_incompleto_lista_duplamente_encadeada_circular;

public class Main {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.insertFirst(8);
        linkedList.insertFirst(6);
        linkedList.insertFirst(4);
        linkedList.insertFirst(2);
        linkedList.print();
    }
}

//                linkedList.insertOrdered(1);
//                linkedList.insertOrdered(2);
//                linkedList.insertFirst(2);
//                linkedList.insertFirst(4);
//                linkedList.insertFirst(6);
//                linkedList.insertFirst(8);
//                linkedList.print();
//                Node node = linkedList.getNode(8);
//                linkedList.insertAfter(node, 10);
//                linkedList.insertLast(12);
//                linkedList.insertOrdered(1);
//                linkedList.removeFirst();
//                linkedList.removeLast();
//                Node node_remove = linkedList.getNode(8);
//                linkedList.remove(node_remove);
//                linkedList.print();
