package Linked_list;

public class CircularList {
    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    Node last;

    CircularList() {
        last = null;
    }

    public void insertAtBeginning(int val) {
        Node newNode = new Node(val);
        if (last == null) {
            newNode.next = newNode;
            last = newNode;
        } else {
            newNode.next = last.next;
            last.next = newNode;
        }
    }

    public void insertAtEnd(int val) {
        Node newNode = new Node(val);
        if (last == null) {
            newNode.next = newNode;
            last = newNode;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    public void deleteAtBeginning() {
        if (last.next == last) {
            last = null;
        } else {
            last.next = last.next.next;
        }
    }

    public void deleteLast() {
        Node temp = last.next;
        if (temp == last) {
            last = null;
        } else {
            while (temp.next != last) {
                temp = temp.next;
            }
            temp.next = last.next;
            last = temp;
        }
    }


    public void display() {
        if(last==null) {
        System.out.println("List empty!");
        return;
        }

        Node temp = last;
        do {
            temp = temp.next;
            System.out.print(temp.data + "  ");
        } while (temp != last);
        System.out.println();

    }

    public void deleteVal(int val) {
        if (last.next.data == val) {
            deleteAtBeginning();
            return;
        }
        if (last.data == val ) {
            deleteLast();
            return;
        }

        Node temp = last.next;
        Node prev = null;
        while (temp != last) {
            if (temp.data == val) {
                prev.next = temp.next;
            }
            prev = temp;
            temp = temp.next;
        }
    }
    public int contains(){
        if(last == null) {
            return 0;
        }
        Node temp = last.next;
        int count = 0;
        while(temp != last){
            count ++;
            temp = temp.next;
        }
        return count+1;
    }
    public void search(int val) {
        Node temp = last.next;
        int flag = 0;
        do {
            if (temp.data == val) {
                System.out.println("Data found in the list!");
                flag = 1;
            }
            temp = temp.next;
        } while (temp != last.next);
        if (flag == 0) {
            System.out.println("Data Not found");
        }
    }
}
