public class AvlTree {

    private int key, height;
    private AvlTree left, right;
    public static final AvlTree NIL = new AvlTree();

    public AvlTree(int key) {
        this.key = key;
        left = right = NIL;
    }

    private AvlTree() {
        left = right = this;
        height = -1;
    }

    private AvlTree(int key, AvlTree left, AvlTree right) {
        this.key = key;
        this.left = left;
        this.right = right;
        height = 1 + Math.max(left.height, right.height);
    }

    public boolean add(int key) {
        int oldSize = size();
        grow(key);
        return size() > oldSize;

    }

    public AvlTree grow(int key) {
        if (this == NIL)
            return new AvlTree(key);
        if (key == this.key)
            return this; // it stop key duplications:
        if (key < this.key)
            left = left.grow(key);
        else
            right = right.grow(key);
        reBalance();
        height = 1 + Math.max(left.height, right.height);
        return this;
    }

    public int size() {
        if (this == NIL)
            return 0;
        return 1 + left.size() + right.size();

    }

    public String toString() {
        if (this == NIL)
            return "";
        return left + " " + key + " " + right;
    }

    public void reBalance() {
        if (right.height > left.height + 1) {
            if (right.left.height > right.right.height)
                right.rotateRight();
            rotateLeft();
        } else if (left.height > right.height + 1) {
            if (left.right.height > left.left.height)
                left.rotateLeft();
            rotateRight();

        }

    }

    private void rotateLeft() {
        left = new AvlTree(key, left, right.left);
        key = right.key;
        right = right.right;

    }

    private void rotateRight() {
        right = new AvlTree(key, left, right.right);
        key = left.key;
        left = left.left;
    }
    public AvlTree getLeftmost() {
        AvlTree current = this;
        while (current.left != NIL) {
            current = current.left;
        }
        return current;
    }

    public AvlTree getRightmost() {
        AvlTree current = this;
        while (current.right != NIL) {
            current = current.right;
        }
        return current;
    }


    public static void main(String[] args) {
        AvlTree avlTree = new AvlTree(10);
        avlTree.add(5);
        avlTree.add(25);
        System.out.println(avlTree);
        System.out.println(avlTree.getLeftmost());
        System.out.println(avlTree.getRightmost());
        avlTree.reBalance();

    }
}