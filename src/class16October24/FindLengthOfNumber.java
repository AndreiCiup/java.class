package class16October24;

import java.util.Scanner;

public class FindLengthOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scan.nextInt();
        int i=0;
        while (num > 0) {
            num = num / 10;
           i++;
        }
            System.out.println(i);
    }
}
