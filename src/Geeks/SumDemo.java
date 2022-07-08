package Geeks;

public class SumDemo {
    public static void main(String[] args) {
        Sum0Delete list =new Sum0Delete();
        list.insertAtBeginning(6);
        list.insertAtPos(1,-6);
        list.insertAtPos(2,8);
        list.insertAtPos(3,4);
        list.insertAtPos(4,-12);
        list.insertAtPos(5,9);
        list.insertAtPos(6,8);
        list.insertAtPos(7,-8);
        list.display();
        list.findSum();
    }
}
