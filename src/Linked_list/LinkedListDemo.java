package Linked_list;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.InsertAtBeginning("kathir");
        list.InsertAtBeginning("jagatheeshwaran");
        list.display();
        //System.out.println();
        list.InsertAtPos(0,"Devi");
        list.display();
        list.DeleteAtPos(0);
        list.display();
        System.out.println("Data at pos 0: " + list.get(0));
        list.update(0,"Kaviya");
        list.display();
        System.out.println(list.search("Kaviya" + ""));
        System.out.println(list.Contains("kathir"));
        list.reverse();
        list.display();
    }

}
