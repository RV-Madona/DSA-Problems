package Queue;

public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue q1 = new ArrayQueue();
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);
       // q1.enqueue(5);
        q1.display();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.display();
    }
}
