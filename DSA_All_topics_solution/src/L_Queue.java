
public class L_Queue {
    private Node1 head=new Node1(null);
    private int size;
    static  class Node1{
        Object object;
        Node1 previous=this,next=this;
        Node1(Object obj){
            object=obj;
        }Node1(Object obj, Node1 p, Node1 n){
            object=obj;
            previous=p;
            next=n;
        }
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public Object first(){
        if (size==0)
            throw new IllegalArgumentException("Queue is empty");
        return head.next.object;
    }
    public void add(Object obj){
        head.previous=head.previous.next;
        head.previous.next=new Node1(obj,head,head.previous);
        size++;
    }
    public Object remove(){
        if(size==0)
            throw new IllegalArgumentException("Stack is empty ");
        Object temp=head.next.object;
        head.next=head.next.next;
        head.next.previous=head;
        --size;
        return temp;
    }
    public String toString(){
        Node1 temp=head;
        while (head.next!=head){
            System.out.println(head.next.object);
            temp=temp.next;
        }return String.valueOf(head);
    }
    public void printReverse() {
        if (size == 0) {
            throw new IllegalArgumentException("Queue is empty");
        }

        Node1 temp = head.previous;

        while (temp != head) {
            System.out.println(temp.object);
            temp = temp.previous;
        }
    }public Object[] toArray() {
        Object[] arr = new Object[size];
        Node1 temp = head.next;
        int i = 0;

        // Iterate through the linked list in forward order, adding each object to the array
        while (temp != head) {
            arr[i++] = temp.object;
            temp = temp.next;
        }

        return arr;
    }




    public static void main(String[] args) {
        L_Queue LQ=new L_Queue();
        LQ.add(93);
        LQ.add("Sumair");
        LQ.add("Sachal");
        LQ.add(108);
      LQ.first();
      LQ.printReverse();
        System.out.println(LQ.remove());

    }

}
