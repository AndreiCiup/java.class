package Practice;

import java.util.Scanner;

public class EthereumPattern2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number ");
        int num= scan.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("A");
            }
            System.out.println();
        }
        for (int i=num/2; i>0; i--) {
            for (int j = 1; j < num + 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("A");
            }
        }
             System.out.println();
    }
}
