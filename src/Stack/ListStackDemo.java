package Stack;

public class ListStackDemo {
    public static void main(String[] args) {
        ListStack stack = new ListStack();
       System.out.println(stack.peek());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.display();
    }
}
