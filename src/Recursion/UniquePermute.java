package Recursion;

import java.util.*;

public class UniquePermute {
    public static void permute(int[] nums,boolean[] freq,List<Integer> ds,List<List<Integer>> ans){
        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(freq[i] || (i != 0 && nums[i] == nums[i-1] && freq[i-1])) continue;
            ds.add(nums[i]);
            freq[i]=true;
            permute(nums,freq,ds,ans);
            ds.remove(ds.size()-1);
            freq[i]=false;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        boolean[] freq = new boolean[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        permute(nums,freq,new ArrayList<Integer>(),ans);
        System.out.println(ans);
    }
}
