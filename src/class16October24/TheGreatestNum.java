package class16October24;

import java.util.Scanner;
public class TheGreatestNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scan.nextInt();
        int max=num%10;
        while (num > 0) {
            int lastDigit=num%10;
            if(max<lastDigit){
                max=lastDigit;
            }
            num = num / 10;
        }
        System.out.println(max);
    }
}

