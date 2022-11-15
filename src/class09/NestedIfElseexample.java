package class09;

import java.util.Scanner;

public class NestedIfElseexample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = scan.nextInt();
        System.out.println("Please enter your salary");
        double sal = scan.nextDouble();
        if (age >= 18) {
            if (sal < 5000) {
                System.out.println("Sorry, you need to work harder to get a credit card");
            } else if (sal >= 5000 && sal < 20000) {
                System.out.println("You are eligible for credit card.");
            } else {
                System.out.println("You can get a credit card on us)");
            }
        }else{
                System.out.println("you are too young to get a credit card");
            }
        }
    }
