package homework;

import java.util.Scanner;

public class CheckIfPalendrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str= scan.nextLine();
        str=str.toLowerCase();
        str=str.replace(" ", "");
        String rev="";
        for (int i= str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if (str.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
