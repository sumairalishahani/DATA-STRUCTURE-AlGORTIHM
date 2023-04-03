import java.util.Arrays;

public class ArrayStack<T> {
    private T[] stackArray;
    private int size;



    public ArrayStack(int capacity) {
        stackArray = (T[]) new Object[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public boolean search(T element) {
        for (int i = 0; i < size; i++) {
            if (stackArray[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void push(T element) {
        if (size == stackArray.length) {
            stackArray = Arrays.copyOf(stackArray, size * 2);
        }
        stackArray[size++] = element;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T element = stackArray[--size];
        stackArray[size] = null;
        return element;
    }

    public void display() {
        System.out.print("Stack: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>(10);

        for (int i = 0; i < 10; i+=2) {
            stack.push(i);
        }

        System.out.println("Size: " + stack.getSize());
        System.out.println("Is empty: " + stack.isEmpty());
        System.out.println("Contains 5: " + stack.search(5));
        System.out.println("Contains 10: " + stack.search(10));

        stack.display();

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}




