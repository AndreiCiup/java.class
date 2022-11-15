package class21Nov2;

import java.util.Scanner;

public class FindREverseOfGivenString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter anything you want: ");
        String str = scan.nextLine();
        String rev = "";
        for (int i = str.length(); i > 0; i--) {
            rev = rev + str.charAt(i-1);
           
        }
            System.out.println("The reverse of anything you want is: "+rev);
        }
}
