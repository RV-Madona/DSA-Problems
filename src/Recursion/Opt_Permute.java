package Recursion;

import java.util.*;


public class Opt_Permute {
    public static void permute(int ind,int[] nums,List<List<Integer>> ans){
        if(ind == nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<nums.length;i++){
            swap(i,ind,nums);
            permute(ind+1,nums,ans);
            swap(i,ind,nums);
        }
    }
    public static void swap(int i,int j,int[] nums){
        int t = nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public static void main(String[] args) {
        int[] arr ={1,1,2};
        List<List<Integer>> ans = new ArrayList<>();
        permute(0,arr,ans);
        System.out.println(ans);
    }
}
