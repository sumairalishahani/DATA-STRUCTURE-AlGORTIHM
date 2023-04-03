class Node{
    Node next;
    int data;
    Node(int data){
        this.data=data;
        this.next=null;
    }


}
public class linkedlist {


    public int sum(Node p){
        int sum = 0;
        Node temp=p;
        if (temp == null) {
            System.out.println("list is empty");
        }
        while (temp != null) {
            sum += temp.data;
            temp=temp.next;
        }
        return sum;
    }


    public boolean search(Node p, int a) {
        Node current=p;
        while (current!=null){
            if (current.data==a)
                return true;
            current=current.next;


        }

        return false;

    }

    public static Node merge(Node p, Node q) {
        Node dummy=new Node(0);
        Node tail=dummy;
        while (p!=null && q!=null){
            if (p.data<= q.data){
                tail.next=p;
                p=p.next;
            }else
            {
                tail.next=q;
                q=q.next;
            }
            tail=tail.next;

        }if (p==null){
            tail.next=q;
        }else
            tail.next=p;

return dummy.next;
    }
    public void display(Node head){
        Node p=head;
        while (p!=null){
            System.out.print(p.data+"->");
            p=p.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

    }



}

