package Graph;

import java.util.*;


public class Graph {
    ArrayList<ArrayList<Integer>> adjlist = new ArrayList<>();
    Graph(int val){
        for(int i=0;i<val;i++){
            adjlist.add(new ArrayList<>());
            System.out.println(adjlist.get(i));
        }
    }
    public void addedge(int u,int v){
        adjlist.get(u).add(v);
        adjlist.get(v).add(u);
    }
    public void display(){
        for(int i=0;i<adjlist.size();i++){
            System.out.print(i+": ");
            for(int j=0;j<adjlist.get(i).size();j++){
                System.out.print(" "+ adjlist.get(i).get(j));
            }
            System.out.println();
        }
    }
    public void bst(int v){
        int size = adjlist.size();
        boolean[] visited = new boolean[size];
        visited[v]=true;

        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        while(q.size()!=0){
           int vertex = q.remove();
           System.out.print(vertex+" ");
           for(int i=0;i<adjlist.get(vertex).size();i++){
               int av = adjlist.get(vertex).get(i);
               if(!visited[av]){
                   q.add(av);
                   visited[av]=true;
               }
           }


        }
    }
    public void dfs_t(int v){
        int size= adjlist.size();
        boolean[] visited = new boolean[size];
        dfs(v,visited);
    }
    public void dfs(int v,boolean[] visited){
        visited[v]=true;
        System.out.print(v+" ");

        for(int i=0;i<adjlist.get(v).size();i++){
            int av = adjlist.get(v).get(i);
            if(!visited[av]){
                dfs(av,visited);
            }
        }
    }
    public void print(){

        System.out.println(printGraph(0,adjlist));
    }
    public static ArrayList<ArrayList<Integer>> printGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<adj.size();i++){
            ArrayList<Integer> l = new ArrayList<>();
            for(int j=0;j<adj.get(i).size();j++){
                l.add(adj.get(i).get(j));
            }
            list.add(l);
        }
        return list;
    }
}
