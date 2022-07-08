package Sorting_Technique;

import java.util.Arrays;

public class DivideAndConquerDemo {
    public static void main(String[] args) {
        int[] arr = {3,5,1,2,9,3};
       System.out.println("MergeSort(Sorted) Array: "+Arrays.toString(DivideAndConquer.mergeSort(arr)));
       DivideAndConquer.mergeSortInPlace(arr,0, arr.length);
        System.out.println("MergeInPlace(sorted) Array: "+Arrays.toString(arr));
    }
}
