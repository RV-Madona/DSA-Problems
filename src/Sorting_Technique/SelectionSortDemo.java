package Sorting_Technique;

import java.util.Arrays;

public class SelectionSortDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 6, 9, 1};
        System.out.println("Before Sorting: "+ Arrays.toString(arr));
        SelectionSort.sortInAscend(arr);
        SelectionSort.sortInDescend(arr);
    }
}