package Stack;

public class ArrayStack {
    int MAX_SIZE = 5;
    int[] arr = new int[MAX_SIZE];
    int top;
    ArrayStack(){
        top = -1;
    }
    boolean isFull(){
        return top==MAX_SIZE-1;
    }
    boolean isEmpty(){
        return top==-1;
    }
    void push(int val){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        arr[++top] = val;
    }
    void pop(){
        if(isEmpty()){
            System.out.println("stack is empty ");
            return;
        }
        System.out.println("popped element: "+arr[top--]);
    }
    void peek(){
        if(isEmpty()){
            System.out.println("stack is empty ");
            return;
        }
        System.out.println("peek element: "+arr[top]);
    }
    void display(){
        for(int i = 0;i<=top;i++
        ){
            System.out.print(arr[i]+"  ");
        }
    }
}
