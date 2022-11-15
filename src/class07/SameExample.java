package class07;

import java.util.Scanner;

public class SameExample {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Mark, please enter your mark in order to get the grade: ");
        double a= scan.nextDouble();
        if(a>=90){
            System.out.println("A+");
        }else if (a>=80){
            System.out.println("A");
        }else if (a>=70) {
            System.out.println("B+");
        }else if (a>=60) {
            System.out.println("B");
        }else if (a>=50) {
            System.out.println("C+");
        }else if (a>=40) {
            System.out.println("C");
        }else{
            System.out.println("Fail(((");
        }

    }
}
