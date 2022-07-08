package Sorting_Technique;

import java.util.Arrays;

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] arr =  new int[] {5,4,1,7,6};
        System.out.println("Before Sorting: "+ Arrays.toString(arr));
        QuickSort.quickSort(arr,0,arr.length-1);
        System.out.println("After Sorting: "+ Arrays.toString(arr));
    }
}
