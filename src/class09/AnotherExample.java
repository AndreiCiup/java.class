package class09;

import java.util.Scanner;

public class AnotherExample {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your first number: ");
        double num1=scan.nextDouble();
        System.out.println("Please enter your second number: ");
        double num2=scan.nextDouble();
        System.out.println("Please enter your third number: ");
        double num3=scan.nextDouble();

        System.out.println("Let's see which number is greater");
        if (num1>num2){
            if(num1>num3){
                System.out.println(num1+" is the greatest number");
            }else if (num1==num3){
                System.out.println("num1 and num3 are equal. And therefore they are the greatest");
            }else{
                System.out.println(num3+" is the greatest");
            }
        }else if(num1<num2){
            if(num2>num3){
                System.out.println(num2+" is the greatest number");
            }else if(num2==num3){
                System.out.println("num2 and num3+ are equal. And therefore they are the greatest");
            }else{
            System.out.println(num3+" is the greatest");
        }
        }else{
            System.out.println("All numbers are equal");
        }

    }
}
