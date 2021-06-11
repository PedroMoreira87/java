package resolucao_de_problemas_estruturados_em_computacao.aula11_arvore_binaria_avl;

public class BinaryTree {

    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node insertRecursive(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }else if (node.getData() > data) {
            node.setLeft(insertRecursive(node.getLeft(), data));
            if (balancing(node) == 2) { // balancing node
                if (balancing(node.getLeft()) == -1){
                    node.setLeft(leftRotation(node.getLeft()));
                }node = rightRotation(node);
            }
        }else if (node.getData() < data) {
            node.setRight(insertRecursive(node.getRight(), data));
            if (balancing(node) == -2) { // balancing node
                if (balancing(node.getRight()) == 1) {
                    node.setRight(rightRotation(node.getRight()));
                }node = leftRotation(node);
            }
        }return node;
    }

    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    public void preOrder(Node node) {    // preOrder: root, left, right
        if (node != null) {
            System.out.print(node.getData() + " ");
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    public void inOrder(Node node) {    // inOrder: left, root, right
        if (node != null){
            inOrder(node.getLeft());
            System.out.print(node.getData() + " ");
            inOrder(node.getRight());
        }
    }

    public void posOrder(Node node) {   // posOrder: left, right, root
        if (node != null) {
            posOrder(node.getLeft());
            posOrder(node.getRight());
            System.out.print(node.getData() + " ");
        }
    }

    public boolean containsNodeRecursive(Node node, int data) {
        if (node == null) {
            return false;
        }else if (data == node.getData()) {
            return true;
        }else if (node.getData() > data){
            return containsNodeRecursive(node.getLeft(), data);
        }else{
            return containsNodeRecursive(node.getRight(), data);
        }
    }

    public boolean containsNode(int data) {
        return containsNodeRecursive(root, data);
    }

    public Node deleteRecursive(Node node, int data) {
        if (node == null) {
            return null;
        }else if (node.getData() == data) {
            if (node.getLeft() == null && node.getRight() == null) { // noChildren // leaf
                if (balancing(node) == 2) { // balancing node
                    if (balancing(node.getLeft()) == -1){
                        node.setLeft(leftRotation(node.getLeft()));
                    }node = rightRotation(node);
                }else if (balancing(node) == -2) { // balancing node
                    if (balancing(node.getRight()) == 1) {
                        node.setRight(rightRotation(node.getRight()));
                    }node = leftRotation(node);
                }
                return null;
            }else if (node.getLeft() == null) { // oneChild
                if (balancing(node) == 2) { // balancing node
                    if (balancing(node.getLeft()) == -1){
                        node.setLeft(leftRotation(node.getLeft()));
                    }node = rightRotation(node);
                }else if (balancing(node) == -2) { // balancing node
                    if (balancing(node.getRight()) == 1) {
                        node.setRight(rightRotation(node.getRight()));
                    }node = leftRotation(node);
                }
                return node.getRight();
            }else if (node.getRight() == null) { // oneChild
                if (balancing(node) == 2) { // balancing node
                    if (balancing(node.getLeft()) == -1){
                        node.setLeft(leftRotation(node.getLeft()));
                    }node = rightRotation(node);
                }else if (balancing(node) == -2) { // balancing node
                    if (balancing(node.getRight()) == 1) {
                        node.setRight(rightRotation(node.getRight()));
                    }node = leftRotation(node);
                }
                return node.getLeft();
            }else {                              // twoChildren
                int smallestValue = findSmallestValue(node.getRight());
                node.setData(smallestValue);
                node.setRight(deleteRecursive(node.getRight(), smallestValue));
                if (balancing(node) == 2) { // balancing node
                    if (balancing(node.getLeft()) == -1){
                        node.setLeft(leftRotation(node.getLeft()));
                    }node = rightRotation(node);
                }else if (balancing(node) == -2) { // balancing node
                    if (balancing(node.getRight()) == 1) {
                        node.setRight(rightRotation(node.getRight()));
                    }node = leftRotation(node);
                }
                return node;
            }
        }else if (node.getData() > data) {
            node.setLeft(deleteRecursive(node.getLeft(), data));
        }else {
            node.setRight(deleteRecursive(node.getRight(), data));
        }return node;
    }

    private int findSmallestValue(Node node) { // it searches the smallest smallest node of the soon inside the binary tree
        if (node.getLeft() == null) {
            return node.getData();
        }else {
            return findSmallestValue(node.getLeft());
        }
    }

    public void remove(int data) {
        root = deleteRecursive(root, data);
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }int left = height(node.getLeft());
        int right = height(node.getRight());
        if(left > right) {
            return 1 + left;
        }return 1 + right;
    }

    public int balancing(Node node) { // it is balanced if all the balancing factors are 0, -1 and 1
        return height(node.getLeft()) - height(node.getRight());
    }

    public Node leftRotation(Node node) {
        Node newRoot = node.getRight();
        Node temp = newRoot.getLeft();
        newRoot.setLeft(node);
        node.setRight(temp);
        return newRoot;
    }

    public Node rightRotation(Node node) {
        Node newRoot = node.getLeft();
        Node temp = newRoot.getRight();
        newRoot.setRight(node);
        node.setLeft(temp);
        return newRoot;
    }

//    public void totalBalancing(Node node) {
//        if (balancing(node) == 2) { // balancing node
//            if (balancing(node.getLeft()) == -1){
//                node = (leftRotation(node.getLeft()));
//            }rightRotation(node);
//        }else if (balancing(node) == -2) { // balancing node
//            if (balancing(node.getRight()) == 1) {
//                node = (rightRotation(node.getRight()));
//            }leftRotation(node);
//        }
//    }
}