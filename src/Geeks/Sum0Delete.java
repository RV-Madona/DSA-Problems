package Geeks;

public class Sum0Delete {
    class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next = null;
        }
    }
    Node head;
    Sum0Delete(){
        head = null;
    }
    public void insertAtBeginning(int val){
        Node newNode = new Node(val);
        head = newNode;
    }
    public void insertAtPos(int pos, int val){
        Node newNode = new Node(val);
        Node temp= head;
        for(int i= 1;i<pos;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public void findSum(){
       Node temp1 = head;
       Node temp2 = null;

      // Node temp3 = null;
        int count = 0;
        int a,b,sum = 0;
        while(temp1 != null){
            count++;
            temp2 = temp1.next;
            //temp2 = temp2.next;
            a=temp1.data;
            b=temp2.data;
            sum = a+b;
            if(sum == 0){
                delete(count-1);
                delete(count);
            }
            temp1  = temp1.next;
        }

    }
    public void delete(int pos){
        Node temp = head;
        Node delete = null;
        if(pos == 0){
            delete = head;
            head = delete.next;
            return;
        }
        for(int i = 1; i< pos;i++){
            temp = temp.next;
        }
        delete = temp.next;
        temp.next = delete.next;

    }
}
