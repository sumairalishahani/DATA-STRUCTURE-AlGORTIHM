public class linkedqueue implements Queue{
    Node head=null;
    Node tail=null;
    int size;
    Object data;
    class Node{
        Node next;
        Object data;
        Node(Object data){
            this.data=data;
        }
    }
    @Override
    public void add(Object obj) {
        Node newNode=new Node(obj);
        if (tail==null){
            tail=head=newNode;
        }tail.next=newNode;
        tail=newNode;
        size++;


    }

    @Override
    public Object first() {
        if (head==tail){
     tail=null;
        }return head.data;
    }

    @Override
    public Object remove() {
        if (head==null)throw new IllegalArgumentException("we can not remove element from queue because Queue is empty ");
        Object temp=head.data;
        head=head.next;
        size--;
        return temp;
    }


    @Override
    public int size() {
        return size;
    }
    public boolean isEMpty(){
        return head==null&&tail==null;
    }
    public String toString(){
        while (tail.next!=head){
            System.out.println(tail.data+"-->");
            tail=tail.next;

        }return String.valueOf(tail.data);
    }

    public static void main(String[] args) {
        linkedqueue lq=new linkedqueue();
        lq.add(9);
        lq.add(5);
        lq.add(3);
        System.out.println(lq.toString());

//        while (!lq.isEMpty()){
//            System.out.println(lq.first());
//            lq.remove();
//        }


    }
}
