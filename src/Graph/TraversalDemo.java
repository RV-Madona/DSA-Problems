package Graph;

import java.util.ArrayList;

public class TraversalDemo {
    public static void main(String[] args) {
        Traversal t1 = new Traversal(7);
        t1.makeConn(1,2);
        t1.makeConn(2,7);
        t1.makeConn(7,6);
        t1.makeConn(6,4);
        t1.makeConn(2,4);
        t1.makeConn(3,5);
        //System.out.println(t1.bfs(7, t1.adj));
        /*System.out.println(t1.bfs_Cycle(7, t1.adj));
        System.out.println(t1.dfs_cycle(7, t1.adj));*/
        Traversal t2 = new Traversal(8);
        t2.makeConn(1,2);
        t2.makeConn(2,3);
        t2.makeConn(2,8);
        t2.makeConn(3,4);
        t2.makeConn(4,5);
        t2.makeConn(5,8);
        t2.makeConn(5,6);
        t2.makeConn(6,7);
        System.out.println(t2.isBipartite_d(8, t2.adj));


    }
}
