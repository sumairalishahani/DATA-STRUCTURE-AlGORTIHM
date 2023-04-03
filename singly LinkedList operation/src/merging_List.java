class Node1{
    Node1 next;
    int  data;
    Node1(int data){
        this.data=data;
        this.next=null;
    }
}
public class merging_List {
    public Node1 merge(Node1 p,Node1 q){
        Node1 temp=new Node1(0);
        Node1 tail=temp;

        while (p!=null && q!=null) {
            if (p.data <= q.data) {


                tail.next = p;
                p = p.next;
            } else {
                tail.next = q;
                q = q.next;
            }
            tail = tail.next;
        }
            if (p==null){
                tail.next=q;
            }else tail.next=p;


        return temp.next;

    }
    public void display(Node1 head){
        Node1 temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        merging_List ML=new merging_List();

        Node1 start=new Node1(3);
        Node1 p=start;
        p.next=new Node1(5);
        p=p.next;
        p.next=new Node1(7);
        p=p.next;

        Node1 start1=new Node1(9);
        Node1 q=start1;
        q.next=new Node1(11);
        q=q.next;
        q.next=new Node1(13);
        q=q.next;

        Node1 merge= ML.merge(start,start1);
        ML.display(merge);




    }
}
