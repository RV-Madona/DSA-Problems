package Linked_list;

public class CircularDemo {
    public static void main(String[] args) {
        CircularList list = new CircularList();
        list.insertAtBeginning(9);
        list.insertAtBeginning(10);
        list.display();
        System.out.println("list contains "+list.contains()+" elements");
        list.search(100);

    }
}
