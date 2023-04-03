import java.util.Scanner;
public class Task_3 {
    static class Node<T>{
        Scanner sc = new Scanner(System.in);
        T data;
        Node next;
        Node current;
        Node pre;
        int size ;
        Node (T data){
            this.data = data;
            this.next = null;
            this.pre = null;
        }
    }
    static class Stack<T>{
        private Node head;
        private int size;
        private Node current;
        public void push(T data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
            } else if (head.next == null) {
                current = newNode;
                current.pre = head;
                head.next = current;
            }
            else {
                current.next = newNode;
                newNode.pre = current;
                current = newNode;
            }
        }
        public Object pop(){
            if(head==null){
                return null;
            }
            Object o = head.data;
            head = head.next;
            return o;
        }
        public Object peek(){
            return head.data;
        }

        public void backwarddisplay(){
            for(Node p = current ; p!=null; p = p.pre){
                System.out.println(p.data);
            }
        }
        public void forwardDisplay(){
            for(Node p = this.head ; p!=null; p = p.next){
                System.out.println(p.data);
            }
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        String[] url = {"URL1","URL2","URL3"};
        for(int i = 0; i<url.length;i++){
            stack.push(url[i]);
        }
        System.out.println("Forward Display");
        stack.backwarddisplay();
        System.out.println("BackWard Display");
        stack.forwardDisplay();
    }
}
