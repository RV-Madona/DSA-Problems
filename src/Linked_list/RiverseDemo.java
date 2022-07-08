package Linked_list;

public class RiverseDemo {
    public static void main(String[] args) {
        RiverseOfList list = new RiverseOfList();
        list.insertAtBeginning(9);
        list.insertAtPos(1,10);
        list.insertAtPos(2,11);
        list.display();
        list.riverse();
    }
}
