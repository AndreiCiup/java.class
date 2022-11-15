package Practice;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= scan.nextInt();
        int rev=0;
        for(int i=1; i<=num; i++){
            rev=rev+num%10;
            num=num/10;
        }
        System.out.println(rev);
    }
}
