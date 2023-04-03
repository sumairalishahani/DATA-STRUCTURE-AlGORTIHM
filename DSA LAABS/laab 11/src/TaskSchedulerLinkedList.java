import java.io.FilterOutputStream;

public class TaskSchedulerLinkedList {
         Node front;
         Node rear;
         int size;

        static class Node {
            Object task;
            Node next;

            public Node(Object task) {
                this.task = task;
                this.next = null;
            }
        }

        public TaskSchedulerLinkedList() {
            front = null;
            rear = null;
            size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int getSize() {
            return size;
        }

        public void enqueue(int task) {
            Node node = new Node(task);
            if (isEmpty()) {
                front = node;
            } else {
                rear.next = node;
            }
            rear = node;
            size++;
        }

        public Object dequeue() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            Object task = front.task;
            front = front.next;
            size--;
            if (isEmpty()) {
                rear = null;
            }
            return task;
        }

        public Object peek() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            return front.task;
        }
        public void display(Node front){
            while (front!=rear.next){
                System.out.println(front.task+"-->");
            }
        }

        public static void main(String[] args) {
            TaskSchedulerLinkedList tl=new TaskSchedulerLinkedList();
            Node start=new Node("task1 ");
            Node p=start;
            p.next=new Node("task2");
            p=p.next;
            p.next=new Node("task3");
            p=p.next;
            tl.display(start);



        }
    }


