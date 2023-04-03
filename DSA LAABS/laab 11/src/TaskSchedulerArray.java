public class TaskSchedulerArray {
    private Object[] queue;
    private int front;
    private int rear;
    private int size;

    public TaskSchedulerArray(int capacity) {
        queue = new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }

    public int getSize() {
        return size;
    }

    public void enqueue(Object task) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = task;
        size++;
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object task = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return task;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }

    public static void main(String[] args) {
        TaskSchedulerArray ts=new TaskSchedulerArray(5);
        ts.enqueue("task1");
        ts.enqueue("task 2");
        ts.enqueue("task 3");
        ts.enqueue("task4");
        System.out.println("peek method:"+ts.peek());
        System.out.println("total size:"+ts.getSize());
        ts.dequeue();
        System.out.println("peek method after dequeue:"+ts.peek());

        System.out.println("total size:"+ts.getSize());

    }
}