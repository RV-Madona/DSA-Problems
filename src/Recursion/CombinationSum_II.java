package Recursion;
import java.util.*;
public class CombinationSum_II {

    public static void findCombinations(int ind,int[] arr,int target,List<List<Integer>> ans,List<Integer> ds){

        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            System.out.println(ds);
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]) continue;
            if(arr[i] > target) break;

            ds.add(arr[i]);
            findCombinations(i+1,arr,target- arr[i],ans,ds);
            ds.remove(ds.size() -1);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2};
        int target = 4;
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0,arr,target,ans,new ArrayList<Integer>());
    }
}
