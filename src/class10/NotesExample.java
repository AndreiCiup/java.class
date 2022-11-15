package class10;
import java.util.Scanner;
public class NotesExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int amount = scan.nextInt();
        if (amount / 100 > 0) {
            System.out.println(amount / 100 + " notes of 100");
            amount = amount % 100;
            if (amount / 20 > 0) {
                System.out.println(amount / 20 + " notes of 20");
                amount = amount % 20;
            } else {
                System.out.println(0 + " notes of 20");
            }
            if (amount / 10 > 0) {
                System.out.println(amount / 10 + " notes of 10");
                amount = amount % 10;
            } else {
                System.out.println(0 + " notes of 10");
            }

            if (amount / 5 > 0) {
                System.out.println(amount / 5 + " notes of 5");
            } else {
                System.out.println(0 + " notes of 5");
            }

        } else {
            System.out.println(0 + " notes 100");
            amount = amount % 100;
            if (amount / 20 > 0) {
                System.out.println(amount / 20 + " notes of 20");
                amount = amount % 20;
            } else {
                System.out.println(0 + " notes of 20");
            }
            if (amount / 10 > 0) {
                System.out.println(amount / 10 + " notes of 10");
                amount = amount % 10;
            } else {
                System.out.println(0 + " notes of 10");
            }
            if (amount / 5 > 0) {
                System.out.println(amount / 5 + " notes of 5");
            } else {
                System.out.println(0 + " notes of 5");
            }


        }
    }
}
