package Practice;

public class Pattern5HW {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int s = 5 - i; s >= 1; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i % 2 != 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int s = i; s <= 4; s++) {
                System.out.print(" ");
            }
            for (int j = 2 * i - 1; j >= 1; j--) {
                if (i % 2 != 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}