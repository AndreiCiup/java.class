package homework;

import java.util.Scanner;

public class NewHM1004 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your number: ");
        double num= scan.nextDouble();
        if (num<0){
            System.out.println(num+" is a negative number");
        }else if(num>0){
            System.out.println(num+" is a positive number");
        }else{
            System.out.println(num+" is equal to zero");
        }
    }
}
