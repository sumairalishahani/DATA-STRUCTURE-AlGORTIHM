public class AVLTree {
    private int key,height;
    private AVLTree left,right;
    private AVLTree(){
        left=right=this;
        height=-1;
    }
    private AVLTree(int key,AVLTree left,AVLTree right){
        this.key=key;
        this.left=left;
        this.right=right;
        height=1+Math.max(left.height,right.height);
    }
    public static final AVLTree NIL=new AVLTree();
    public AVLTree(int key){
        this.key=key;
        left=right=NIL;
    }
    public boolean add(int key){
        int oldSize=size();
        grow(key);
        return size()>oldSize;
    }
    public int size(){
        if (this==NIL)return 0;
        return 1+left.size()+ right.size();
    }
    public AVLTree grow(int key){
        if (this==NIL)return new AVLTree(key);
        if (key==this.key)return this;
        if (key<this.key)left=left.grow(key);
        else {

            right = right.grow(key);
            rebalance();
            height = 1 + Math.max(left.height, right.height);
        }
        return this;
    }
    public String toString(){
        if (this==NIL)return " ";
        return left+" "+key+" "+right;
    }
    public  Object InOrder(){
        StringBuffer buff=new StringBuffer();
        if (left!=null)
            buff.append(left.InOrder()+",");
        buff.append(key);
        if (right!=null)
            buff.append(right.InOrder()+",");
        return buff+" ";
    }
    private void rotateLeft(){
        left=new AVLTree(key,left,right.left);
        key= right.key;
        right=right.right;
    }
    private void rotateRight(){
        right=new AVLTree(key,left.right,right);
        key= left.key;
        left=left.left;
    }
    private void rebalance(){
        if (right.height>left.height+1);// simple rotate
        {
            if (right.left.height>right.height);
            right.rotateRight();
            rotateLeft();
        }
        if (left.height>right.height+1){
            if (left.right.height>left.left.height)

            left.rotateLeft();
            rotateRight();
        }
    }





}
