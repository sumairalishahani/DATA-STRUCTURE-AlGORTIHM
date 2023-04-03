public class Binarytrree {
   static Object root;
   static Binarytrree left,right;
    Binarytrree(Object root){
        this.root=root;
    }
    Binarytrree(Object root,Binarytrree left,Binarytrree right){
        this.root=root;
        this.left=left;
        this.root=right;
    }

    public Object getRoot(){
        return root;
    }public  Binarytrree getLeft(){
        return left;

    }public  Binarytrree getRight(){
        return right;
    }
    public  String toString(){
        StringBuffer buff=new StringBuffer();
        buff.append(root);
        if (left!=null)
            buff.append(left+",");
        if (right!=null)
            buff.append(","+right);
        return buff+" ";
    }
    public  static Object preOrder(){
        StringBuffer buff=new StringBuffer();
        buff.append(root);
        if (left!=null)
            buff.append(left.preOrder()+",");
        if (right!=null)
            buff.append(right.preOrder()+",");
        return buff+" ";
    }
    public  Object postOrder(){
        StringBuffer buff=new StringBuffer();
        if (left!=null)
            buff.append(left.preOrder()+",");
        if (right!=null)
            buff.append(right.preOrder()+",");
        buff.append(root);
        return buff+" ";
    }
    public  Object InOrder(){
      StringBuffer buff=new StringBuffer();
        if (left!=null)
            buff.append(left.InOrder()+",");
        buff.append(root);
        if (right!=null)
            buff.append(right.InOrder()+",");
        return buff+" ";
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
        if (root==null)return -1;
        int left_c=0,right_c=0;
        if (left!=null)
            left_c=1+left.height();
        if (right!=null)
            right_c=1+right.height();
        return left_c>right_c?left_c:right_c;
    }
    public static boolean isFull(Binarytrree root){
        int size= (int) Math.pow(2,root.height()+1);
        if (size-1== root.size())
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        Binarytrree b1=new Binarytrree(4);
        Binarytrree b2=new Binarytrree(5);
        Binarytrree b3=new Binarytrree(2,b1,b2);
        Binarytrree b4=new Binarytrree(3);
        Binarytrree b5=new Binarytrree(6,null,b4);
        Binarytrree b6=new Binarytrree(1,b4,b5);
        System.out.println(b6.getRoot());
        
        preOrder();








    }

}
