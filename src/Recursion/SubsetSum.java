package Recursion;

import java.util.*;

public class SubsetSum {

    public static void findSum(int ind,int[] arr,int s,List<Integer> sum){
        if(ind == arr.length){
            sum.add(s);
            return;
        }
        findSum(ind+1,arr,s+arr[ind],sum);
        findSum(ind+1,arr,s,sum);
    }
    public static void main(String[] args) {
        int[] arr={3,1,2};
        int ind=0;
        int s=0;
        List<Integer> sum = new ArrayList<>();
        //List<List<Integer>> ds = new ArrayList<>();
        findSum(ind,arr,s,sum);
        Collections.sort(sum);
        System.out.println(sum);
    }
}
