package class11;

import java.util.Scanner;

public class IfvsSW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number (1-5): ");
        int num = scan.nextInt();
        if (num == 1) {
            System.out.println("One");
        } else if (num == 2) {
            System.out.println("Two");

        } else if (num == 3) {
            System.out.println("Three");
        } else if (num == 4) {
            System.out.println("Four");
        } else if (num == 5) {
            System.out.println("Five");


        } else {
            System.out.println("Please enter a number between 1 and 5");
        }
    }
}
