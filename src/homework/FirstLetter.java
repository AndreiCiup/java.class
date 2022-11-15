package homework;

import java.util.Scanner;

public class FirstLetter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" Please enter your full name: ");
        String name= scan.nextLine();
        char space=' ';
        for (int i=0; i<name.length(); i++){
            if (name.charAt(i)==space){
                System.out.println(name.charAt(0)+"."+name.charAt(i+1)+".");
            }
        }
    }
}
