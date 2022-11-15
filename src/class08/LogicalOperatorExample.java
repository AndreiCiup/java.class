package class08;

import java.util.Scanner;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        double num1=scan.nextDouble();
        System.out.println("Please enter the second number: ");
        double num2=scan.nextDouble();
        System.out.println("Please enter the third number: ");
        double num3=scan.nextDouble();
        if (num1>num2 && num1>num3){
            System.out.println(num1+ " is the greatest number");
        }else if (num2>num1 && num2>num3){
            System.out.println(num2+ " is the greatest number");
        }else{
            System.out.println(num3+ " is the greatest number");
        }

    }
}
