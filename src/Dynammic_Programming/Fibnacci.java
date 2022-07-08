package Dynammic_Programming;

import java.util.Arrays;

public class Fibnacci {
    int[] dp;

    Fibnacci(int val){
        dp = new int[val+1];
        Arrays.fill(dp,-1);
    }

    public int fib(int n){
        if(n<=1)
            return n;
        if(dp[n]!=-1)
            return dp[n];
        return dp[n] = fib(n-1)+fib(n-2);
    }
    public void tfib(int n){
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);
    }
    public void sfib(int n){
        int prev2=0,prev=1;
        int sum=0;
        for(int i=2;i<=n;i++){
            sum=prev2+prev;
            prev2=prev;
            prev=sum;
        }
        System.out.println(prev);
    }
}
