package homework;

public class PrintSumOf {
    public static void main(String[] args) {
        int num;
        int sum=0;
        for (num = 1; num <= 10; num++) {
            if (num % 3 == 0) {
                sum-=num;
            }else{
                sum+=num;
            }
            System.out.println(num);
        }
        System.out.println(num);
    }
}