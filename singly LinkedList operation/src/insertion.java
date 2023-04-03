
class performOperation{
    int size;
    Node head;
    public void insertAtHead(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        else {
            Node temp=head;
            head=newNode;
            newNode.next=temp;


        }
    }
    public void insertAtTail(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
        }

            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;

            }
             temp.next=newNode;
            // temp=newNode;
             newNode.next=null;

    }
    public void insertAtMiddle(int data){
        Node newNode=new Node(data);
        if(head==null){
            newNode=head;
        }Node slow, fast;
        slow = fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }newNode.next = slow.next;
        slow .next= newNode;

    }
    public void DeleteFirst(){
        head=head.next;

    }
    public void DeleteLast(){
        Node lastNode=head.next;
        Node secondLast=head;
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        if (head.next==null){
            head=null;
            return;
        }
        while (lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }secondLast.next=null;


    }
    public void insertAtPosition(int data,int  position){
        Node newNode=new Node(data);
        if (position<1){
            System.out.println("position can't be less than one");
        }
        if (position==1){
            newNode.next=head;
            head=newNode;

        }

        else {

            Node previous=head;
            int count=1;
            while (count<position-1){
                previous=previous.next;
                count++;
            }
            Node current=previous.next;
            newNode.next=current;
            previous.next=newNode;

        }

    }public void deletionAtPosition(int position){
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

    }



    public void display(){
        Node newNode=new Node();
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");

    }
    public void removeDuplicate(){
        Node curr=head;
        while (curr!=null&& curr.next!=null){
            if (curr.data==curr.next.data){
                curr.next=curr.next.next;

            }else
                curr=curr.next;
        }
    }
    public boolean search(int  search){
        Node curr=head;
        while (curr!=null){
            if (curr.data==search){
                return true;
            }curr=curr.next;
        }return false;
    }
    public void findMiddleElement(){
        Node slow=head;
        Node fast=head;
        while (fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("the midlle element of the linkedlist is "+slow.data);
    }
    public void findLastElement(){
        Node newNode=head;
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;

        }
        System.out.println("the last element of the list is "+temp.data);
    }

}
class Node{
    int data;
    Node next;
    Node (){

    }

    Node(int data ){
        this.data=data;
        this.next=null;
    }
}

public class insertion {
    public static void main(String[] args) {


        performOperation obj=new performOperation();
        obj.insertAtHead(56);
        obj.insertAtHead(34);
        obj.insertAtHead(35);
        obj.display();
        obj.insertAtTail(89);
        obj.insertAtTail(90);
        obj.insertAtTail(90);
        obj.display();
        obj.removeDuplicate();

        obj.display();
        obj.insertAtMiddle(100);
        obj.display();
        obj.DeleteFirst();
        obj.display();
        obj.DeleteLast();
        obj.display();
        obj.deletionAtPosition(3);


        obj.display();
        obj.insertAtPosition(100,2);
        obj.display();
        System.out.println(obj.search(100));
        System.out.println("Element is found");
        obj.display();
        obj.findMiddleElement();
        obj.findLastElement();








    }
}
