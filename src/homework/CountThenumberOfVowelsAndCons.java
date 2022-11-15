package homework;

import java.util.Scanner;

public class CountThenumberOfVowelsAndCons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String str = scan.nextLine();
        int vowels = 0;
        int cons = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                ++vowels;
            } else if ((ch >= 'a' && ch <= 'z')) {
                ++cons;
            }
        }
        System.out.println("Number of vowels in the string is: " + vowels);
        System.out.println("Number of consonants in the string is: " + cons);
    }
}
