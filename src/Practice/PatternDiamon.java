package Practice;

import java.util.Scanner;

public class PatternDiamon {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number: ");
        int num= scan.nextInt();
        for (int i=1; i<=num; i++ ) {
            for (int s = 1; s <= num - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("A");
            }
            System.out.println();
        }
        for(int i=num-1; i>=1; i--){
            for (int s=num-i; s>=1; s--){
                System.out.print(" ");
            }
            for (int j=i*2-1; j>=1; j--){
                System.out.print("A");
            }
            System.out.println();
        }


    }
}
