package homework;

import java.util.Scanner;

public class HomeWork10172 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int num= scan.nextInt();
        printOddEven(num);

    }
    static void printOddEven(int num){
        if (num%2==0){
            System.out.println(num+" is even");
        }else{
            System.out.println(num+" is odd");
        }
    }
}
