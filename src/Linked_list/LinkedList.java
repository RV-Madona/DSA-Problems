package Linked_list;

public class LinkedList<T> {
    class Node { // node definition
        T data;
        Node next;

        Node(T val) {
            data = val;
            next = null;
        }
    }

    Node head; // head definition

    LinkedList() {
        head = null; //at time of creating list it is absolutely empty which means pointing nothing
    }

    public void InsertAtBeginning(T val) {
        Node newNode = new Node(val);
        if(head == null)
         head = newNode;
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void display(){
        for(Node i = head; i != null; i = i.next){
            System.out.print(i.data+" ");
        }
        System.out.println();
    }
    public void InsertAtPos(int pos, T val){
        Node newNode = new Node(val);
        Node temp = head;
        if(pos == 0){
            InsertAtBeginning(val);
            return;
        }
        for(int i = 1; i<pos;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void DeleteAtPos(int pos){
        Node temp = head;
        Node delete = null;
        if(pos == 0){
            delete = head;
            head = delete.next;
            return;
        }
        for(int i =1;i<pos;i++){
            temp = temp.next;
        }
        delete = temp.next;
        temp.next = delete.next;

    }
    public T get(int pos) {
        Node temp = head;
        //System.out.println(temp.next);
        //Node first = null;
        if(pos == 0) {
            //temp= head.next;
            return temp.data;
        } else {
            for (int i = 1; i <= pos; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }
    public void update(int pos, T val){
        Node temp = head;
        if(pos == 0){
            temp.data = val;
            System.out.println("updated value at pos "+pos+ ":"+ temp.data);
        }
        else{
            for(int i = 1;i<=pos;i++){
             temp = temp.next;
            }
            temp.data = val;
            System.out.println("updated value at pos "+pos+" :"+ temp.data);
        }
    }
    public int search(T val) {
        Node temp = head;
        int i = 0;
        while(temp != null){
           //temp = temp.next;
           if(temp.data == val){
               System.out.print(val+" found at pos: ");
               return i;
           }
           else {
               temp = temp.next;
               i++;
              // System.out.println("Value not found !");
           }

        }
        System.out.println("Value not found !");
        return -1;
    }
    public boolean Contains(T val) {
        Node temp = head;
        //int i = 0;
        while(temp != null){
            //temp = temp.next;
            if(temp.data == val){
                System.out.print(val+" found at pos: ");
                return true;
            }
            else {
                temp = temp.next;
                //i++;
            }

        }
        System.out.println("Value not found !");
        return false;
    }
    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next = head.next;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
}

