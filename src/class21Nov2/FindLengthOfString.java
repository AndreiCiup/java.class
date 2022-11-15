package class21Nov2;

import java.util.Scanner;

public class FindLengthOfString {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter anything you want: ");
        String str= scan.nextLine();
        int length=0;
        for (int i=0; i<str.lastIndexOf("");i++){
            length=length+1;
        }
        System.out.println("The lenght of the string is: "+length);
    }
}
