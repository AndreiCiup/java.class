package homework;

import java.util.Scanner;

public class Switch1012 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number between 0-6: ");
        int day= scan.nextInt();
        String x;
        switch(day){
            case 0:
                x="Sunday";
                break;
            case 1:
                x="Monday";
                break;
            case 2:
                x="Tuesday";
                break;
            case 3:
                x="Wednesday";
                break;
            case 4:
                x="Thursday";
                break;
            case 5:
                x="Friday";
                break;
            case 6:
                x="Saturday";
                break;
            default:
                x="Your number must have been out of the range";
        }
        System.out.println(x);
    }
}
