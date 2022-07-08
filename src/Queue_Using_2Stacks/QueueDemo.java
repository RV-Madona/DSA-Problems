package Queue_Using_2Stacks;

public class QueueDemo {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.enQueue(5);
        q1.enQueue(2);
        q1.enQueue(6);
        q1.enQueue(8);
        q1.displayQueue();
       System.out.println("Dequeue action: "+q1.deQueue());
        System.out.println("Dequeue action: "+q1.deQueue());
        System.out.println("Dequeue action: "+q1.deQueue());
        System.out.println("Dequeue action: "+q1.deQueue());
        System.out.println("Dequeue action: "+q1.deQueue());
        q1.front_data();
    }
}
