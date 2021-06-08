package aula11_arvore_binaria_avl;

public class Main {

    static TreePrinter<Node> printer = new TreePrinter<>(n -> ("" + n.getData()), Node::getLeft, Node::getRight);

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();



//        binaryTree.insert(100);
//        binaryTree.insert(56);
//        binaryTree.insert(32);
//        binaryTree.insert(80);
//        binaryTree.insert(127);
//        binaryTree.insert(115);
//        binaryTree.remove(32);
//        binaryTree.insert(85);
//        binaryTree.insert(130);
//        binaryTree.insert(82);
//        binaryTree.insert(90);
//        binaryTree.insert(120);
//        binaryTree.remove(80);
//        binaryTree.insert(95);
//        binaryTree.remove(127);
//        binaryTree.insert(40);
//        binaryTree.insert(68);
//        binaryTree.remove(56);
//        binaryTree.remove(40);
//        binaryTree.remove(82);




        binaryTree.insert(50);
        binaryTree.insert(17);
        binaryTree.insert(27);
        binaryTree.insert(89);
        binaryTree.insert(14);
        binaryTree.insert(33);
        binaryTree.insert(31);
        binaryTree.insert(52);
        binaryTree.insert(10);
        binaryTree.insert(18);
        binaryTree.insert(15);
        binaryTree.insert(5);
        binaryTree.insert(7);
        binaryTree.insert(6);
        binaryTree.insert(11);
        binaryTree.insert(12);
        binaryTree.insert(8);
        binaryTree.insert(100);
        binaryTree.insert(56);
        binaryTree.insert(32);
        binaryTree.insert(80);
        binaryTree.insert(127);
        binaryTree.insert(115);
        binaryTree.remove(32);
        binaryTree.insert(85);
        binaryTree.insert(130);
        binaryTree.insert(82);
        binaryTree.insert(90);
        binaryTree.insert(120);
        binaryTree.remove(80);
        binaryTree.insert(95);
        binaryTree.remove(127);
        binaryTree.insert(40);
        binaryTree.insert(68);
        binaryTree.remove(56);
        binaryTree.remove(40);
        binaryTree.remove(82);


        binaryTree.preOrder(binaryTree.getRoot());
        System.out.println("\n==============================");
        binaryTree.inOrder(binaryTree.getRoot());
        System.out.println("\n==============================");
        binaryTree.posOrder(binaryTree.getRoot());
        System.out.println("\n==============================");

        System.out.println(binaryTree.containsNode(68));
        System.out.println(binaryTree.containsNode(656));

        System.out.println("==============================\n");

        printer.setHspace(3);
        printer.setSquareBranches(true);
        printer.printTree(binaryTree.getRoot());
    }
}