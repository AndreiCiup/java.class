package class05;

import java.util.Scanner;

public class hw2928 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first word: ");
        String a=sc.nextLine();
        System.out.println("Enter the second word: ");
                String b=sc.nextLine(), c;
        c=a;
        a=b;
        b=c;
        System.out.println("The result of the swap is: ");
        System.out.println(a);
        System.out.println(b);

    }
}
