package Sorting_Technique;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    //swapped = true;
                }
            }
            if (!swapped) {
                break;

            }
            System.out.println("Sorted Array: " + Arrays.toString(arr));
        }
    }
    public static  void ownSort(int[] arr){
        int pass,size = arr.length-1;
        for( pass= 1;pass <=arr.length -1;pass++){
            int i = 0;
            int j = i+1;
            while(i<=size -1 && j<=size){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                i++;
                j++;
            }
            size = size - 1;
        }
        System.out.println("Sorted Array(ownSort): "+Arrays.toString(arr));
    }
}
