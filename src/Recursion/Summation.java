package Recursion;

public class Summation {
    public int f(int n){           //paremeterized recurrsion
        if(n==1)
            return 1;
        int sum=0;
        return f1(n,sum);
    }
    public int f1(int n,int sum){  //paremeterized recurrsion
        if(n==1){
            return sum+1;
        }
        sum = sum+n;
        n=n-1;
        return f1(n,sum);
    }
    public int f2(int n){ // function recursion
        if(n==0)
            return 0;
        return n+f2(n-1);
    }
}
