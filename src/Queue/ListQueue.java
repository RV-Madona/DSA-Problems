package Queue;

public class ListQueue {
    class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next = null;
        }
    }
    Node head = null;
    ListQueue(){
        head =  null;
    }
    void enQueueAtFirst(int val){
        Node newNode = new Node(val);
        head = newNode;
    }
    void enQueueAtPos(int pos,int val){
        Node newNode = new Node(val);
        Node temp = head;
        for(int i=1;i<pos;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    boolean isEmpty(){
        return head==null;
    }
    void deQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Dequeued data: "+head.data);
        head =head.next;
    }
    void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
        System.out.println();
    }
}
