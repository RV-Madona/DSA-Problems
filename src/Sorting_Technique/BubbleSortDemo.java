package Sorting_Technique;

import java.util.Arrays;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{8,6,9,1,5};
        System.out.println("Before Sorting: "+ Arrays.toString(arr));
        BubbleSort.sort(arr);
        BubbleSort.ownSort(arr);
    }
}
