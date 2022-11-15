package homework;

import java.util.Scanner;

public class RemoveAllTheSpaces {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String str=scan.nextLine();
        String str1=str.replace(" ", "");
        System.out.println(str1);

    }
}
