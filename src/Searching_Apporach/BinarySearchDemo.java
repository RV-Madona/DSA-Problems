package Searching_Apporach;

import java.util.Arrays;

public class BinarySearchDemo {

    public static void main(String[] args) {
        int[] a= {3,9,10,20,17,5,1};
        int[] arr = BinarySearch.sort(a);
        System.out.println(Arrays.toString(arr));
        BinarySearch.binarySearch(arr,1);

    }

    }
