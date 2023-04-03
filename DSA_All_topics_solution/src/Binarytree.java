import java.util.LinkedList;
import java.util.Queue;

public class Binarytree {
    Object root;
    Binarytree left,right;

    public Binarytree(Object root){
        this.root=root;
    }

    public Binarytree(Object root, Binarytree left, Binarytree right){
        this.root=root;
        this.left=left;
        this.right=right;
    }

    public Object getRoot(){
        return root;
    }

    public Binarytree getLeft(){
        return left;
    }

    public Binarytree getRight(){
        return right;
    }

    public boolean isLeaf(){
        return this.left==null && this.right==null;
    }

    @Override
    public String toString() {
        StringBuilder buff = new StringBuilder();
            if (left != null)
                buff.append(left+",");
        buff.append(root);

        if (right != null)
                buff.append(","+right);
        return buff.toString();
    }

    public Object preOrder(){
        StringBuilder buff = new StringBuilder();
        buff.append(root);
        if (left!=null)
            buff.append("," + left.preOrder());
        if (right!=null)
            buff.append("," + right.preOrder());
        return buff+"";
    }

    public Object postOrder(){
        StringBuilder buff = new StringBuilder();
        if (left!=null)
            buff.append(left.postOrder()+",");
        if (right!=null)
            buff.append(right.postOrder()+",");
        buff.append(root);
        return buff+"";
    }

    public Object inOrder(){
        StringBuilder buff = new StringBuilder();
        if (left!=null)
            buff.append(left.inOrder()+",");
        buff.append(root);
        if (right!=null)
            buff.append("," + right.inOrder());
        return buff+"";
    }

    public int size(){
        if (left==null && right==null)
            return 1;
        if (left==null)
            return 1+right.size();
        if (right==null)
            return 1+ left.size();
        return 1+ left.size()+ right.size();
    }

    public int height(){
        if (root==null)
            return -1;
        int left_c=-1, right_c=-1;
        if (left!=null)
            left_c=left.height();
        if (right!=null)
            right_c=right.height();
        return 1 + Math.max(left_c, right_c);
    }

    public static boolean isFull(Binarytree root){
        int size = (int) Math.pow(2, root.height()+1);
        if (size-1== root.size())
        return true;
        else
            return false;
    }
    public boolean contains(Object obj) {
        if (root.equals(obj)) {
            return true;
        } else {
            boolean leftContains = (left != null && left.contains(obj));
            boolean rightContains = (right != null && right.contains(obj));
            return leftContains || rightContains;
        }
    }public Binarytree search(Object value) {
        if (root.equals(value)) {
            return this;
        } else {
            Binarytree leftResult = null;
            Binarytree rightResult = null;
            if (left != null) {
                leftResult = left.search(value);
            }
            if (right != null) {
                rightResult = right.search(value);
            }
            if (leftResult != null) {
                return leftResult;
            } else {
                return rightResult;
            }
        }
    }public void levelOrder() {
        Queue<Binarytree> queue = new LinkedList<>();
        queue.add(this);

        while (!queue.isEmpty()) {
            Binarytree node = queue.poll();
            System.out.print(node.getRoot() + " ");

            if (node.getLeft() != null) {
                queue.add(node.getLeft());
            }

            if (node.getRight() != null) {
                queue.add(node.getRight());
            }
        }
    }



    public static void main(String[] args) {

        Binarytree b1=new Binarytree("K");
        Binarytree b2=new Binarytree("J");
        Binarytree b3=new Binarytree("F",b1,b2);
        Binarytree b4=new Binarytree("E");
        Binarytree b5=new Binarytree("B",b4,b3);
        Binarytree  b6=new Binarytree("L");
        Binarytree b7=new Binarytree("M");
        Binarytree b8=new Binarytree("C",b6,b7);
        Binarytree b9=new Binarytree("I");
        Binarytree b10=new Binarytree("D",b8,b9);
        Binarytree b11=new Binarytree("A",b5,b10);
//
//        System.out.println();
//        System.out.println(b11);
//        System.out.println(b11.preOrder());
//        System.out.println(b11.postOrder());
//        System.out.println(b11.inOrder());
        b11.levelOrder();
//        Binarytree b1 = new Binarytree(4);
//        Binarytree b2 = new Binarytree(5);
//        Binarytree b3 = new Binarytree(2, b1, b2);
//        Binarytree b4 = new Binarytree(3);
//        Binarytree b5 = new Binarytree(6, null, b4);
//        Binarytree b6 = new Binarytree(1, b3, b5);
//        System.out.println(b6);
////        System.out.println("Root: " + b6.getRoot());
//        System.out.println("Pre-order traversal: " + b6.preOrder());
//        System.out.println("Post-order traversal: " + b6.postOrder());
//       System.out.println("In-order traversal: " + b6.inOrder());
//        System.out.println("contain method:"+b11.contains("I"));
//        System.out.println("Search method:"+b11.search("D"));
//        System.out.println("Size: " + b11.size());
//        System.out.println("Height: " + b11.height());
    }}