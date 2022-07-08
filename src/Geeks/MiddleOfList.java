package Geeks;

public class MiddleOfList {
    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }
    Node head;
    MiddleOfList(){
        head = null;
    }
    public void insertAtBeginning(int val){
        Node newNode = new Node(val);
        head = newNode;
    }
    public void insertAtPos(int pos,int val){
        Node newNode = new Node(val);
        Node temp = head;
        for(int i=1;i<pos;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void display() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        Middle(count);
    }
        public void Middle(int count){
          int pos;
          pos = count/2;
          Node temp= head;
          for(int i=1;i<=pos;i++){
           temp = temp.next;
          }
          System.out.println("Middle data of this list: "+temp.data);
        }

}
