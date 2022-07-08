package Stack;

import Linked_list.LinkedList;

public class ListStack {
    class Node{
        int data;
        Node next;
        Node(int val){
           data = val;
           next = null;
        }
    }
    Node top;
    boolean isEmpty(){
        return (top == null);
    }
    void push(int val) {
            Node newNode = new Node(val);
            if (top == null) {
                top = newNode;
            } else {
                newNode.next = top;
                top = newNode;
                return;
            }

    }
    void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("popped data: "+top.data);
        top = top.next;
    }
    int peek(){
        if(isEmpty()){
            System.out.print("Stack is empty ");
            return -1;
        }
        System.out.print("peek data: ");
        return top.data;
    }
    public void display() {
        for (Node i = top; i != null; i = i.next) {
            System.out.print(i.data + " ");
        }
        System.out.println();
    }



}
