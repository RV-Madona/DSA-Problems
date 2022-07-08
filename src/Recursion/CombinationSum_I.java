package Recursion;
import java.util.*;

public class CombinationSum_I {
    public static void findCombinations(int ind,int[] arr,int target,List<List<Integer>> ans,List<Integer> ds){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            System.out.println(ds);
            return;
        }
        if(ind == arr.length){
            return;
        }
        if(arr[ind]<=target){
            ds.add(arr[ind]);
            findCombinations(ind,arr,target - arr[ind],ans,ds);
            ds.remove(ds.size()-1);
        }
        findCombinations(ind+1,arr,target,ans,ds);
    }
    public static void main(String[] args) {
        int[] arr={2,3,6,7};
        int target = 7;
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0,arr,target,ans,new ArrayList<Integer>());
    }
}
