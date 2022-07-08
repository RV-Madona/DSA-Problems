package Graph;


import java.util.*;
public class Traversal {
    public  class Node{
        int first;
        int second;
        Node(int f,int s){
            first=f;
            second=s;
        }
    }
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    Traversal(int v){
        for(int i=1;i<=v+1;i++){
            adj.add(new ArrayList<>());
        }
    }
    public void makeConn(int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public ArrayList<Integer> bfs(int v,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[v+1];
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=v;i++){
            if(!vis[i]){
                q.add(i);
                vis[i] = true;
                while(!q.isEmpty()){
                    int node = q.poll();
                    ans.add(node);
                    for(Integer av: adj.get(node)){
                        if(!vis[av]){
                            q.add(av);
                            vis[av]=true;
                        }
                    }
                }
            }

        }
        return ans;
    }
    public boolean isCycle(int s,boolean[] vis,ArrayList<ArrayList<Integer>> adj){
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(s,-1));
        vis[s]=true;
        while(!q.isEmpty()){
            int node = q.peek().first;
            int par = q.peek().second;
            q.remove();
            for(Integer av:adj.get(node)){
                if(!vis[av]){
                    q.add(new Node(av,node));
                    vis[av]=true;
                }
                else if(av != par) return true;
            }
        }
        return false;

    }
    public Boolean bfs_Cycle(int v,ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[v+1];
        for(int i=1;i<=v;i++) {
            if (!vis[i]) {
                if (isCycle(i, vis, adj)) {
                    return true;
                }
            }
        }
        return false;
    }
    public void dfs_recur(int i,boolean[] vis,ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> adj){
        ans.add(i);
        vis[i]=true;
        for(Integer av: adj.get(i)){
            if(!vis[av]){
                dfs_recur(av,vis,ans,adj);
            }

        }
    }
    public ArrayList<Integer> dfs(int v,ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[v+1];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1;i<=v;i++){
            if(!vis[i]){
                dfs_recur(i,vis,ans,adj);
            }
        }
        return ans;
    }
    public boolean isCycleDfs(int node,int parent,boolean[] vis,ArrayList<ArrayList<Integer>> adj){
        vis[node]=true;
        for(Integer av: adj.get(node)){
            if(!vis[av]){
               if(isCycleDfs(av,node,vis,adj)) return true;
            }
            else if(av != parent) return true;
        }
        return false;
    }
    public boolean dfs_cycle(int v,ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[v+1];
        for(int i=1;i<=v;i++){
            if(!vis[i]){
                if(isCycleDfs(i,-1,vis,adj)) return true;
            }
        }
        return false;
    }
    public boolean isBibartite(int v,ArrayList<ArrayList<Integer>> adj){
      int[] vis = new int[v+1];
      Arrays.fill(vis,-1);
      Queue<Integer> q = new LinkedList<>();
      q.add(1);
      vis[1]=0;
      while(!q.isEmpty()){
          int node = q.poll();
          for(Integer av: adj.get(node)){
              if(vis[av] == -1){
                  q.add(av);
                 //vis[av]=1-vis[node];
                  if(vis[node] == 0) vis[av]=1;
                  else if(vis[node] == 1) vis[av]=0;
              }
              else if(vis[av] == vis[node]){
                  return false;
              }
          }
      }
      return true;
    }

    public boolean dfs_bi(int node,int color,int[] vis,ArrayList<ArrayList<Integer>> adj){
        vis[node]=color;
        for(Integer av:adj.get(node)){
            if(vis[av]== -1){
                vis[av]=1-vis[node];
                if(!dfs_bi(av,vis[av],vis,adj)) return false;
            }
            else if(vis[av] == vis[node]) return false;
        }
        return true;
    }
    public boolean isBipartite_d(int v,ArrayList<ArrayList<Integer>> adj){
        int[] vis = new int[v+1];
        Arrays.fill(vis,-1);
        for(int i=1;i<=v;i++){
            if(vis[i] == -1){
                if(!dfs_bi(i,0,vis,adj)) return false;
            }
        }
        return true;
    }
}
