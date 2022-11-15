package class07;

import java.util.Scanner;

public class IfLadderExample {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Mark, please enter your mark in order to get the grade: ");
        double a= scan.nextDouble();
        if(96<=a && a<=100){
            System.out.println("A+");
        }else if (80<=a && a<=89){
            System.out.println("A");
        }else if (70<=a && a<=79) {
            System.out.println("B+");
        }else if (60<=a && a<=69) {
            System.out.println("B");
        }else if (50<=a && a<=59) {
            System.out.println("C+");
        }else if (40<=a && a<=49) {
            System.out.println("C");
        }else{
            System.out.println("Fail(((");
        }

    }
}
