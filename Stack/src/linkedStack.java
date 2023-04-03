public class linkedStack {
    private Node top;
    private int size;

   static class Node {
        Object object;
        Node next;
        Node(Object obj,Node n){
            object=obj;
            next=n;
        }

    }
    public boolean isEmpty(){
       return size==0;
    }
    public Object peak(){
       if (size==0)
           throw new IllegalArgumentException("stack is Empty");
       return top.object;

    }

    public Object pop(){
       if (size==0)
           throw new IllegalArgumentException("Stack is EMpty");
       Object oldTop=top.object;
       top=top.next;
       --size;
       return oldTop;
    }
    public void push(Object obj){
       top=new Node(obj,top);
       ++size;

    }
    public int size(){
       return size;
    }

    public ArrayStack toarrayStack(){
       ArrayStack arrayStack=new ArrayStack(5);
        for(Node n = top ; n!=null; n = n.next){
            arrayStack.push(n.object);
        }
        arrayStack.reverse();
        return arrayStack;
    }

    public static void main(String[] args) {
        linkedStack linkedStack=new linkedStack();
        linkedStack.push(90);
        linkedStack.push(89);
        linkedStack.push(67);
//        for (int i=0;i<4;i+=5){
//            linkedStack.push(i);
//        }
        ArrayStack array=linkedStack.toarrayStack();
        System.out.println( array.peak());
      //  array.printStack();



    }

}



