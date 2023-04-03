class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        next = null;
    }
}

public class LinkedStack<T> {
    private Node<T> top;
    private int size;

    public LinkedStack() {
        top = null;
        size = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int getSize() {
        return size;
    }

    public boolean search(T element) {
        Node<T> current = top;
        while (current != null) {
            if (current.data.equals(element)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public void display() {
        System.out.print("Stack: ");
        Node<T> current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedStack<Integer> stack = new LinkedStack<>();

        for (int i = 0; i < 10; i+=3) {
            stack.push(i);
        }

        System.out.println("Size: " + stack.getSize());
        System.out.println("Is empty: " + stack.isEmpty());
        System.out.println("Contains 3: " + stack.search(3));
        System.out.println("Contains 9: " + stack.search(9));

        stack.display();

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

    }
}
