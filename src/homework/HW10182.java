package homework;

import java.util.Scanner;

public class HW10182 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        double num1= scan.nextDouble();
        System.out.println("Please enter the second number: ");
        double num2= scan.nextDouble();
        System.out.println("Please enter the third number: ");
        double num3= scan.nextDouble();
        System.out.println("Please enter the fourth number: ");
        double num4= scan.nextDouble();
        System.out.println("The greatest number is: "+findTheGreatest(num1,num2,num3,num4));
    }
    static double findTheGreatest(double a, double b, double c, double d){
        if (a>b && a>c && a>d){
            return a;
        } else if (b>c && b>d) {
            return b;
        } else if (c>d) {
            return c;
        }else{
            return d;

        }

    }
}
