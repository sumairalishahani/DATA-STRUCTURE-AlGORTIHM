public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root,int data){
        if (root==null)
        {
            root=new Node(data);
            return root;
        }
        if (root.data>data){
            root.left=insert(root.left,data);
        }
        else{
            root.right=insert(root.right,data);
        }
        return root;
    }
    public static void inOrder(Node root){
        if (root==null)return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }
    public static boolean search(Node root,int key){
        if(root==null)return false;
        if (root.data>key){
            return search(root.left,key);
        } else if (root.data==key) {
            return true;
        }else {

            return search(root.right,key);
        }
    }
    public static Node Delete(Node root,int val){
        if (root.data>val){
            root.left=Delete(root.left,val);
        } else if (root.data<val) {
            root.right=Delete(root.right,val);

        }else{
            // case1
            if (root.left==null&& root.right==null){
                return null;
            }
            // case 2
            if (root.left==null)
                return root.right;
        }
        if (root.right==null)
            return root.left;

        // case 3
        Node IS=inOrderSuccessor(root.right);
        root.data=IS.data;
        root.right=Delete(root.right, IS.data);

        return root;


    }
    public static Node inOrderSuccessor(Node root){
        while (root.left!=null)
            root=root.left;

        return root;

    }

    public static void main(String[] args) {
        int values[]={99,45,155,133,176,23,76,72,91,197,14,153,87};


        Node root=null;
        for (int i=0;i< values.length;i++){
            root=insert(root,values[i]);
        }
       // inOrder(root);
        System.out.println();
        Delete(root,99);

        inOrder(root);

//            System.out.println("not found");
    }
}
