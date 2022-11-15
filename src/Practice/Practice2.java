package Practice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("John, please introduce your age: ");
        int age1 = scan.nextInt();
        System.out.println("Alex, please introduce your age: ");
        int age2 = scan.nextInt();
        System.out.println("Jason, please introduce your age: ");
        int age3 = scan.nextInt();
        if (age1==age3 && age1==age2){
            System.out.println("All of you are the same age");
    }else if (age1>age2 && age1>age3){
            System.out.println("John is the oldest among you");
        }else if (age2>age3){
            System.out.println("Alex is the oldest among you");
        }else{
            System.out.println("Jason is the oldest among you");
        }
    }
}
