package Graph;
import java.util.*;

public class DirectedGraph {
    ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
    DirectedGraph(int val){
        for(int i=1;i<=val;i++){
            adj.add(new ArrayList<>());
        }
    }
    public void insertNode(int u,int v){
        adj.get(u).add(v);
    }
    public void display(){
        for(int i=0;i< adj.size();i++){
            System.out.print(i+": ");
            for(int j=0;i<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
