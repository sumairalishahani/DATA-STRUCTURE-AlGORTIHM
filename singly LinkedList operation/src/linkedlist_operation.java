class Node{
    Node next;
    int data;

    Node(int data){
        this.next=null;
        this.data=data;
    }
}// end of Node class

public class linkedlist_operation {
    // Inserting all operations
    // insertATHead
    public Node insertAtHead(Node head,int data){
        Node newNode=new Node(data);
        Node temp=head;
        head=newNode;
        newNode.next=temp;
        return head;
    }

    // now inserting at tail
    public Node insertAtTail(Node head,int data){
        Node newNode=new Node(data);
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }temp.next=newNode;
        newNode.next=null;

        return head;
    }
    // insert At Middle
    public Node insertAtMiddle(Node head,int data){
        Node newNode=new Node(data);
        Node slow=head;
        Node fast=head;
        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }newNode.next=slow.next;
        slow.next=newNode;
        return head;
    }
    // insertAt AnyPosition
    public Node insertAtPosition(Node head,int data,int position) {
        Node newNode = new Node(data);
        if (position < 1) {
            System.out.println("position can't be less than one");
        }
        if (position == 1) {
            newNode.next = head;
            head = newNode;

        } else
        {
        int count=1;

        Node previous=head;
        while (count<position-1){
            previous=previous.next;
            count++;
        }Node current=previous.next;
        newNode.next=current;
        previous.next=newNode;


    }return head;
    }

    // delete first
    public Node DeleteFirst(Node head){
        if (head==null){
            System.out.println("list is empty");
        }
        head=head.next;
        return head;

    }
    // delete last
    public Node DeleteLast(Node head){
        Node lastNode=head.next;
        Node secondLast=head;
        if (head==null){
            System.out.println("list is empty");
        }
        if (head.next==null){
            System.out.println("");

        }
        while (lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }secondLast.next=null;

return head;
    }
    // delete at position
    public Node deletionAtPosition(Node head,int position){
        if (position==1){
            head=head.next;
        }else {
            Node previous=head;
            int count=1;
            while (count<position-1){
                previous=previous.next;
                count++;
            }Node current=previous.next;
            previous.next=current.next;

        }
return head;
    }

    // searching Node
    public boolean searchingNode(Node head, int element){
        Node newNode=head;
        while (newNode!=null){
            if (newNode.data==element){
                return true;

            }newNode=newNode.next;
        }return false;
    }

    // sorting the linkedlist
    public Node sorting(Node head){
        Node current = head, index = null;

        int temp;

        if (head == null) {
            System.out.println("list is empty");
        }
        else {
            while (current != null) {

                index = current.next;

                while (index != null) {

                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }

                    index = index.next;
                }
                current = current.next;
            }
        }return head;
    }



    public void display(Node head){
        Node temp=head;
        while (temp!=null ){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }






    public static void main(String[] args) {
        linkedlist_operation LLO=new linkedlist_operation();
        Node start=new Node(3);
        Node p=start;
        p.next=new Node(5);
        p=p.next;
        p.next=new Node(1);
        p=p.next;
        // now calling insertAtHead method
        Node current=LLO.insertAtHead(start,7);
        LLO.display(current);

        // now calling insertAtTail
        Node tail=LLO.insertAtTail(start,9);
        LLO.display(tail);

        // now insert AT middle and calling
        Node middle= LLO.insertAtMiddle(start,4);
        LLO.display(middle);
        // inserting at any position
        Node position=LLO.insertAtPosition(start,6,3);
        LLO.display(position);

        // Delete first
        Node first=LLO.DeleteFirst(start);
        LLO.display(first);

        // delete last
        Node last=LLO.DeleteLast(start);
        LLO.display(last);

        // deleting at any position
        Node positin=LLO.deletionAtPosition(start,3);
        LLO.display(positin);

        // searching an element
        System.out.println(LLO.searchingNode(start,4));

        // sorting
        Node sort=LLO.sorting(start);
        LLO.display(sort);









    }
}
