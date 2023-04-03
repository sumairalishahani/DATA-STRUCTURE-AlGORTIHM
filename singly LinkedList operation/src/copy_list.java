class Node2{
    Node2 next;
    int data;
    Node2(int data){
        this.data=data;
        this.next=null;
    }
}
public class copy_list {
    public static Node2 copy_method(Node2 head){
        Node2 list=head;
        Node2 q=new Node2(head.data);
        Node2 temp=q;
        Node2 start=list;
        start=start.next;
        while(start!=null){
            temp.next= new Node2(start.data);
            start=start.next;
            temp= temp.next;
        }return q;

    }
    public static  void display(Node2 head){
        Node2 temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node2 start=new Node2(6);
        start.next=new Node2(7);
        start.next.next=new Node2(8);
        start.next.next.next=new Node2(9);
        display(start);
        Node2 copy=copy_method(start);
        display(copy);
    }

}
