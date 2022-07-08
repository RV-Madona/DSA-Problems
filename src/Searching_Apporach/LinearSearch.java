package Searching_Apporach;

public class LinearSearch {
    public static int find(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target)
                return i;

        }
        return -1;
    }

    public static  boolean contains(String name,char ch){
        for(int i=0;i<name.length();i++){
            if(name.charAt(i) == ch)
                return true;
        }
        return  false;
    }
}
