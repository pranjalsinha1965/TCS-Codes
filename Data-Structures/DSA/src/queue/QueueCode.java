package DSA.src.queue;
public class QueueCode {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(5);
        queue.enqueue(99);
        System.out.println(queue.dequeue());
        queue.show();
    }
}
class MyQueue {
    private int front = 0;
    private int rear = -1;
    private int size = 0;
    private int capacity = 4;
    private int[] arr = new int[capacity];
    public void enqueue(int data) {
        if (size == capacity) {
            System.out.println("Queue Overflow");
            return;
        }
        rear++;
        arr[rear] = data;
        size++;
    }
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int data = arr[front];
        front++;
        size--;
        return data;
    }

    public void show() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
