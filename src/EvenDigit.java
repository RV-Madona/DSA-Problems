public class EvenDigit {
    public static void main(String[] args) {
        int[] arr = {12, 4565, 78, 2345, 87, 8};
        int ans = Even(arr);
        System.out.println("No of even digits in Array is "+ ans);
    }

    static int Even(int[] arr) {
        int x;
        int count = 0;
        for(int i =0 ;i<arr.length; i++){
        x = noOfDigits(arr[i]);
        if(x % 2 == 0)
            count ++;
        }
       // int count1 = count;
        return count;
    }
    static int noOfDigits(int n){
        int count = 0;
        while(n>0){
          count ++;
          n = n / 10;
        }
        return count;
    }
}

