

class BinarySearchTree {
    Node root;

    class Node {
        char value;
        Node left;
        Node right;

        public Node(char value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    public void insert(char value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent = null;

        while (true) {
            parent = current;

            if (value < current.value) {
                current = current.left;
                if (current == null) {
                    parent.left = newNode;
                    return;
                }
            } else {
                current = current.right;
                if (current == null) {
                    parent.right = newNode;
                    return;
                }
            }
        }
    }

    public static void inOrder(Node root) {
        if (root== null) return;
            inOrder(root.left);
            System.out.print(root.value + " ");
            inOrder(root.right);

    }

    public static void main(String[] args) {
        BinarySearchTree obj=new BinarySearchTree();
        obj.insert('A');
        obj.insert('B');
        obj.insert('C');
        obj.insert('D');
        obj.insert('E');
        obj.insert('F');
        obj.insert('G');
        obj.insert('H');
        obj.insert('I');
        obj.insert('J');
        obj.insert('K');
        obj.insert('L');
        obj.insert('M');
        obj.insert('N');
        obj.insert('O');
        obj.insert('P');
        inOrder(obj.root);


    }
}
