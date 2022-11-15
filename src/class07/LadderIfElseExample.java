package class07;

import java.util.Scanner;

public class LadderIfElseExample {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter any day of the week(0-6): ");
        int dayOfWeek= scan.nextInt();

        if(dayOfWeek==0){
            System.out.println("Sunday");
        }else if(dayOfWeek==1){
            System.out.println("Monday");
        }else if(dayOfWeek==2){
            System.out.println("Tuesday");
        }else if(dayOfWeek==3) {
            System.out.println("Wednsday");
        }else if(dayOfWeek==4){
                System.out.println("Thursday");
        }else if(dayOfWeek==5){
            System.out.println("Friday");
        }else if(dayOfWeek==6) {
            System.out.println("Saturday");
        }else{
            System.out.println("Please insert only numbers from 0 to 6");
        }
    }
}
