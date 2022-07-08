package Queue;

public class ArrayQueue {
    int SIZE = 5;
    int[] arr = new int[SIZE];
    int front;
    int back;
    ArrayQueue(){
        front = -1;
        back = -1;
    }
    boolean isFull(){
        return back == SIZE-1;
    }
    boolean isEmpty(){
        return front== SIZE;
    }
    void enqueue(int val){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        if(front == -1){
            arr[++front] = val;
            ++back;
        }
        else {
            arr[++back]=val;
        }
    }
    void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Dequeued data: "+arr[front++]);
    }
    void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        for(int i = front;i<=back;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
}
