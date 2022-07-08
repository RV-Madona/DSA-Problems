package Searching_Apporach;

public class LinearSearchDemo {
    public static void main(String[] args) {
        int[] arr = new int[] {1,4,5,6,7};
        System.out.println(LinearSearch.find(arr,5));
        String name = "kathir" ;
        char ch =  'p';
        System.out.println(LinearSearch.contains(name,ch));

    }
}
