package homework;

import java.util.Scanner;

public class HomeWorkClass08 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your number: ");
        double a= scan.nextDouble();
        if (a%5==0){
            System.out.println(a+" is divisible by 5");
        }else{
            System.out.println(a+" is not divisible by 5");
        }
    }
}