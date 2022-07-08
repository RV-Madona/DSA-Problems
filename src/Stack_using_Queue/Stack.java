package Stack_using_Queue;

public class Stack {
    Queue q1;
    class Queue {
        int[] arr ;
        int front;
        int rear;

        Queue() {
            arr = new int[4];
            rear = -1;
            front = -1;
        }
        public boolean isEmpty(){
            if(front != -1){
                return  true;
            }
            else
                return  false;
        }

        public void enqueue(int item) {
            if (rear < arr.length - 1) {
                if (rear == -1 && front == -1) {
                    ++front;
                }
                arr[++rear] = item;
            } else {
                System.out.println("Stack is full");
            }
        }

        public int dequeue() {
            if(isEmpty() == false){
                return arr[front--];
            }
            return -1;
        }
        public void rev(){
            int temp = rear;
            rear = front;
            front = temp;
        }
        public void display(){
            if(front !=-1){
                for(int i=front;i<=rear;i++){
                    System.out.print(arr[i]+"  ");
                }
                System.out.println();
            }
            else {
                System.out.println("Stack is empty unable to display");
            }
        }
    }


    Stack(){
       q1 = new Queue();
    }
    public void push(int val){
        q1.enqueue(val);
    }
    public void display(){
        q1.display();
    }
    public int pop(){
        q1.rev();

       int popped_data =  q1.dequeue();
       q1.rev();
       return popped_data;
    }
}
