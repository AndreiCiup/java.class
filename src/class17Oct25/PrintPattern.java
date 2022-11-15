package class17Oct25;

import java.util.Scanner;

public class PrintPattern {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num= scan.nextInt();
        for(int i=1; i<=num/2+1; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("A");
            }
            System.out.println();
        }
        for(int i=1; i<=num/2+1; i++){

            for(int j=num/2; j>=i ; j--){
                System.out.print("A");
            }
            System.out.println();
        }
    }
}
