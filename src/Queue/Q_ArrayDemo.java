package Queue;

public class Q_ArrayDemo {
    public static void main(String[] args) {
        Q_Array q1 = new Q_Array();
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);
        q1.enqueue(6);
       // q1.enqueue(1);
        /*q1.dequeue();
        q1.dequeue();
         q1.dequeue();
         q1.dequeue();
         q1.dequeue();
         q1.dequeue();
         q1.dequeue();*/
       q1.display();
       q1.revQueue();

    }
}
