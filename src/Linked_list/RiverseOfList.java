package Linked_list;

public class RiverseOfList {
    class Node{
        int data;
        Node next;

        Node(int val){
             data = val;
            next = null;
        }
    }
    Node head;
    RiverseOfList(){
        head = null;
    }
    public void insertAtBeginning(int val){
        Node newNode = new Node(val);
        head = newNode;
       // System.out.print(newNode.data);
    }
    public void insertAtPos(int pos, int val){
        Node newNode = new Node(val);
        Node temp = head;
        for(int i=1;i<pos;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void riverse(){
        Node temp = head;
        Node prev = null;
        Node nextNode = null;
        while(temp != null){
            nextNode = temp.next;
            if(temp == head){
                temp.next = null;
            }
            else{
                temp.next = prev;
                head = temp;
            }
            prev = temp;
            temp = nextNode;
        }
        display();
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
        System.out.println();
    }
}
