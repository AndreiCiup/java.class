package homework;

import java.util.Scanner;

public class HomeWork1017 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first number: ");
        int num1 = scan.nextInt();
        System.out.println("Please enter your second number: ");
        int num2 = scan.nextInt();
        System.out.println("Please enter your third number: ");
        int num3 = scan.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("The greatest number is: " + num1);
            printReverseMax(num1);
        } else if (num2 > num3) {
            System.out.println("The greatest number is: " + num2);
            printReverseMax(num2);
        } else {
            System.out.println("The greatest number is: " + num3);
            printReverseMax(num3);
        }
    }

    static int printReverseMax(int num) {
        int rev = 0;

        int lastDigit = num % 10;

        rev = rev * 10 + lastDigit;
        num = num / 10;
        lastDigit = num % 10;
        rev = rev * 10 + lastDigit;
        num = num / 10;
        lastDigit = num % 10;
        rev = rev * 10 + lastDigit;
        num = num / 10;
        System.out.println("The reverse value of the greatest number is: "+rev);
return rev;
    }
}
