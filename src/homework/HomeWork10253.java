package homework;

import java.util.Scanner;

public class HomeWork10253 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the amount of money you have: ");
        int bill = scan.nextInt();
        int notes100, notes20, notes10, notes5;
        if (bill / 100 > 0) {
            notes100 = bill / 100;
            System.out.println("You have: " + notes100 + " notes of 100");
            if (bill % 100 > 0) {
                notes20 = (bill - notes100 * 100) / 20;
                System.out.println("You have: " + notes20 + " notes of 20");
                if (bill % 20 > 0) {
                    notes10 = (bill - notes100 * 100 - notes20 * 20) / 10;
                    System.out.println("You have: " + notes10 + " notes of 10");
                    if (bill % 10 > 0) {
                        notes5 = (bill - notes100 * 100 - notes20 * 20 - notes10 * 10) / 5;
                        System.out.println("You have: " + notes5 + " notes of 5");
                    } else {
                        System.out.println("You have 0 notes of 5");
                    }
                } else {
                    System.out.println("You have 0 notes of 10");
                }
            } else {
                System.out.println("You have 0 notes of 20");
            }
        } else {
            notes100 = 0;
            System.out.println("You have: " + notes100 + " notes of 100");
            if (bill % 100 > 0) {
                notes20 = (bill - notes100 * 100) / 20;
                System.out.println("You have: " + notes20 + " notes of 20");
                if (bill % 20 > 0) {
                    notes10 = (bill - notes100 * 100 - notes20 * 20) / 10;
                    System.out.println("You have: " + notes10 + " notes of 10");
                    if (bill % 10 > 0) {
                        notes5 = (bill - notes100 * 100 - notes20 * 20 - notes10 * 10) / 5;
                        System.out.println("You have: " + notes5 + " notes of 5");
                    } else {
                        System.out.println("You have 0 notes of 5");
                    }
                } else {
                    System.out.println("You have 0 notes of 10");
                }
            } else {
                System.out.println("You have 0 notes of 20");
            }
        }
    }
}