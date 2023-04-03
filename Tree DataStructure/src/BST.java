public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int val){
            data=val;
        }
    }
    public static Node insert(Node root,int val){
        if (root==null)
        {
            root=new Node(val);
            return root;
        }
        if (root.data>val){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
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
        int values[]={8,5,3,1,4,6,10,11,14};

        //int values[]={5,1,3,4,2,7};

        Node root=null;
        for (int i=0;i< values.length;i++){
            root=insert(root,values[i]);
        }
        inOrder(root);
        System.out.println();

        Delete(root,10);
        inOrder(root);
//
//        if (search(root,12)){
//            System.out.println("found");
//        }else
//            System.out.println("not found");
    }
}
