package Searching_Apporach;

import java.util.Arrays;

public class BinarySearch {
    public static int[] sort(int[] arr) {
        int min =0;
        for(int i=0;i<arr.length-1;i++){
            min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[min] )
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] =temp;
        }

        return arr;
    }

    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean asc = false;
        if (arr[start] < arr[end])
            asc = true;
        int mid;
        if (asc) {
            while (start <= end) {
                mid = (start + end) / 2;
                if (target > arr[mid])
                    start = mid + 1;
                else if (target < arr[mid])
                    end = mid - 1;
                else
                    return mid;
            }

        }
        else{
            while (start <= end) {
                mid = (start + end) / 2;
                if (target > arr[mid])
                    end = mid -1;
                else if (target < arr[mid])
                   start = mid +1;
                else
                    return mid;
            }
        }
        return -1;
    }
    public static int solve(int[] A, int B) {
        int max = A[0];
        int index = 0;
        for(int i=1;i<A.length;i++){
            if(max < A[i]) {
                index = i;
                max = A[i];
            }
        }
        if(A[index] == B){
            return index;
        }
            int start1=0,end1 = index -1,mid1 =0;
            System.out.println("start1: "+start1);
            System.out.println("end1: "+end1);
            while(start1<=end1){
                mid1 = (start1+end1) / 2;
                if(B>A[mid1])
                    start1 = mid1+1;
                else if(B <A[mid1])
                    end1 =mid1 - 1;
                else
                    return mid1;
            }
            int start2 = index+ 1,end2 = A.length -1,mid2 =0;
            System.out.println("start2: "+start2);
            System.out.println("end2: "+end2);
            while(start2<=end2) {
                mid2 = (start2 + end2) / 2;
                if (B > A[mid2])
                    end2 = mid2 - 1;
                else if (B < A[mid2])
                    start2 = mid2 + 1;
                else
                    return mid2;
            }
        return -1;
    }
    public static void binarySearch(int[] arr,int target){
        int flag = 0,pos = 0;
        int start = 0;
        int end = arr.length-1;
        int mid=0;
        while(start<=end){
            mid = (start+end)/2;
            if(target < arr[mid]) {
                end = end - 1;
            }
            else if(target > arr[mid]) {
                start = start + 1;
            }
            else {
                flag = 1;
                pos = mid;
                break;
            }
        }
        if(flag == 1){
            System.out.println(target+" found at pos: "+pos);
        }
        else{
            System.out.println("Target Not found.");
        }
    }
}
