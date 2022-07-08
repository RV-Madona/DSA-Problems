package Recursion;
import java.util.*;
public class UniqueSubset {
    public static void findSubset(int ind,int[] arr,List<Integer> ds,List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));
        for(int i= ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]) continue;
            ds.add(arr[i]);
            findSubset(i+1,arr,ds,ans);
            ds.remove(ds.size()-1);
        }
    }
    public static void main(String[] args) {
        int[]  arr = {1,2,2};
        List<Integer> ds = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        findSubset(0,arr,ds,ans);
        System.out.println(ans);
    }
}
