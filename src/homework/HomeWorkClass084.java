package homework;

import java.util.Scanner;

public class HomeWorkClass084 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Let's check if the given character is a vowel or not!");
        System.out.println("Please enter your character: ");
        char chr=scan.next().charAt(0);
        if (chr=='a' || chr=='e' || chr=='i' ||chr=='o' || chr=='u' || chr=='A' || chr=='E' || chr=='I' ||chr=='O' || chr=='U'){
            System.out.println("Character is a vowel");
        }else{
            System.out.println("The Character is not a vowel");
        }

    }
}
