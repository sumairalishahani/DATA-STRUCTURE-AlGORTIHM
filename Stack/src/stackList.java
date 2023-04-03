public class stackList {
    static  class  Node{
        int data;
        Node next;
        public  Node(int data){
            this.data=data;
            this.next=null;
        }

    }
      static class stack{
        public static Node head;
        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int data){
            Node newNode=new Node(data);
            if (isEmpty()){
                head=newNode;
                return;

            }
            newNode.next=head;
            head=newNode;
        }
        public static int pop(){
            if (isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if (isEmpty()){
                return -1;
            }return head.data;
        }


    }

    public static void main(String[] args) {
        new stack();
        stack.push(2);
        stack.push(5);
        stack.push(9);



      //  System.out.println("stack.pop():"+stack.pop());
        //System.out.println("stack.peek():"+stack.peek());
        while (!stack.isEmpty()){
            System.out.println(stack.peek());
            System.out.println(stack.pop());
        }
        System.out.println(stack.peek());




    }
}
