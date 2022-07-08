package Sorting_Technique;

public class Recursion {
    public static  int pow(int a,int n){
        if(n == 1)
            return a;
        else{
            return a*pow(a,n-1);
        }
    }
    public static int fib(int n){
        if(n == 1)
            return 1;
        else if(n == 2) {
            return 1;
        }
        else if (n==0){
            System.out.println("Not exist");
        }
        else{
            return fib(n-1) + fib(n-2);
        }
        return -1;
    }
}
