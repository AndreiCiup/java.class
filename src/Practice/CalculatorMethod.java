package Practice;

import java.util.Scanner;

public class CalculatorMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        printUnderscore(50);
        printUnderscore(5);
        int num1 = scan.nextInt();
        System.out.println("Please enter the second number: ");
        printUnderscore(50);
        int num2 = scan.nextInt();
        System.out.println("Please choose the operation");
        printUnderscore(5);
        String oper = scan.next();
        switch (oper) {
            case "add":
            case "Add":
                printAddition(num1, num2);
                break;
            case "sub":
            case "Sub":
                printSubtraction(num1, num2);
                break;
            case "mul":
            case "Mul":
                printMultiplication(num1, num2);
                break;
        }

    }

    static void printAddition(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    static void printSubtraction(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    static void printMultiplication(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    static void printUnderscore(int length) {
        int i;
        for (i = 0; i < length; i++) {
            System.out.print("_");
        }
    }
}
