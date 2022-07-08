public class Digits {
    public static void main(String[] args) {
        int num = 2345;
        int count = 0;
        float y;
        while(num > 0){
            count ++;
            num = num/10;
            y = num;
            System.out.println("Every time num value is "+ y);
        }
        System.out.println("No of digits in given number is "+count);

    }
}
