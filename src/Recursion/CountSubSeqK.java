package Recursion;

public class CountSubSeqK {
    public static int count(int index,int[] arr,int sum,int s,int n){
        if(index==n){
            if(s==sum)
                return 1;
            else
                return 0;
        }
        s+=arr[index];
        int l=count(index+1,arr,sum,s,n);
        s-=arr[index];
        int r= count(index+1,arr,sum,s,n);
        return l+r;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,1};
        int sum=2;
        int s=0;
        int n= arr.length;
        System.out.println(count(0,arr,sum,s,n));
    }
}
