package Sorting_Technique;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] arr){
        System.out.println("UnSorted Array: "+Arrays.toString(arr));
    for(int i=1;i<arr.length;i++){
        for(int j=i;j>0;j--){
            if(arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
            else{
                break;
            }
        }
    }
    System.out.println("Sorted Array: "+ Arrays.toString(arr));
    }
}
