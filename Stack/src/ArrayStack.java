
public class ArrayStack implements stack {
    private Object[] a = new Object[size()];

    private int size;

    public ArrayStack(int cap) {
        a = new Object[cap];
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public Object peak() {
        if (size == 0) {
            System.out.println("stack is empty");
        }
        return a[size-1];
    }

    public Object pop() {
        if (size == 0) {
            throw new IllegalStateException("stack is empty");
        }
        Object obj = a[--size];
        a[size] = null;
        return obj;
    }

    public void push(Object obj) {
        if (size == a.length)
            resize();
        a[size++] = obj;

    }
    public String toString(){
        String s = "";
        for (int i = 0 ; i < size; i++){
            s += String.valueOf(a[i])+" ";
        }
        return s;
    }

    public int size() {
        return size;
    }

    public void resize() {
        Object[] aa = a;
        a = new Object[2 * aa.length];
        System.arraycopy(aa, 0, a, 0, size);
    }
    public void reverse(){
        int i=0;
        int j= a.length-1;
        Object temp;
        while (i<j){
            temp=  a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;

        }
    }

public void printStack(){
    for(int i = size-1 ; i >= 0 ; i--){
        System.out.println(a[i]);
    }
}
    public linkedStack tolinkedStack(){
        linkedStack ls=new linkedStack();
        for(int i = 0; i < size; i++){
            ls.push(a[i]);
        }
        return ls;
    }


    public static void main(String[] args) {
        ArrayStack stack=new ArrayStack(5);
        stack.push(9);
        stack.push(7);
        stack.push(1);
        linkedStack ls = stack.tolinkedStack();
        System.out.println(ls.peak());



    }


}

