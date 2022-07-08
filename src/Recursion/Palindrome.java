package Recursion;

public class Palindrome {
    public static boolean f(int i, String s1) {
        if (i >= s1.length()/ 2) {
            return true;
        }
        if (s1.charAt(i) != s1.charAt((s1.length()) -i-1)) {
            return false;
        }
        return f(i + 1, s1);
    }
    public static void main(String[] args) {
        String s1="mam";
       // int n= s1.length();
        int i=0;
       System.out.println(f(i,s1));
    }
}
