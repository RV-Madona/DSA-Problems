package Queue_Using_2Stacks;

public class Queue{
    Stack s1,s2;
    int[] arr1 = new int[4];
    int[] arr2 = new int[arr1.length];
     class Stack{
        int[] arr;
        int top;
        Stack(int[] arr){
            this.arr = new int[arr.length];
            top = -1;
        }
        public void push(int val){
            if(top< arr.length-1){
                arr[++top] =val;
            }
            else{
                System.out.println("Queue is full");
            }
        }
        public int pop(){
            if(top>=0) {
                return arr[top--];
            }
            else{
                return -1;
            }
        }
        public boolean isEmpty(){
            if(top == -1)
                return true;
            else
                return false;
        }
        public int peek(){
            return arr[top];
        }
        public void display(){
            for(int i=0;i<=top;i++){
                System.out.print(arr[i]+"  ");
            }
        }
    }

    Queue(){
        s1 = new Stack(arr1);
        s2 = new Stack(arr2);
    }
    public void enQueue(int val){
        s1.push(val);
    }
    public void displayQueue(){
         s1.display();
        System.out.println();
    }
    public int deQueue(){
         if (s1.top == 0){
             return s1.pop();
         }
         boolean isEmpty = s1.isEmpty();
         while(isEmpty != true){
             s2.push(s1.pop());
             isEmpty = s1.isEmpty();
         }
         int popped_data = s2.pop();
         isEmpty = s2.isEmpty();
         if(isEmpty != true) {
             while (isEmpty != true) {
                 s1.push(s2.pop());
                 isEmpty = s2.isEmpty();
             }
             return popped_data;
         }
         else{
             System.out.println("Queue is empty,no data to delete.");
             return -1;
         }
    }
    public void front_data() {
        boolean isEmpty = s1.isEmpty();
        if (isEmpty != true) {
            while (isEmpty != true) {
                s2.push(s1.pop());
                isEmpty = s1.isEmpty();
            }
            System.out.println("Front data of Queue: " + s2.peek());
        } else {
            System.out.println("Queue is Empty");
        }
    }

}
