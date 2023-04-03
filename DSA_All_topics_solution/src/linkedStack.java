import javax.swing.*;

public class linkedStack {
    private Node top;
    private int size;

    static class Node {
        Object data;
        Node next;
        Node(Object data,Node n){
            this.data=data;
            next=n;
        }

    }
    public boolean isEmpty(){
        return size==0;
    }
    public Object peak(){
        if (size==0)
            throw new IllegalArgumentException("stack is Empty");
        return top.data;

    }

    public Object pop(){
        if (size==0)
            throw new IllegalArgumentException("Stack is EMpty");
        Object oldTop=top.data;
        top=top.next;
        --size;
        return oldTop;
    }
    public void push(Object obj){
        top=new Node(obj,top);
        ++size;

    }
    public void printReverse(){
       linkedStack reverse=new linkedStack();
       Node temp=top;
       while (temp!=null){
           reverse.push(temp.data);
           reverse.peak();
           System.out.println(reverse.pop());
           temp=temp.next;
       }
    }
    public int size(){
        return size;
    }
    public static linkedStack combineStacks(linkedStack stack1, linkedStack stack2, linkedStack stack3) {
        linkedStack combinedStack = new linkedStack();

        // Push all objects from stack1 onto the combined stack
        Node temp = stack1.top;
        while (temp != null) {
            combinedStack.push(temp.data);
            temp = temp.next;
        }

        // Push all objects from stack2 onto the combined stack
        temp = stack2.top;
        while (temp != null) {
            combinedStack.push(temp.data);
            temp = temp.next;
        }

        // Push all objects from stack3 onto the combined stack
        temp = stack3.top;
        while (temp != null) {
            combinedStack.push(temp.data);
            temp = temp.next;
        }

        return combinedStack;
    }


//    public ArrayStack toarrayStack(){
//        ArrayStack arrayStack=new ArrayStack(5);
//        for(Node n = top ; n!=null; n = n.next){
//            arrayStack.push(n.object);
//        }
//        arrayStack.reverse();
//        return arrayStack;
//    }

    public static void main(String[] args) {
        linkedStack first_sem=new linkedStack();
        first_sem.push("PF");
        first_sem.push("FE");
        first_sem.push("ICT");
        first_sem.push("AC");
        linkedStack second_sem=new linkedStack();
        second_sem.push("ISE");
        second_sem.push("PP");
        second_sem.push("OOP");
        second_sem.push("LAAG");
        linkedStack third_sem=new linkedStack();
        third_sem.push("DSA");
        third_sem.push("DBS");
        third_sem.push("SEM");
        third_sem.push("OR");
        third_sem.printReverse();

        linkedStack combinedStack = combineStacks(first_sem, second_sem, third_sem);

        // Print out all elements in the combined stack
        System.out.println("Combined Stack:");
        while (!combinedStack.isEmpty()) {
            System.out.println(combinedStack.pop());
        }
    }



//        ArrayStack array=linkedStack.toarrayStack();
//        System.out.println( array.peak());
        //  array.printStack();



    }




