package class08;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        double num1=scan.nextDouble();
        System.out.println("Please enter the second number: ");
        double num2=scan.nextDouble();

        System.out.println("please choose your operation (1-4): ");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int operation= scan.nextInt();
        if(operation==1){
            System.out.println("the result is: "+(num1+num2));
        }else if (operation==2){
            System.out.println("the result is: "+(num1-num2));
        }else if (operation==3){
            System.out.println("the result is: "+num1*num2);
        }else if (operation==4){
            System.out.println("the result is: "+num1/num2);
        }else if (operation>4){
            System.out.println("you need to choose between 1-4");
        }else{
            System.out.println("you need to choose between 1-4");
        }
    }
}
