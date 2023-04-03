import java.util.LinkedList;
import java.util.Queue;

public class binaryTree  {
    static class Node{
        Node right;
        Node left;
        int data;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

        static int indx=-1;
        public static Node buildTree(int nodes[]){
            indx++;
            if (nodes[indx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[indx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public static void preOrder(Node root){
            if (root==null){
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);

        }
        public static void inOrder(Node root){
            if (root==null)
                return;
            inOrder(root.left);
            System.out.print((root.data+" "));
            inOrder(root.right);

        }
        public static void postOrder(Node root){
            if (root==null)
                return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    public static void levelOrder(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
            Node curr = q.remove();
            if(curr == null) {
                System.out.println();
                //queue empty
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curr.data+" ");
                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }
    public static  int countOFNodes(Node root){
            if (root==null){
                return 0;
            }
            int leftNode=countOFNodes(root.left);
            int rigtNode=countOFNodes(root.right);
            return leftNode+rigtNode+1;
    }
    public static int sumOfNode(Node root){
            if (root==null)
                return 0;
            int leftSum=sumOfNode(root.left);
            int rightSum=sumOfNode(root.right);

        return leftSum+leftSum+root.data;
    }
    public static int height(Node root){
            if (root==null)
                return 0;
            int leftHeight=height(root.left);
            int rightHeight=height(root.right);
            int total_height=Math.max(leftHeight,rightHeight+1);
            return total_height;
    }
    public static int diameter(Node root){
            if (root==null)return 0;
            int dia1=diameter(root.left);
            int dia2=diameter(root.right);
            int dia3=height(root.left)+height(root.right)+1;
            return Math.max(dia3,Math.max(dia1,dia2));
    }



    public static void main(String[] args) {
        int [] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree=new binaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println("\n preOrder tree:");
        preOrder(root);
        System.out.println("\nInOrder tree:");
        inOrder(root);

        System.out.println("\nPost order:");
        postOrder(root);
        System.out.println("\n level order:");
        levelOrder(root);

        System.out.println("size:"+countOFNodes(root));
        System.out.println("sum of nodes:"+sumOfNode(root));

        System.out.println("diameter:"+diameter(root));
    }
}
