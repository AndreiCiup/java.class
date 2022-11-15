package homework;

import java.util.Scanner;

public class HM21004 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please insert the number of the month (1-12): ");
        int Month= scan.nextInt();
        if (Month == 1) {
            System.out.println("This month has 31 days");
        }else if ((Month == 3)){
        System.out.println("This month has 31 days");
        }else if ((Month == 5)){
            System.out.println("This month has 31 days");
        }else if ((Month == 7)){
            System.out.println("This month has 31 days");
        }else if ((Month == 8)){
            System.out.println("This month has 31 days");
        }else if ((Month == 10)){
            System.out.println("This month has 31 days");
        }else if ((Month == 12)){
            System.out.println("This month has 31 days");
        }else if(Month==4){
            System.out.println("This month has 30 days");
        }else if(Month==6){
            System.out.println("This month has 30 days");
        }else if(Month==9){
            System.out.println("This month has 30 days");
        }else if(Month==11){
            System.out.println("This month has 30 days");
        }else {
            System.out.println("This must be February. It could have 28 or 29 days");
        }
        }
    }

