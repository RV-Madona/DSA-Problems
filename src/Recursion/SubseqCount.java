package Recursion;
import java.util.*;
public class SubseqCount {
    public static int findCount(int ind,int[] arr,List<Integer> ds,List<List<Integer>> ans){
        if(ind == arr.length){
           ans.add(new ArrayList<>(ds));
            return 1;
        }
        ds.add(arr[ind]);
        int l=findCount(ind+1,arr,ds,ans);
        ds.remove(ds.size()-1);
        int r=findCount(ind+1,arr,ds,ans);
        return l+r;
    }
    public static void main(String[] args) {
        int[] arr ={4,4,4,1,4};
        List<Integer> ds = new ArrayList<Integer>();
        List<List<Integer>> ans = new ArrayList<>();
        findCount(0,arr,ds,ans);
        System.out.println(ans);
    }
}
