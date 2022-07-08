package Sorting_Technique;

import java.util.Arrays;

public class DivideAndConquer {
    public static int[] mergeSort(int[] arr){
        if(arr.length == 1) {
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    public static int[] merge(int[] first,int[] second){
        int[] joined = new int[first.length + second.length];
        int i =0,j=0,k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                joined[k++] = first[i++];
            }
            else{
                joined[k++] =second[j++];
            }
        }
        while(i< first.length){
            joined[k++] = first[i++];
        }
        while(j < second.length){
            joined[k++]= second[j++];
        }
        return joined;
    }
    public static void mergeSortInPlace(int[] arr,int start,int end){
        if(end - start == 1)
            return ;

        int mid = (start+end) / 2;

        mergeSortInPlace(arr,start,mid);
        mergeSortInPlace(arr,mid,end);
        mergeInplace(arr,start,end,mid);

    }
    public static void mergeInplace(int[] arr,int start,int end,int mid){
        int[] joined = new int[end -start];
        int i =start,j=mid,k=0;
        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                joined[k++] = arr[i++];
            }
            else{
                joined[k++] =arr[j++];
            }
        }
        while(i< mid){
            joined[k++] = arr[i++];
        }
        while(j < end){
            joined[k++]= arr[j++];
        }
        for(k=0;k<joined.length;k++){
            arr[start+k] = joined[k];
        }
        //System.out.println("MergeInPlace(sorted) Array: "+Arrays.toString(arr));
    }
}
