package Geeks;

public class KthSmallNum {
    public static void main(String[] args) {
        int[] arr = {7,10,4,20,15};

        int min=0,temp,ans=0,k=4;
        for(int i=0;i<arr.length-1;i++){
            min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int i=0;i<arr.length;i++){

            if(i==k-1){
                ans = arr[k-1];
            }
        }
       System.out.print(ans);
    }
}

