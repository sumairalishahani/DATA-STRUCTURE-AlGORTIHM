public class CopyLinkedList {

    static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }  // end of constructor

    }    // end of class Node
    public static void display(Node head){
        for (Node p = head; p!=null; p=p.next) {
            System.out.print(p.val+"->");
        }
        System.out.println("null");
    }
    public static Node copy(Node head){
        Node p = head;
        Node q = new Node(head.val);
        Node temp = q;
        Node start=p;
        start=start.next;
        while(start!=null){
            temp.next= new Node(start.val);
            start=start.next;
            temp= temp.next;
        }
        return q;
    }
    public static void main(String[] args) {

        Node start = new Node(15);
        Node p = start;
        p.next = new Node(16);
        p = p.next;
        p.next = new Node(17);
        p = p.next;
        display(start);

        Node q = copy(start);
        display(q);


    }
}