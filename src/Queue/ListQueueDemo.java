package Queue;

public class ListQueueDemo {
    public static void main(String[] args) {
        ListQueue l1 = new ListQueue();
       // System.out.println(l1.isEmpty());
        l1.enQueueAtFirst(1);
        l1.enQueueAtPos(1,2);
        l1.enQueueAtPos(2,3);
        l1.display();
        l1.deQueue();
        l1.display();
    }
}
