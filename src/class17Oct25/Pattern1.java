package class17Oct25;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int s = 1; s <= num - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("A");
            }
            for (int s = num; s <= num - i - 1; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("A");
            }

            System.out.println();
        }
        for (int i = 1; i <= num-i; i++) {
            for (int s = num; s <= num - i - 1; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("A");
            }
            for (int s = 1; s <= num - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("A");
            }

            System.out.println();
        }
    }
}
