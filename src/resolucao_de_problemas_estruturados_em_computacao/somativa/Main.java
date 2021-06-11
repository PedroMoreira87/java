package resolucao_de_problemas_estruturados_em_computacao.somativa;

public class Main {

    public static void main(String[] args) {

            System.out.println("Linked List: ");
            LinkedList linkedList = new LinkedList();

            linkedList.insertOrdered(1);
            linkedList.insertOrdered(2);
            linkedList.insertFirst(2);
            linkedList.insertFirst(4);
            linkedList.insertFirst(6);
            linkedList.insertFirst(8);
            linkedList.print();
            Node node = linkedList.getNode(8);
            linkedList.insertAfter(node, 10);
            linkedList.insertLast(12);
            linkedList.insertOrdered(1);
            linkedList.removeFirst();
            linkedList.removeLast();
            Node node_remove = linkedList.getNode(8);
            linkedList.remove(node_remove);
            linkedList.print();

            System.out.println("====================================");

            System.out.println("List: ");
            Queue queue = new Queue();
            queue.push(10);
            queue.push(2);
            queue.push(5);
            queue.print();
            queue.pop();
            queue.push(20);
            queue.push(30);
            queue.print();

            System.out.println("====================================");

            System.out.println("Stack: ");
            Stack stack = new Stack();
            stack.push(10);
            stack.push(2);
            stack.push(5);
            stack.print();
            stack.pop();
            stack.push(20);
            stack.push(30);
            stack.print();
            stack.peek();
    }
}
