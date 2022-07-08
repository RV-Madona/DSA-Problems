package Linked_list;

public class DoublyDemo {
    public static void main(String[] args) {
        DoublyList list =new DoublyList();
        list.insertAtBeginning(9);
        list.insertAtPos(1,10);
        list.insertAtPos(2,11);
        list.display();
        list.reverse();
    }
}
