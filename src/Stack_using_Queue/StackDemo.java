package Stack_using_Queue;

public class StackDemo {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(5);
        s1.push(2);
        s1.push(6);
        s1.push(8);
        s1.push(5);
        s1.display();
        System.out.println("popped data: "+s1.pop());
        System.out.println("popped data: "+s1.pop());
        System.out.println("popped data: "+s1.pop());
        System.out.println("popped data: "+s1.pop());
    }
}
