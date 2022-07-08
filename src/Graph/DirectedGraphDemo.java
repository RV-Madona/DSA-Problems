package Graph;

public class DirectedGraphDemo {
    public static void main(String[] args) {
        DirectedGraph g1  = new DirectedGraph(9);
        g1.insertNode(1,2);
        g1.insertNode(2,3);
        g1.insertNode(3,4);
        g1.insertNode(4,5);
        g1.insertNode(6,5);
        g1.insertNode(7,8);
        g1.insertNode(7,2);
        g1.insertNode(8,9);
        g1.insertNode(9,7);
        g1.display();
    }
}
