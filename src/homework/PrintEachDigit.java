package homework;

import java.util.Scanner;

public class PrintEachDigit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num= scan.nextInt();
        while(num>0){
            System.out.println(num%10);
            num=num/10;
        }
    }
}
