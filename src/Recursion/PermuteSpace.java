package Recursion;
import java.util.*;
public class PermuteSpace {
    public static void permute(int[] arr,boolean[] freq,List<Integer> ds,List<List<Integer>> ans){
        if(ds.size() == arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<arr.length;i++){
           if(!freq[i]){
               ds.add(arr[i]);
               freq[i]=true;
               permute(arr,freq,ds,ans);
               ds.remove(ds.size()-1);
               freq[i]=false;
           }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        boolean[] freq = new boolean[arr.length];
        List<Integer> ds = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        permute(arr,freq,ds,ans);
        System.out.println(ans);
    }
}
