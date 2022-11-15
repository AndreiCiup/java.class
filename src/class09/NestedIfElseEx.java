package class09;

import java.util.Scanner;

public class NestedIfElseEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = scan.nextInt();
        System.out.println("Please enter your weight: ");
        double weight = scan.nextDouble();
        if (age >= 18) {
            if (weight > 50) {
                System.out.println("You are eligible for blood donation");
            } else {
                System.out.println("You are underweight. Please eat more and try again.");
            }
        } else {
            if (weight > 50) {
                System.out.println("You're underage");
            } else {
                System.out.println("You are not eligible for blood donation");
            }
        }
    }
}
