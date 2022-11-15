package Practice;

public class Pattern2HW {
    public static void main(String[] args) {
        int num = 5;
        for (int i = num ; i >= 1; i--) {
            for (int s = num - i; s >= 1; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}