package Recursion;

import java.util.Arrays;

public class ReverseAnArray {
    public static void rev(int l, int r, int[] arr){
        if(l>=r){
            System.out.println(Arrays.toString(arr));
            return;
        }
        int temp = arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        rev(l+1,r-1,arr);
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        int l=0,r=arr.length-1;
        ReverseAnArray.rev(l,r,arr);
    }
}
