package Practice;

import java.util.Scanner;

public class MethodExample {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        printLineWithEqual();
        System.out.println("Welcome to the Calculator");
        printLineWithEqual();

        printLineWithPlus();
        System.out.println("Please enter first number: ");
        printLineWithPlus();
        int num1= scan.nextInt();
        printLineWithPlus();
        System.out.println("Please enter second number: ");
        printLineWithPlus();
        int num2= scan.nextInt();
        System.out.println(num1+num2+" is your result");

    }
    static void printLineWithEqual(){
        System.out.println("========================");
    }
    static void printLineWithPlus(){
        System.out.println("++++++++++++++++++++++++++");
    }
}
