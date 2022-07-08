package Graph;

public class GraphDemo {
    public static void main(String[] args) {
        Graph g1 = new Graph(5);
        g1.addedge(0,1);
        g1.addedge(0,4);
        g1.addedge(4,3);
        g1.addedge(1,2);
        g1.addedge(4,1);
        g1.addedge(3,2);
       // g1.display();
        //g1.bst(3);
        //System.out.println();
        //g1.dfs_t(3);
        g1.print();

    }
}
