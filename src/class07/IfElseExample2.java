package class07;

import java.util.Scanner;

public class IfElseExample2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int Age = scan.nextInt();
        if (Age >= 16) {
            System.out.println("You are eligible for driving license");
        } else {
            System.out.println("You are not eligible for driving license. Sorry(((");
        }
    }
}
