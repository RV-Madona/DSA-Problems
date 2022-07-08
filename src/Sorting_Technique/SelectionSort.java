package Sorting_Technique;

import java.util.Arrays;

public class SelectionSort {
    public static void sortInAscend(int[] arr){
        for(int i = 0;i<arr.length -1;i++){
            int min = i;
            for(int j= i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("After Sorting(Ascending): "+Arrays.toString(arr));
    }
    public static void sortInDescend(int[] arr){
        for(int i = 0;i<arr.length -1;i++){
            int max = i;
            for(int j= i+1;j<arr.length;j++){
                if(arr[j]>arr[max]){
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
        System.out.println("After Sorting(Descending): "+Arrays.toString(arr));
    }
}
