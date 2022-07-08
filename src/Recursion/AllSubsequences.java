package Recursion;
import java.util.ArrayList;

public class AllSubsequences {

   public static void f(int index, ArrayList<Integer> list,int[] arr,int n){
      if(index == n){
         System.out.println(list);
         return;
      }
          list.add(arr[index]);
          f(index + 1, list, arr, n);
          list.remove(list.size() - 1);
          f(index + 1, list, arr, n);

   }
   public static void main(String[] args){
       int[] arr={3,1,2};
       int n= arr.length;
       System.out.println(n);
       AllSubsequences s1 = new AllSubsequences();
       ArrayList<Integer> list = new ArrayList<>();
       f(0,list,arr,n);
   }
}
