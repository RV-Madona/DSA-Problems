package Linked_list;

public class DoublyList {
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int val) {
            data = val;
            prev = null;
            next = null;
        }
    }

    Node head;
    Node tail;

    DoublyList() {
        head = null;
        tail = null;
    }

    public void insertAtBeginning(int val) {
        Node newNode = new Node(val);
        head = newNode;
        tail = newNode;
    }

    public void insertAtPos(int pos, int val) {
        Node newNode = new Node(val);
        Node temp = head;
        Node nextNode = null;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        newNode.prev = temp;
        if (temp.next == null) {
            temp.next = newNode;
            tail = newNode;
        } else {
            nextNode = temp.next;
            temp.next = newNode;
            newNode.next = nextNode;
            nextNode.prev = newNode;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void reverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.prev;
        }
        System.out.println();
    }
}
