package Queue;

public class Q_Array {
    int[] arr = new int[6];
    int front;
    int rear;

    Q_Array() {
        rear = -1;
        front = -1;
    }

    public void enqueue(int item) {
        if (rear < arr.length-1) {
            if (rear == -1 && front == -1) {
                ++front;
            }
            arr[++rear] = item;
        } else {
            System.out.println("Queue is full");
        }
    }

    public void dequeue() {
       if(front <arr.length-1 && front != -1){
           System.out.println("Dequeue action: "+arr[front++]);
        }
       else if(front == arr.length-1){
           System.out.println("Dequeue action: "+arr[front]);
           front = -1;
       }
       else{
           System.out.println("Queue is Empty");
       }
    }
    public void display(){
        System.out.println(front);
        System.out.println(rear);
        if(front !=-1){
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+"  ");
            }
            System.out.println();
        }
        else {
            System.out.println("Queue is empty unable to display");
        }
    }

    public void revQueue(){

        int temp = rear;
        rear = front;
        front = temp;
        System.out.println(front);
        System.out.println(rear);
        if (rear != -1) {
            for (int i = front; i >= rear; i--) {
                System.out.print(arr[i] + "  ");
            }
        } else {
            System.out.println("Queue is empty unable to display");
        }

    }
}

